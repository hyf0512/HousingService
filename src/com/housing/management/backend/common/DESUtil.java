package com.housing.management.backend.common;

import java.security.Key;
import java.security.Security;

import javax.crypto.Cipher;

import org.apache.log4j.Logger;

/**
 * db password
 * 
 * @author Felix.yu
 * 
 */
public class DESUtil {
	
	private static final Logger logger = Logger.getLogger(DESUtil.class);
	
	private static String strDefaultKey = "cemm";

	private Cipher encryptCipher = null;

	private Cipher decryptCipher = null;

	public static String byteArr2HexStr(byte[] arrB) throws Exception {
		int iLen = arrB.length;
		StringBuffer sb = new StringBuffer(iLen * 2);
		for (int i = 0; i < iLen; i++) {
			int intTmp = arrB[i];
			while (intTmp < 0) {
				intTmp = intTmp + 256;
			}
			if (intTmp < 16) {
				sb.append("0");
			}
			sb.append(Integer.toString(intTmp, 16));
		}
		return sb.toString();
	}

	public static byte[] hexStr2ByteArr(String strIn) throws Exception {
		byte[] arrB = strIn.getBytes();
		int iLen = arrB.length;

		byte[] arrOut = new byte[iLen / 2];
		for (int i = 0; i < iLen; i = i + 2) {
			String strTmp = new String(arrB, i, 2);
			arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
		}
		return arrOut;
	}

	public DESUtil() throws Exception {
		this(strDefaultKey);
	}

	@SuppressWarnings("restriction")
	public DESUtil(String strKey) throws Exception {
		Security.addProvider(new com.sun.crypto.provider.SunJCE());
		Key key = getKey(strKey.getBytes());
		encryptCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		encryptCipher.init(Cipher.ENCRYPT_MODE, key);

		decryptCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		decryptCipher.init(Cipher.DECRYPT_MODE, key);
	}

	public byte[] encrypt(byte[] arrB) throws Exception {
		return encryptCipher.doFinal(arrB);
	}

	public String encrypt(String strIn) throws Exception {
		return byteArr2HexStr(encrypt(strIn.getBytes()));
	}

	public byte[] decrypt(byte[] arrB) throws Exception {
		return decryptCipher.doFinal(arrB);
	}

	public String decrypt(String strIn) throws Exception {
		return new String(decrypt(hexStr2ByteArr(strIn)));
	}

	private Key getKey(byte[] arrBTmp) throws Exception {
		byte[] arrB = new byte[8];

		for (int i = 0; i < arrBTmp.length && i < arrB.length; i++) {
			arrB[i] = arrBTmp[i];
		}
		Key key = new javax.crypto.spec.SecretKeySpec(arrB, "DES");

		return key;
	}

    public static void main(String[] args){
        try {
//        	 System.out.println(Utils.addZero(6,10));
        	
            DESUtil desUtil = new DESUtil();
            System.out.println("===" + desUtil.encrypt("sms_2013"));
//            System.out.println("===" + desUtil.decrypt("413d0413bab9c6a5923828f0cf6f24d2"));
        } catch (Exception e) {
        	logger.error(e.getMessage()); //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
