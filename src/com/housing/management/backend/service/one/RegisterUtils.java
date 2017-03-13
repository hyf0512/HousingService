package com.housing.management.backend.service.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.security.cert.Certificate;

public class RegisterUtils {

	public static String url_text="http://ceshi.allinpay.com/usercenter/merchant/UserInfo/reg.do";
	public static String url_real="https://service.allinpay.com/usercenter/merchant/UserInfo/reg.do";
	
	//public static String 
	//测试商户号：008310107420024
	//测试用户编号：201604291001305  userid
    public final static String signType="1";//  8个
    public final static String merchantId="008310107420024";
    public final static String partnerUserId="008310107420024";//
    public  static String userName="";//公钥
    public final static String pidType="";//
    public  static String pidCode="";//公钥
    public  static String signMsg="";//
	
    
    //返回的结果 都不可以为空
    public final static String signType_back="1";//  8个
    public final static String merchantId_back="008310107420024";
    public final static String userId="";//
    public final static String resultCode="";//
    public final static String returnDatetime="";//
    public  static String signMsg_back="";//
    
    public static String getSignSrc()
    {   //userName pidType pidCode
    	String result="";
    	result="signType="+signType+
    			"&merchantId="+merchantId+
    			"&partnerUserId="+partnerUserId+
    			"&userName="+userName+
    			"&pidType="+pidType+
    			"&pidCode="+pidCode+"";
    	return result;
    }
    
  //私钥签名：

    /**
    	 * 从keystore中获得公私钥对
    	 * 
    	 * @param filePath
    	 *            keystore文件路径
    	 * @param keyStorePassword
    	 *            keystore 密码
    	 * @param masterPassword
    	 *            私钥主密码，可以和keystore密码相同也可不同
    	 * @param alias
    	 *            密钥对别名
    	 */
    	static KeyPair getKeyFromKeyStore(String filePath,
    			String keyStorePassword, String masterPassword, String alias) {

    		KeyPair keyPair = null;

    		try {
    			KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
    			keyStore.load(new FileInputStream(filePath),
    					keyStorePassword.toCharArray());

    			Key key = keyStore.getKey(alias, masterPassword.toCharArray());
    			// 也可以从keyStore中直接读公钥证书，无须通过私钥转换
    			// Certificate cert = keyStore.getCertificate(alias);
    			// PublicKey pubKey = cert.getPublicKey();

    			if (key instanceof PrivateKey) {
    				java.security.cert.Certificate cert = keyStore.getCertificate(alias);
    				keyPair = new KeyPair(cert.getPublicKey(), (PrivateKey) key);
    			}

    			PrivateKey privateKey = keyPair.getPrivate();
    			PublicKey publicKey = keyPair.getPublic();

    		} catch (KeyStoreException e) {
    			e.printStackTrace();
    		} catch (CertificateException e) {
    			e.printStackTrace();
    		} catch (NoSuchAlgorithmException e) {
    			e.printStackTrace();
    		} catch (IOException e) {
    			e.printStackTrace();
    		} catch (UnrecoverableKeyException e) {
    			e.printStackTrace();
    		}

    		return keyPair;
    	}

    	/**
    	 * 使用私钥证书签名
    	 * 
    	 * @param priKey
    	 *            私钥对象
    	 * @param plainText
    	 *            明文文本的字节数组
    	 * @param encAlg
    	 *            加密算法
    	 * @param signAlg
    	 *            签名算法
    	 * @return 加密后的密文串
    	 * 
    	 * @see verifyByPubKey
    	 */
    	public static byte[] signByPriKey(Key priKey, byte[] srcBytes,
    			String signAlg) {
    		// 签名
    		byte[] signBytes = null;
    		try {
    			Signature sign = Signature.getInstance(signAlg,
    					new org.bouncycastle.jce.provider.BouncyCastleProvider());
    			sign.initSign((PrivateKey) priKey);
    			sign.update(srcBytes);
    			signBytes = sign.sign();
    		} catch (NoSuchAlgorithmException e) {
    			e.printStackTrace();
    		} catch (InvalidKeyException e) {
    			e.printStackTrace();
    		} catch (SignatureException e) {
   			e.printStackTrace();
   		}

    		return signBytes;
    	}

    	/**
    	 * Byte数组转十六进制字符串，字节间不用空格分隔
    	 * 
    	 * @param b
    	 * @return
    	 */
    	public static String bytes2HexString(byte[] b) {
    		String ret = "";
    		for (int i = 0; i < b.length; i++) {
    			String hex = Integer.toHexString(b[i] & 0xFF);
    			if (hex.length() == 1) {
    				hex = '0' + hex;
    			}
    			ret += hex.toUpperCase();
    		}
    		return ret;
    	}
    /**
    	 * 十六进制字符串转Byte数组
    	 * 
    	 * @param src  String格式字符串
    	 * @return byte[]
    	 */
    	public static byte[] hexString2Bytes(String src) {
    		byte[] ret = change_fromStrignto16(src);
    		return ret;
    	}
    	   //将十六进制字符数组转换为字节数组 我从新写的
        public static byte[] change_fromStrignto16(String inputStr) {
    	    byte[] result = new byte[inputStr.length() / 2];
    	    for (int i = 0; i < inputStr.length() / 2; ++i) 
    		        result[i] = (byte)(Integer.parseInt(inputStr.substring(i * 2, i * 2 +2), 16) & 0xff);
    	    return result;
    }
   // 公钥验签：

