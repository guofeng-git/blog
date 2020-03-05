package jieyi.accservice.utils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import com.alibaba.fastjson.JSONObject;
import jieyi.accservice.utils.DateFormatUtil;

public class TestBase {
	
    protected static Map<String, Object> createSendData(String txncode) {
    	Map<String, Object> txninfo = new LinkedHashMap<String, Object>();
        txninfo.put("txncode", txncode);
        txninfo.put("instid", "48080001");
        txninfo.put("mchntid", "000000010000001");
        txninfo.put("netid", "100000010000001");
        txninfo.put("termid", "10000029");
        txninfo.put("syssesq", DateFormatUtil.getCurrentTime24SSS() + new Random().nextInt(1000));
        txninfo.put("txndate", DateFormatUtil.getCurrentTime24SSS().substring(0, 8));
        txninfo.put("txntime", DateFormatUtil.getCurrentTime24SSS().substring(8, 14));
        txninfo.put("city", "4210");
        return txninfo;
    }

    protected static void printSendData(Map<String, Object> txninfo) {
        System.out.printf("Data Map For Txncode [%s] : %n", txninfo.get("txncode"));
        System.out.println("------------------------------------------------------");
        for (Entry<String, Object> entry : txninfo.entrySet()) {
            System.out.printf("%20s: [%s] %n", entry.getKey(), entry.getValue());
        }
        System.out.println("------------------------------------------------------");
    }
    
    protected static void printRecvData(String data) {
        try {
        	JSONObject obj1 = JSONObject.parseObject(data, JSONObject.class);
        	JSONObject obj2 = JSONObject.parseObject(obj1.getString("txninfo"), JSONObject.class);

            System.out.printf("Data Map For Txncode [%s] : %n", obj2.getString("txncode"));
            System.out.println("------------------------------------------------------");
            for (Entry<String, Object> entry : obj2.entrySet()) {
                System.out.printf("%20s: [%s] %n", entry.getKey(), entry.getValue());
            }
            System.out.println("------------------------------------------------------");
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
    
}
