package com.isheji.project.common.utils;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

public class EncrypAES {

    //KeyGenerator 提供对称密钥生成器的功能，支持各种算法
    private KeyGenerator keygen;
    //SecretKey 负责保存对称密钥
    private SecretKey deskey;
    //Cipher负责完成加密或解密工作
    private Cipher c;
    //该字节数组负责保存加密的结果
    private byte[] cipherByte;

    public EncrypAES() throws NoSuchAlgorithmException, NoSuchPaddingException{
        Security.addProvider(new com.sun.crypto.provider.SunJCE());
        //实例化支持DES算法的密钥生成器(算法名称命名需按规定，否则抛出异常)
        keygen = KeyGenerator.getInstance("AES");
        //生成密钥
        deskey = keygen.generateKey();
        //生成Cipher对象,指定其支持的DES算法
        c = Cipher.getInstance("AES");
    }

    /**
     * 对字符串加密
     *
     * @param str
     * @return
     * @throws InvalidKeyException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     */
    public  byte[] Encrytor(String str) throws InvalidKeyException,
            IllegalBlockSizeException, BadPaddingException {
        // 根据密钥，对Cipher对象进行初始化，ENCRYPT_MODE表示加密模式
        c.init(Cipher.ENCRYPT_MODE, deskey);
        byte[] src = str.getBytes();
        // 加密，结果保存进cipherByte
        cipherByte = c.doFinal(src);
        return cipherByte;
    }

    /**
     * 对字符串解密
     *
     * @param buff
     * @return
     * @throws InvalidKeyException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     */
    public byte[] Decryptor(byte[] buff) throws InvalidKeyException,
            IllegalBlockSizeException, BadPaddingException {
        // 根据密钥，对Cipher对象进行初始化，DECRYPT_MODE表示加密模式
        c.init(Cipher.DECRYPT_MODE, deskey);
        cipherByte = c.doFinal(buff);
        return cipherByte;
    }

    /**
     * @param args
     * @throws NoSuchPaddingException
     * @throws NoSuchAlgorithmException
     * @throws BadPaddingException
     * @throws IllegalBlockSizeException
     * @throws InvalidKeyException
     */
    public static void main(String[] args) throws Exception {
        EncrypAES de1 = new EncrypAES();
        String msg ="郭XX-搞笑相声全集";
        byte[] encontent = de1.Encrytor(msg);
        byte[] decontent = de1.Decryptor(encontent);
        System.out.println("明文是:" + msg);
        System.out.println("加密后:" + new String(encontent));
        System.out.println("解密后:" + new String(decontent));
    }
    public String byteArr2HexStr(byte[] arrB) throws Exception {

        int iLen = arrB.length;

        // 每个byte用两个字符才能表示，所以字符串的长度是数组长度的两倍
        StringBuffer sb = new StringBuffer(iLen * 2);

        for (int i = 0; i < iLen; i++) {
            int intTmp = arrB[i];
            // 把负数转换为正数
            while (intTmp < 0) {
                intTmp = intTmp + 256;
            }

            // 小于0F的数需要在前面补0
            if (intTmp < 16) {
                sb.append("0");
            }
            sb.append(Integer.toString(intTmp, 16));
        }
        return sb.toString();
    }

    public byte[] hexStr2ByteArr(String strIn) throws Exception {
        byte[] arrB = strIn.getBytes();
        int iLen = arrB.length;

        // 两个字符表示一个字节，所以字节数组长度是字符串长度除以2
        byte[] arrOut = new byte[iLen / 2];
        for (int i = 0; i < iLen; i = i + 2) {
            String strTmp = new String(arrB, i, 2);
            arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
        }
        return arrOut;
    }
}