    	/**
    	 * 使用公钥验证签名
    	 * 
    	 * @param pubKey
    	 *            公钥
    	 * @param srcBytes
    	 *            签名原串字节数组
    	 * @param signBytes
    	 *            签名串字节数组
    	 * @param signAlg
    	 *            签名算法
    	 * @return 验签结果 true = 成功 false = 不成功
    	 * 
    	 * @see signByPriKey
    	 */
    	public static boolean verifyByPubKey(Key pubKey, byte[] srcBytes,
    			byte[] signBytes, String signAlg) {
    		boolean result = false;
    		try {
    			Signature sign = Signature.getInstance(signAlg,
    					new org.bouncycastle.jce.provider.BouncyCastleProvider());
    			sign.initVerify((PublicKey) pubKey);
    			sign.update(srcBytes);
    			result = sign.verify(signBytes);
    		} catch (NoSuchAlgorithmException e) {
    			e.printStackTrace();
    		} catch (InvalidKeyException e) {
    			e.printStackTrace();
    		} catch (SignatureException e) {
    			e.printStackTrace();
    		}

    		return result;
    	}

    	/**
    	 * 从证书文件读取公钥
    	 * 
    	 * @param certFilePath
    	 *            公钥证书路径
    	 * @return 公钥
    	 */
    	public static Key getPubKeyFromCertFile(String certFilePath) {
    		PublicKey key = null;
    		try {
    			CertificateFactory factory = CertificateFactory
    					.getInstance("X.509");
    			FileInputStream fis = new FileInputStream(certFilePath);

    			X509Certificate cert = (X509Certificate) factory
    					.generateCertificate(fis);
    			key = cert.getPublicKey();
    		} catch (FileNotFoundException e) {
    			e.printStackTrace();
    		} catch (CertificateException e) {
    			e.printStackTrace();
    		}

    		return key;
    	}

    	/**
    	 * 使用公钥加密
    	 * @param pubKey 公钥对象
    	 * @param plainText 明文文本的字节数组
    	 * @param encAlg 加密算法 
    	 * @return 加密后的密文串 
    	 * 
    	 * @see decByPriKey
    	 */	
    	public static byte[] encByPubKey(Key pubKey, byte[] plainText, String encAlg){
    		//加密
    		byte[] encBytes = null;
   		try{
   			   Cipher cipher = Cipher.getInstance(encAlg, new org.bouncycastle.jce.provider.BouncyCastleProvider());
    			cipher.init(Cipher.ENCRYPT_MODE, pubKey);
    			encBytes = cipher.doFinal(plainText);
    			
    		}catch (NoSuchAlgorithmException e){
    			e.printStackTrace();
    		}catch (InvalidKeyException e){
    			e.printStackTrace();
    		}catch (IllegalBlockSizeException e){
    			e.printStackTrace();
    		}catch (NoSuchPaddingException e){
    			e.printStackTrace();
    		}catch (BadPaddingException e){
    			e.printStackTrace();
    		}

    		return encBytes;
    	}
 
    	public static Key pubKey;//公钥 从通联商户网站上得到的publicKey
    	public static String returnSignMsg;//返回的报文
    	
    	//管理流程
    	public static void regist_main()
    	{
    		KeyPair kp = getKeyFromKeyStore("d:/opt/zhd/testkey20140409.keystore",
    				"password", "password", "www.testkey20140409.org");
    		
    		
    	}
    	
    	
    	
    	
//    	public static void main(String[] args) {
//    		//对商户发送报文用商户私钥进行签名
//    		KeyPair kp = getKeyFromKeyStore("d:/opt/zhd/testkey20140409.keystore",
//    				"password", "password", "www.testkey20140409.org");
//
//    		String source = "hello world";
//
//    		byte[] signBytes = signByPriKey(kp.getPrivate(), source.getBytes(),
//    				"SHA1WithRSA");
//    		//byte数组转十六进制字符串 
//    		String signMsg = bytes2HexString(signBytes);
//
//    	//获得的signMsg即为调用通联会员注册接口的签名串
//
//    		//敏感信息加密（如真实姓名、证件号码等）
//    		String plainText = "test text";
//    		byte[] encBytes = encByPubKey(pubKey, plainText.getBytes(), "RSA");
//    		String encStr = bytes2HexString(encBytes);
//    		
//    		//对通联会员注册接口返回的报文，商户需要用通联公钥进行验签
//    		Key pubKey = getPubKeyFromCertFile("d:/opt/zhd/TLCert.cer");
//    		//将返回的签名串转为byte数组，再调用验签方法
//    		byte[] signBytes_back = hexString2Bytes(returnSignMsg);
//    		boolean bool = verifyByPubKey(pubKey, source.getBytes(), signBytes_back,
//    				"SHA1WithRSA");
//
//    	}		
    
}
