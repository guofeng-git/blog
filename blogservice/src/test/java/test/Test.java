/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package test;

import jieyi.accservice.utils.AESUtil;

public class Test {
    public static void main(String[] args) throws Exception {

        String string = AESUtil.encrypt(AESUtil.AES_KEY, "sbjmtOmSj8pLtzbNnlgxYQ==");
 //       System.out.println("string1:" + string + " string2:" + AESUtil.decrypt(AESUtil.AES_KEY, string));
//        
        string = AESUtil.encrypt(AESUtil.AES_KEY,"340881198910195318");
        System.out.println("string2:" + string + " string2:" + AESUtil.decrypt(AESUtil.AES_KEY,string));
        
        string = AESUtil.encrypt(AESUtil.AES_KEY,"钟徽志");
        System.out.println("string3:" + string + " string2:" + AESUtil.decrypt(AESUtil.AES_KEY,string));
        
//       
//        
//        
//        
        string = AESUtil.encrypt(AESUtil.AES_KEY,"18062075652");
        System.out.println("string1:" + string + " string4:" + AESUtil.decrypt(AESUtil.AES_KEY,string));
        string = AESUtil.encrypt(AESUtil.AES_KEY,"单独");
        System.out.println("string2:" + string + " string4:" + AESUtil.decrypt(AESUtil.AES_KEY,string));
        string = AESUtil.encrypt(AESUtil.AES_KEY,"15071437105");
        System.out.println("string3:" + string + " string4:" + AESUtil.decrypt(AESUtil.AES_KEY,string));
////        
        String acc =  AESUtil.decrypt(AESUtil.AES_KEY,"nG5YuFDDceJIQO6wfpNaCg==");
        System.out.println("acc:" + acc);
//        String acc2 =  AESUtil.decrypt(AESUtil.AES_KEY,"RlKqZDEslS0iHPjgcP7r+w==");
//        System.out.println("acc:" + acc2);
//        String acc3 =  AESUtil.decrypt(AESUtil.AES_KEY,"c");
//        System.out.println("acc:" + acc3);
//        String [] aesString = {
//        		"叶庆武",
//        		"李永波",
//        		"王伟荣",
//        		"周显荣",
//        		"梅丽萍",
//        		"沈丽娟",
//        		"唐林军",
//        		"潘力峰",
//        		"沈小聪","余良富","戴旭伟","姚丽萍","张平"
//};
//        for (int i = 0; i < aesString.length; i++) {
//        	aesString[i] = AESUtil.encrypt(AESUtil.AES_KEY,aesString[i]);
//        	System.out.println(aesString[i]);
//		}
        
    }
}
