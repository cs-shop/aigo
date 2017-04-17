package com.cs.common;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.tomcat.util.codec.binary.Base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * data encrypt utls
 *
 * @author skyline
 *
 */
public class EncryptUtil {
	
	

	/**
	 * MD5加密5
	 * 
	 * @param data
	 *            数据值
	 * @param salt
	 *            加密添加字符串
	 * @return 加密后字符串
	 */
	public static String encrypt(String data) {

		// 可以更换算法:sha512Hex
		try {
			return DigestUtils.md5Hex(data.getBytes("iso-8859-1"));
		} catch (UnsupportedEncodingException e) {
			return DigestUtils.md5Hex(data);
		}
	}

	/**
	 * BASE64加密
	 * 
	 * @param data
	 * @return
	 */
	public static String encryptBase64(String data) {
		return Base64.encodeBase64String(data.getBytes());
	}

	/**
	 * BASE64解密
	 * 
	 * @param data
	 * @return
	 */
	public static String decryptBase64(String data) {
		return new String(Base64.decodeBase64(data));
	}
	
	
	
	public static final String KEY_SHA = "SHA";

	public static final String KEY_MD5 = "MD5";

	/**
	 * MAC算法可选以下多种算法
	 *
	 * <pre>
	 * HmacMD5
	 * HmacSHA1
	 * HmacSHA256
	 * HmacSHA384
	 * HmacSHA512
	 * </pre>
	 */
	public static final String KEY_MAC = "HmacMD5";

	/**
	 * BASE64解密
	 *
	 * @param key = 需要解密的密码字符串
	 * @return
	 * @throws Exception
	 */
	public static byte[] decryptBASE64(String key) throws Exception {
		return (new BASE64Decoder()).decodeBuffer(key);
	}

	/**
	 * BASE64加密
	 *
	 * @param key = 需要加密的字符数组
	 * @return
	 * @throws Exception
	 */
	public static String encryptBASE64(String key) throws Exception {
		return (new BASE64Encoder()).encodeBuffer(key.getBytes());
	}

	/**
	 * MD5加密
	 *
	 * @param data = 需要加密的字符数组
	 * @return
	 * @throws Exception
	 */
	public static String encryptMD5(String data) throws Exception {

		MessageDigest md5 = MessageDigest.getInstance(KEY_MD5);
		md5.update(data.getBytes());

		return new String(md5.digest(),"utf-8");

	}

	/**
	 * SHA加密
	 *
	 * @param data = 需要加密的字符数组
	 * @return
	 * @throws Exception
	 */
	public static byte[] encryptSHA(byte[] data) throws Exception {

		MessageDigest sha = MessageDigest.getInstance(KEY_SHA);
		sha.update(data);

		return sha.digest();

	}

	/**
	 * 初始化HMAC密钥
	 *
	 * @return
	 * @throws Exception
	 */
	public static String initMacKey() throws Exception {
		KeyGenerator keyGenerator = KeyGenerator.getInstance(KEY_MAC);

		SecretKey secretKey = keyGenerator.generateKey();
		return encryptBASE64(secretKey.getEncoded().toString());
	}

	/**
	 * HMAC加密
	 *
	 * @param data = 密匙加密过的字符数组
	 * @param key = 需要加密的字符串
	 * @return
	 * @throws Exception
	 */
	public static byte[] encryptHMAC(byte[] data, String key) throws Exception {

		SecretKey secretKey = new SecretKeySpec(decryptBASE64(key), KEY_MAC);
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());
		mac.init(secretKey);

		return mac.doFinal(data);

	}

	
	public static void main(String[] args) {
		String name = "123";
		try {
			String encryptMD5 = encrypt(name);
			System.out.println(encryptMD5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}