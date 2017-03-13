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
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class CertSignUtil {

    /**
     * 测试方法 从keystore中获得公私钥对
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
    public static KeyPair getKeyFromKeyStore(String filePath,
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
                Certificate cert = keyStore.getCertificate(alias);
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
                    new BouncyCastleProvider());
            sign.initSign((PrivateKey) priKey);
            sign.update(srcBytes);
            signBytes = sign.sign();
        } catch (NoSuchAlgorithmException e) {
            // LoggerUtil.error("私钥签名 - 无效算法：");
        } catch (InvalidKeyException e) {
            // LoggerUtil.error("私钥签名 - 无效的密钥：");
        } catch (SignatureException e) {
            // LoggerUtil.error("私钥签名 - 签名异常：");
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
     * 将指定字符串src，以每两个字符分割转换为16进制形式 如："2B44EFD9" --> byte[]{0x2B, 0x44, 0xEF,
     * 0xD9}
     * 
     * @param src
     *            String格式字符串
     * @return byte[]
     */
    public static byte[] hexString2Bytes(String src) {
        if (src.length() % 2 != 0) {
            src = src + "0";
        }
        byte[] ret = new byte[src.length() / 2];
        byte[] tmp = src.getBytes();
        for (int i = 0; i < (src.length() / 2); i++) {
            ret[i] = uniteBytes(tmp[i * 2], tmp[i * 2 + 1]);
        }
        return ret;
    }

    /**
     * 将两个ASCII字符合成一个字节； 如："EF"--> 0xEF
     * 
     * @param src0
     *            byte
     * @param src1
     *            byte
     * @return byte
     */
    public static byte uniteBytes(byte src0, byte src1) {
        byte _b0 = Byte.decode("0x" + new String(new byte[] { src0 }))
                .byteValue();
        _b0 = (byte) (_b0 << 4);// 左移4bit，变成8位里的高4位
        byte _b1 = Byte.decode("0x" + new String(new byte[] { src1 }))
                .byteValue();// 不左移，保持在低4位
        byte ret = (byte) (_b0 ^ _b1);// 按位异或即可
        return ret;
    }

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
                    new BouncyCastleProvider());
            sign.initVerify((PublicKey) pubKey);
            sign.update(srcBytes);
            result = sign.verify(signBytes);
        } catch (NoSuchAlgorithmException e) {
            // LoggerUtil.error("公钥验签 - 无效算法：");
        } catch (InvalidKeyException e) {
            // LoggerUtil.error("公钥验签 - 无效的密钥：");
        } catch (SignatureException e) {
            // LoggerUtil.error("公钥验签 - 签名异常：");
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
            // LoggerUtil.error("从证书文件读取公钥 - 证书文件不存在：");
            // LoggerUtil.error(e);
        } catch (CertificateException e) {
            // LoggerUtil.error("从证书文件读取公钥 - 密钥读取异常：");
            // LoggerUtil.error(e);
        }

        return key;
    }

    // /**
    // * 通过商户公钥证书验签
    // * @param certStr 证书信息，如certStyle = 1 则certStr即为证书base64内容，如certStyle=0
    // 则certStr即为证书保存路径
    // * @param certStyle 证书获取格式 1为从DB获取base64编码的证书文本， 2为从指定路径取证书文件
    // * @param srcMsg 签名源串
    // * @param signMsg 签名串
    // * @return
    // */
    // public static boolean verifyByCert(String certStr, int certStyle, String
    // srcMsg, String signMsg){
    //
    //
    // if(certStyle == 0){
    // try{
    // return verifyByPubKey(
    // getPubKeyFromStr(certStr),
    // srcMsg.getBytes("UTF-8"),
    // hexString2Bytes(signMsg),
    // SecurityUtil.MCHT_SIGN_ALG);
    // }catch(Exception e){
    // LoggerUtil.error(e);
    // return false;
    // }
    //
    // }else{
    // LoggerUtil.error("参数中指定了非法的证书存储格式");
    // return false;
    // }
    //
    // }

    /**
     * 使用公钥加密
     * 
     * @param pubKey
     *            公钥对象
     * @param plainText
     *            明文文本的字节数组
     * @param encAlg
     *            加密算法
     * @return 加密后的密文串
     * 
     * @see decByPriKey
     */
    public static byte[] encByPubKey(Key pubKey, byte[] plainText, String encAlg) {
        // 加密
        byte[] encBytes = null;
        try {

            Cipher cipher = Cipher.getInstance(encAlg,
                    new BouncyCastleProvider());
            cipher.init(Cipher.ENCRYPT_MODE, pubKey);
            encBytes = cipher.doFinal(plainText);

        } catch (NoSuchAlgorithmException e) {
            // LoggerUtil.error("公钥加密 - 无效算法：");
        } catch (InvalidKeyException e) {
            // LoggerUtil.error("公钥加密 - 无效密钥：");
        } catch (IllegalBlockSizeException e) {
            // LoggerUtil.error("公钥加密 - 非法的分块大小：");
        } catch (NoSuchPaddingException e) {
            // LoggerUtil.error("公钥加密 - 错误的填充格式：");
        } catch (BadPaddingException e) {
            // LoggerUtil.error("公钥加密 - 填充异常：");
        }

        return encBytes;
    }

}
