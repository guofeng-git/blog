package jieyi.accservice.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

/**
 * @author guofeng
 * @email 
 * @time 2019年5月22日 下午15:18:08
 * @description:HTTP工具类
 */

public class HttpClientUtil {
    private final static Logger logger = LoggerFactory.getLogger(HttpClientUtil.class);
    private static CloseableHttpClient client = HttpClients.createDefault();

    /*
     * public static String httpPost(String url, Map<String, Object> param) { HttpPost httpPost = new HttpPost(url);
     * List<NameValuePair> nvps = new ArrayList<NameValuePair>(); if (param != null) { for (Map.Entry<String, Object>
     * entry : param.entrySet()) { nvps.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue()))); }
     * } CloseableHttpResponse response2 = null; try { httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
     * response2 = client.execute(httpPost); HttpEntity entity2 = response2.getEntity(); String respContent =
     * EntityUtils.toString(entity2, "utf-8").trim(); httpPost.abort(); EntityUtils.consume(entity2); return
     * respContent; } catch (Exception e) { logger.error("发送http POST请求错误，错误信息为:{}", e); return null; } finally { if
     * (response2 != null) { try { response2.close(); } catch (Exception e) { } } } }
     */

    public static String httpPost(String url, Map<String, Object> param) {
        HttpPost httpPost = new HttpPost(url);
        Gson gson = new Gson();
        String data = gson.toJson(param);
//        String signcode = "";
//        try {
//            signcode = RsaUtil.autograph2(data);
//        } catch (Exception e1) {
//            // TODO Auto-generated catch block
//            e1.printStackTrace();
//        }
  //      CommonData parameters = new CommonData();
  //      parameters.setTxninfo(data);
  //      parameters.setSigncode(signcode);
   //     String params = JSON.toJSONString(parameters);
        CloseableHttpResponse response2 = null;
        try {
            httpPost.setEntity(new StringEntity(data, Charset.forName("UTF-8")));
 //           System.out.println(new StringEntity(params, Charset.forName("UTF-8")));
            response2 = client.execute(httpPost);
            HttpEntity entity2 = response2.getEntity();
            String respContent = EntityUtils.toString(entity2, "utf-8").trim();
            httpPost.abort();
            EntityUtils.consume(entity2);
            return respContent;
        } catch (Exception e) {
            logger.error("发送http POST请求错误，错误信息为:{}", e);
            return null;
        } finally {
            if (response2 != null) {
                try {
                    response2.close();
                } catch (Exception e) {
                }
            }
        }
    }

    public static String httpDelete(String url) {
        HttpDelete httpDelete = new HttpDelete(url);
        CloseableHttpResponse response2 = null;
        try {
            response2 = client.execute(httpDelete);
            HttpEntity entity2 = response2.getEntity();
            String respContent = EntityUtils.toString(entity2, "utf-8").trim();
            httpDelete.abort();
            EntityUtils.consume(entity2);
            return respContent;
        } catch (Exception e) {
            logger.error("发送http DELETE请求错误，错误信息为:{}", e);
            return null;
        } finally {
            if (response2 != null) {
                try {
                    response2.close();
                } catch (Exception e) {
                }
            }
        }
    }

    public static String httpPut(String url, Map<String, Object> param) {
        HttpPut httpPut = new HttpPut(url);
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        if (param != null) {
            for (Map.Entry<String, Object> entry : param.entrySet()) {
                nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
            }
        }
        CloseableHttpResponse response2 = null;
        try {
            httpPut.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
            response2 = client.execute(httpPut);
            HttpEntity entity2 = response2.getEntity();
            String respContent = EntityUtils.toString(entity2, "utf-8").trim();
            httpPut.abort();
            EntityUtils.consume(entity2);
            return respContent;
        } catch (Exception e) {
            logger.error("发送http PUT请求错误，错误信息为:{}", e);
            return null;
        } finally {
            if (response2 != null) {
                try {
                    response2.close();
                } catch (Exception e) {
                }
            }
        }
    }

    public static String getMd5(String str) {
        String result = "";
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            //	    	System.out.println(NumberStringUtil.bytesToHexString(md.digest()).toLowerCase());
            result = NumberStringUtil.bytesToHexString(md.digest());
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result.toLowerCase();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String password = getMd5("81235chdt").toLowerCase();
        //    	System.out.println(password);
        //        Map<String, Object> paramMap = new HashMap<String, Object>();
        //        paramMap.put("enterpriseID", "17451");
        //        paramMap.put("loginName", "admin");
        //        paramMap.put("password", password);
        //        paramMap.put("smsId", "");
        //        paramMap.put("subPort", "");
        //        paramMap.put("content", "验证码:214568，有效时间5分钟，若非本人操作，请忽略!【全国城市一卡通互联互通清分平台】");
        //        paramMap.put("mobiles", "18611698296");
        //        paramMap.put("sendTime", "");
        //        
        //        String resultJson = HttpClientUtil.httpPost("http://113.108.68.228:8001/sendSMS.action", paramMap);
        Map<String, Object> paramMap = new HashMap<String, Object>();

        /*
         * paramMap.put("name", "测试"); paramMap.put("sex", "1");
         */
        //    	 String resultJson = HttpClientUtil.httpPost("http://127.0.0.1:8080/citytxnservice/cardCloud/accountbiz.do", paramMap);

        //余额查询

        /*
         * paramMap.put("syssesq", "22229"); paramMap.put("instid", "2345"); paramMap.put("mchntid", "000900423000002");
         * paramMap.put("termid", "00000017"); paramMap.put("password", "111111"); paramMap.put("city", "1500");
         * paramMap.put("cardno", "8320889511000002");
         */
        
        
        //绑卡账户验证
        //主密钥下载
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("mchntpubkey", "D7DD644D9460387200D39BE3EE68E832D7B47B08A87BC49904A71CC37FF98D02357B6E051319B739641733366E8B40978E550FDC8E5C1AE95A0A05D5E49CB9CEA2F91CC3A77290E20157CAD972F80826176984FEAAA7ABBD4A0CE830751155F4BBEA647DCBE6FEBC2878883D3BF3D4923B0DCE2B100381135BAFA286B00E4481");
//        paramMap.put("mchntpubindex", "10001");
//        paramMap.put("mchntkeyver", "01");
//        paramMap.put("attach", "");	      
//        //String json = JSON.toJSONString(paramMap);
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        //System.out.println("json===="+json);
//        param.put("txninfo", json);
//        param.put("signcode", "6F50333A3BDC737983FD26E11B9EF0BA96DA80132EF2762C1E2E3CD22EEA1334E55689FA9B752C725AD0688FACB27CE1E4ACB3BE8668978E3CFF7FD930AE02D3F5673AD94570068E25B9F281734C43B5B4B7EB93746B1342EA2DF8162007C7332B8E366E0653203F1F5E1D6DF2EF03B66080648BD3982BF67AFBA8229717833E");
//    
        
        //终端签到
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("sysssesq", "201905231710001");
//        paramMap.put("txndate", "20190621");	
//        paramMap.put("txntime", "11060328");	
//        paramMap.put("attach", "");	      
//        //String json = JSON.toJSONString(paramMap);
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        //System.out.println("json===="+json);
//        param.put("txninfo", json);
//        param.put("signcode", "4B1B956EF6EF65558A7D96D099078C0303E08ECD0F0E2324AC229E6AEFBAC0D560F19D0C540E74B001D2C371AB1511E33F4D816B5B66A77587962AF16513A04F1C85A40EA84CFE8786049682ACA4BCE16FC29149C668739D39F87D8630AF31C336401FDA7609C6C17BF5F0232B330F9576AB2277FF9B3A56332A182E6C1FEBC5");
//        
        //账户开户
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("syssesq", "005");
//        paramMap.put("txndate", "20190711");	
//        paramMap.put("txntime", "165403");	
//        paramMap.put("phone", "b+bAdylSA1Xf8sLq7gVhIQ==");
//        paramMap.put("acctype", "00");
//        paramMap.put("password", "DA62DAA6EE8DE7B4");
//        paramMap.put("pinchkamt", "10");
//        paramMap.put("remindamt", "10");
//        paramMap.put("isrealname", "N");
//        paramMap.put("holdname", "");
//        paramMap.put("holdtype", "");
//        paramMap.put("holdno", "");
//        paramMap.put("email", "");
//        paramMap.put("telphone", "");
//        paramMap.put("contactaddr", "");
//        paramMap.put("postno", "");
//        paramMap.put("address", "");
//        paramMap.put("qq", "");
//        paramMap.put("weixin", "");
//        //String json = JSON.toJSONString(paramMap);
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("txninfo", json);
//        param.put("signcode", "08324BDD3DEBBF47516935AB150DB283323EF4F7CAC037D5DEBE75A391B4A3DDFDDC12F4BA9C529AA881B5F887EC9A7289140B1C56FD37DDFE4B79A7A2D82A6B115E7E125840F8923035E74C8D2CD9DED15F33DD1E387C82D83AE68403B4325C5F3AE775E320F181D8EFB87459F04F0F32F55CC1473EDAF7CE11FEBE3D5ABF96");
               
        
        //账户绑卡
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("syssesq", "001");
//        paramMap.put("txndate", "20190729");	
//        paramMap.put("txntime", "111303");	
//        paramMap.put("cardno", "6205380400000000498");
//        paramMap.put("cardorg", "004");
//        paramMap.put("acctype", "10");
//        paramMap.put("holdname", "70aZ4l9p9KZLL9tOJ9j4uQ==");
//        paramMap.put("holdtype", "00");
//        paramMap.put("holdno", "ks1ZS7ns+F2ZF/NZHU2mX4p05ntJmOdiljK0pSycRLs=");
//        paramMap.put("phone", "d2OrgJ1+8G7IjSgIig47PA==");
//        paramMap.put("email", "");
//        paramMap.put("telphone", "");
//        paramMap.put("contactaddr", "");
//        paramMap.put("postno", "");
//        paramMap.put("address", "");
//        paramMap.put("qq", "");
//        paramMap.put("weixin", "");       
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("txninfo", json);
//        param.put("signcode", "4B8C95EA41131BF62C69E27684F6642EC8CCC1E0B372047E55D10619808D41980C6264DF31839F7C3872A36EE91004C8A06AC58A4231406A1E71D46CCED08FE723573446BD61BF910A347F2C56727B311C1FB5C17324C5054C9FBADCB728FCFA63D0006A4249D82D883496FD0D424CEFAECCF6FE72E7D606C74DB3DEB2A95481");
       
      //账户卡解绑
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("syssesq", "001");
//        paramMap.put("txndate", "20190621");	
//        paramMap.put("txntime", "10540328");	
//        paramMap.put("cardno", "3104990200020000910");
//        paramMap.put("cardorg", "003");
//        paramMap.put("acctype", "00");
//        paramMap.put("password", "DA62DAA6EE8DE7B4");
//        paramMap.put("holdname", "vEuOFRqTT3AoMuYIatm5pQ==");
//        paramMap.put("holdtype", "00");
//        paramMap.put("holdno", "oUsSqmVIKoCUCUTvqD2IlmIFsqUXNWprcNkJ82MFhj0=");
//        paramMap.put("phone", "8d6ozUF2ytLrBNG+G4Dwow==");
//        paramMap.put("email", "");
//        paramMap.put("telphone", "");
//        paramMap.put("contactaddr", "");
//        paramMap.put("postno", "");
//        paramMap.put("address", "");
//        paramMap.put("qq", "");
//        paramMap.put("weixin", "");       
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("txninfo", json);
//        param.put("signcode", "15FC029A974035CE65C798A58B484BD5AC044309B39D225B948CEEE00BFD120D1BA96F4AEF7384F680EBEBAD0FA4B91E3EC2B91C20E4D917B2CD76988F1497EF60BD654F5CDF18CC16C58988C61BF0278C5318D47F96661E1BD657FE2CCBAA3A06F16DDCFC8C5043E27A07648FBBF186B3C8FE14D593C26C6921BEA5C0CC7113");
        
        //账户冻结
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("syssesq", "002");
//        paramMap.put("txndate", "20190530");	
//        paramMap.put("txntime", "17110328");	
//        paramMap.put("phone", "NC+tN3deyjVqE/iNb7Iz0Q==");
//        paramMap.put("holdname", "0829");
//        paramMap.put("holdtype", "01");
//        paramMap.put("holdno", "0829");      
//        paramMap.put("attach", "");       
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("txninfo", json);
//        param.put("signcode", "4C9993BE030AE86EFED0415C1DA8C459174D200722C82F29D1CD6454FE51232F0CA38631B7E3FD104D6DE29009C91FB3E4052ABAB79EC30592D9742FA9D186D36A45EE75206C6807CF0187959A4B14B220AE603FA95603763ADEF0B7CD661DFBBD7FA6AF4A07E5F3B9596B50D0FC147231D91DA881A11241001A49EB62EDABDF");
        
        //账户解冻
   //   Gson gson = new Gson();
//      paramMap.put("mchntid", "000000010000002");
//      paramMap.put("termid", "00001310");
//      paramMap.put("syssesq", "002");
//      paramMap.put("txndate", "20190530");	
//      paramMap.put("txntime", "17110328");	
//      paramMap.put("phone", "NC+tN3deyjVqE/iNb7Iz0Q==");
//      paramMap.put("holdname", "0829");
//      paramMap.put("holdtype", "01");
//      paramMap.put("holdno", "0829");      
//      paramMap.put("attach", "");       
//      String json = gson.toJson(paramMap);
//      Map<String,Object> param = new HashMap<String,Object>();
//      param.put("txninfo", json);
//      param.put("signcode", "4C9993BE030AE86EFED0415C1DA8C459174D200722C82F29D1CD6454FE51232F0CA38631B7E3FD104D6DE29009C91FB3E4052ABAB79EC30592D9742FA9D186D36A45EE75206C6807CF0187959A4B14B220AE603FA95603763ADEF0B7CD661DFBBD7FA6AF4A07E5F3B9596B50D0FC147231D91DA881A11241001A49EB62EDABDF");
        //密码修改
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("syssesq", "001");
//        paramMap.put("txndate", "20190523");	
//        paramMap.put("txntime", "17110328");	
//        paramMap.put("phone", "TpQJySBjB554sWcosEgrgw==");
//        paramMap.put("acctype", "02");
//        paramMap.put("password", "C121DC72BF5E3600");
//        paramMap.put("newpassword", "DA62DAA6EE8DE7B4");
//        paramMap.put("attach", "");       
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("txninfo", json);
//        param.put("signcode", "2352CAC73063188EB5C69F44AB559C9EEBE9AEE27E4C1623E3FB64AAEA0907D50B4345A690588A10ED993010C77F497EE875D94CA90FDA2247A7886D40764097810E6ECF8660BFAAF540B135C3613D5D451398CAC81C703AD79CD4F96F75B10A0222052CD4E8EE4255B47C7A6A16E84DE1FFE2E912D3C4AFC9F0DD6806346A3A");
        
         //密码验证
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("syssesq", "001");
//        paramMap.put("txndate", "20190523");	
//        paramMap.put("txntime", "17110328");	
//        paramMap.put("phone", "d2OrgJ1+8G7IjSgIig47PA==");
//        paramMap.put("acctype", "00");
//        paramMap.put("password", "C121DC72BF5E3600");
//        paramMap.put("attach", "");       
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("txninfo", json);
//        param.put("signcode", "4169B2C5679623D523A05F188DC61813B88C349ABAC82ED4DC0B94DB0C8398A3869535D57EAD3D8FDD9888582AC084B91F998CDE46B1F5A65C28789691E976D8CBF6F35C61F04451AF473657858DD8232581A08B52B1FA95A82566A5B8F63D7AE233DC6412DE913ED3EC2308BD6429A31A8AB3AD6CB58629C80E7933B620B3BB");
        //密码重置
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("syssesq", "001");
//        paramMap.put("txndate", "20190621");	
//        paramMap.put("txntime", "11110328");	
//        paramMap.put("phone", "d2OrgJ1+8G7IjSgIig47PA==");
//        paramMap.put("acctype", "00");
//        paramMap.put("newpassword", "C121DC72BF5E3600");
//        paramMap.put("holdname", "Eto+dRZj1wmimlrfwnMeSQ==");
//        paramMap.put("holdtype", "01");
//        paramMap.put("holdno", "Eto+dRZj1wmimlrfwnMeSQ==");
//        paramMap.put("attach", "");       
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("txninfo", json);
//        param.put("signcode", "A4395CBFA6A401EE87BE66C212B0336FC8D695ECBF4F124413E4769993253C0CF197612DB367A8595C56651F5F5C8CD2D9CC0485F579C807FEBC481901A1ABF444F2A9E7CDD399D6A3233BC6211E938A9E6519EE255B54A050CDBADC995D91B9B62D81B65B1E6209ACF0AAE79AB3988B0FFA43B958DFA09CB0ACCBF43BB435D2");
//      
        	
        //账户充值
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("syssesq", "444");
//        paramMap.put("txndate", "20190715");	
//        paramMap.put("txntime", "172101");	
//        paramMap.put("phone", "d2OrgJ1+8G7IjSgIig47PA==");
//        paramMap.put("acctype", "00");
//        paramMap.put("txnamt", "00000000500");
//        paramMap.put("ordid", "20190715333");
//        paramMap.put("attach", "");       
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("txninfo", json);
//        param.put("signcode", "0A0B1A5EA8D9F5A3C9A08767932838C4AA5A28585E297A645C895A31533A82BA1757894C320952B1C18D822E2939759EF96576625BB6495BC39E779C5FC315CB746141A0E63D80632288CFE84CB3527B1499E9CE576C87E8B66632614378F3DAB878B6A1BE63AA52F42C6B16CE166B5EE13D5E888BC1112CA92264EE18921AED");
//      
//        //账户充值撤销
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("syssesq", "001");
//        paramMap.put("txndate", "20190715");	
//        paramMap.put("txntime", "1750");	
//        paramMap.put("phone", "d2OrgJ1+8G7IjSgIig47PA==");
//        paramMap.put("acctype", "00");
//        paramMap.put("orgordid", "20190715333");
//        paramMap.put("txnamt", "000000000500");
//        paramMap.put("ordid", "666666");
//        paramMap.put("attach", "");       
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("txninfo", json);
//        param.put("signcode", "1B19345E76760957FE56082B7B962634B6F10401476D977E1F899A83C3800D804827A8B321D34291D17A82297248A5D6DC9547C0C0E850BB8DC82359789BD628662746D2A142ABFDB9D90C22C989825CB4BA1305EC13865AF67B2CB58AB78D3047BDC2B872F112BAD6CF1DB63F22D101E2A87F2DF73CD20A26599F0F9678027D");
       
        //账户消费
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("syssesq", "1321");
//        paramMap.put("txndate", "20190618");	
//        paramMap.put("txntime", "15360328");	
//        paramMap.put("phone", "RlKqZDEslS0iHPjgcP7r+w==");
//        paramMap.put("acctype", "00");
//        paramMap.put("password", "DA62DAA6EE8DE7B4");
//        paramMap.put("txnamt", "000000000100");
//        paramMap.put("ordid", "1321");
//        paramMap.put("attach", "");       
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("txninfo", json);
//        param.put("signcode", "996E570493A0CA4FF9D1E7EB3445D8FA5CEDEB64E35704E256D39EBF7CCF0BA964D16F0010829E2C941285345A1C016BAE20785C3193239E3673A8C26D51E32B36FDC1FD2DC49265212BB0CFDBC64F1D1E5C415A3903B13AC12DBCFA5D55B0F3C05743E5B41F7A8EAADC3794C3829492F949C878162EE96B66BBB1A0BCB3008B");
//        
        
//        //账户消费撤销
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("syssesq", "001");
//        paramMap.put("txndate", "20190618");	
//        paramMap.put("txntime", "14400328");	
//        paramMap.put("password", "DA62DAA6EE8DE7B4");
//        paramMap.put("phone", "RlKqZDEslS0iHPjgcP7r+w==");
//        paramMap.put("acctype", "00");
//        paramMap.put("ordid", "001");
//        paramMap.put("orgrefno", "000000001135");
//        paramMap.put("orgsyssesq", "000254");
//        paramMap.put("txnamt", "000000000100");
//        paramMap.put("attach", "");       
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("txninfo", json);
//        param.put("signcode", "B41CBD646860144A4A29E9C04AD12B86B3FB7B129809CB46BE01966B0F02A7E89AD6DC4DB623B3E59060E4D3A299AC827A495EDA2A5A8847DFCE9CF080C81688AC00300AE260141AC2680510E97700F955421AF0B75D9E0D3F51FDD255C4299E49493691A024161B8EB66743EAB9818519959A930D4F7DC6D3B58BF820071732");
      
        //账户退货
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("syssesq", "001");
//        paramMap.put("orgtxndate", "20190530");
//        paramMap.put("txndate", "20190530");	
//        paramMap.put("txntime", "09500328");	
//        paramMap.put("txnamt", "000000000352");
//        paramMap.put("password", "C121DC72BF5E3600");
//        paramMap.put("phone", "TpQJySBjB554sWcosEgrgw==");
//        paramMap.put("acctype", "00");
//        paramMap.put("orgsyssesq", "000254");
//        paramMap.put("ordid", "111");
//        paramMap.put("orgrefno", "000000001135");
//        paramMap.put("attach", "");       
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("txninfo", json);
//        param.put("signcode", "BC7F75F2F726F8148881C62A45101EE5BD099C82875C99048F825BFCAAF8B0E549C249C06CDA211FC2166FBC2590BC1DD29D650AC73366C771ADDCED52DDE896F2B7C6BE44CD6630D0B85EB87B1A8DC387B5ACC164770B1B1B5FECBE26A7B04CAE61FE0F488FBB5988BDCA84ECB92150B53EC40D6BFA690B4253BA901FEB9EE1");
       
        //交易查询
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("refno", "000000000507");
//        paramMap.put("txndate", "");	
//        paramMap.put("txntime", "");	
//        paramMap.put("phone", "");
//		paramMap.put("txnmchntcd", "000000010000002");
//		paramMap.put("txnnetcd", "");
//		paramMap.put("txntermcd", "00001310");
//        paramMap.put("acctype", "00");
//        paramMap.put("txncode", "");
//        paramMap.put("holdname", "");
//		paramMap.put("holdtype", "");
//		paramMap.put("holdno", "");
//        paramMap.put("attach", "");       
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("txninfo", json);
//        param.put("signcode", "9C1D5F8F2F60DBB7AAE61F811C89D09114BCDC1E8402F51F59BDC832EA23782A7F8EB6894938739DD1EC4F8301A0CC04520DF5D34207F0C35A26B5AA5716A5999AE126D4527813119D4D6D5FD75A30C9336A1062D09D144A09806C5A3F845BA1ECCE0EF69DB20FBB5B9C2604DFD96047F5FDFEB87DF4BFCD0F2E0507011D752D");
//        //账户实名
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("refno", "000000000507");
//        paramMap.put("txndate", "20190618");	
//        paramMap.put("txntime", "154036");	
//        paramMap.put("phone", "RlKqZDEslS0iHPjgcP7r+w==");	
//        paramMap.put("password", "DA62DAA6EE8DE7B4");
//        paramMap.put("acctype", "00");
//        paramMap.put("ordid", "223");
//        paramMap.put("holdname", "0829");
//		paramMap.put("holdtype", "01");
//		paramMap.put("holdno", "0829");
//        paramMap.put("attach", "");       
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("txninfo", json);
//        param.put("signcode", "073A4F5C7890B866C672EBEBBC8586B8C80F4761703E3424F2BEB4174B584AAD2CA7A64A39D75EA519B6D4F50B9258F561CDF979E9CEFC0882BCA67750FEC592ACC28A61D871E07CA56B16B9BD2B56896A48453F8BE0F2B31F36C8EB0D771731D930056661284ACD3AB3D9AAE354DCB12FA7118B6FD39E20FF80B86B34A0271E");
        //余额查询
//        Gson gson = new Gson();
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("syssesq", "002");
//        paramMap.put("txndate", "20190618");	
//        paramMap.put("txntime", "19300501");	
//        paramMap.put("phone", "RlKqZDEslS0iHPjgcP7r+w==");
//        paramMap.put("acctype", "00"); 
//		paramMap.put("password", "DA62DAA6EE8DE7B4");
//        String json = gson.toJson(paramMap);
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("txninfo", json);
//        param.put("signcode", "41984319C3B4BF0655DCA51FC4760763513BA050F57767CA599D139A12753CA39DC022EA66A349E95A1D3AE84393B5F2E8A38F70F9CA40D8F1B7E9C8052F2F9C095E5DA9A178258F1760CA878C14F4C4F081CA87B5C8511AF6AE2273A8BA498BD7409C85F2AA308056444BE542E754D66C7CFA88BD282A83F5851E3A5B4F7463");
        //账户注销申请
//          Gson gson = new Gson();
//	      paramMap.put("mchntid", "000000010000002");
//	      paramMap.put("termid", "00001310");
//	      paramMap.put("syssesq", "002");
//	      paramMap.put("txndate", "20190618");	
//	      paramMap.put("txntime", "154401");	
//	      paramMap.put("phone", "TpQJySBjB554sWcosEgrgw==");
//	      paramMap.put("acctype", "00"); 
//	      String json = gson.toJson(paramMap);
//	      Map<String,Object> param = new HashMap<String,Object>();
//	      param.put("txninfo", json);
//	      param.put("signcode", "268E485254FB5ED058D85015F05F38D8025AD57267FC861AFB66F35AEB5A5AF6D39ED20F641F44311B751B841CA9015339F212FEB7FD1C731BF7DC6C5C0A359B85C0916987C2CBA481EF90CB9AF97A807450E71F5FC77ABC4AA09602F4651B7D7499FC01103A4B63D3671C23DAB92935B8226E832AB05F2AF5441D4F725CD300");
//        //账户注销
//          Gson gson = new Gson();
//	      paramMap.put("mchntid", "000000010000002");
//	      paramMap.put("termid", "00001310");
//	      paramMap.put("syssesq", "002");
//	      paramMap.put("txndate", "20190531");	
//	      paramMap.put("txntime", "14300501");	
//	      paramMap.put("phone", "TpQJySBjB554sWcosEgrgw==");
//	      paramMap.put("acctype", "00"); 
//	      paramMap.put("password", "C121DC72BF5E3600");
//	      paramMap.put("holdname", "0829");
//	      paramMap.put("holdtype", "01");
//	      paramMap.put("holdno", "0829");
//	      paramMap.put("ordid", "7845");
//	      paramMap.put("attach", "");
//	      String json = gson.toJson(paramMap);
//	      Map<String,Object> param = new HashMap<String,Object>();
//	      param.put("txninfo", json);
//	      param.put("signcode", "466A026E7195FC00935CCA8F848D1D9B62777D9B7E1E0B3BA93FF9292503091C63124A68F6E9DB889428385BA58CA70EA03DC279B2AC0A00EE26BC43E00C7734B80F4A4526063B8D9D99C3D2DC00E8B54FE264DE53B37A351F7B3BFB16A1E56C3BE2862CB227ED414EB6B0560BEC23A383EAF0D21B137DE7B8767347A7AF374A");
        
      //是否允许圈存
//        Gson gson = new Gson();
//	      paramMap.put("mchntid", "000000010000002");
//	      paramMap.put("termid", "00001310");
//	      paramMap.put("syssesq", "002");
//	      paramMap.put("txndate", "20190531");	
//	      paramMap.put("txntime", "14300501");	
//	      paramMap.put("cardNo", "3104990200020000829");
//	      paramMap.put("attach", "");
//	      String json = gson.toJson(paramMap);
//	      Map<String,Object> param = new HashMap<String,Object>();
//	      param.put("txninfo", json);
//	      param.put("signcode", "CF6F51242EE832BEC6458B39B5B3B49986A13F6D73C0E793AFB56D48BEA95B8201A446479208F2CCAC5E4707C1B6CE5270C5C000199E6A8D77DEE080E734E8973AA47226F6A051007DDC4F8C44CD818C4B851E0A81F13B62F4733650C3BC28A1F6020CC922247C2C85CF80289A8C636E483858B8307797C3408E52C286F51074");
        
//	      //客管系统接口
//	      Gson gson = new Gson();
//	      paramMap.put("holdname", "aBv8Nece7aINpQ0EVR1nDg==");
//	      paramMap.put("holdno", "Pi2Eobzl0S1KGmtNDv1xH1wTO6Y8wdpwn0VZVCEeNZw=");
//	      paramMap.put("holdtype", "00");
//	      paramMap.put("mchntid", "000000010000002");
//	      paramMap.put("termid", "00001310");
//	      String json = gson.toJson(paramMap);
//	      Map<String,Object> param = new HashMap<String,Object>();
//	      param.put("txninfo", json);
//	      param.put("signcode", "203F0D2F786409C6A6D8D26143C84127A43D39FB55FFA185D5CCBDE432CCECEB011EBA46B86BEED7F39ED81F3DA5AEAB393A879E4DC9263FFC1457BFF2B3E79652D2007F76287485E5CFAFA5263D9B5BC5DA8997C6C47D5C938F926171582ED5CD4A31076A5AE5868F49776A1BC2F03AB0E19B4671AC4461A223A805651CD918");
        
        
//        Gson gson = new Gson();
//	      paramMap.put("mchntid", "000000010000002");
//	      paramMap.put("termid", "00001310");
//	      paramMap.put("customerno", "0201906120000003306");
//	      String json = gson.toJson(paramMap);
//	      Map<String,Object> param = new HashMap<String,Object>();
//	      param.put("txninfo", json);
//	      param.put("signcode", "14B61DE78D51B1A44842B561881C8F16E3EDC2669B4A1978EC77CA95ECBD9DFE2EC6C1F09D17E7564BA25C3BB276E059C97EBFDD357D84889D5A93D363258627C61874AA07A674002ADFC2AAE447369D4CE8E1BBF82E2490BDBA9D5074E1054CA954CF148616EC20D05BF03B974C0DCC1CC62F400E0C0AEC2F743741C2CF3462");
        
        //账户圈存请求
//          Gson gson = new Gson();
//	      paramMap.put("mchntid", "000000010000002");
//	      paramMap.put("termid", "00001310");
//	      paramMap.put("password", "404DC3AC59706852");
//	      paramMap.put("syssesq", "112");
//	      paramMap.put("txndate", "20191125");	
//	      paramMap.put("txntime", "102205");
//	      paramMap.put("cardorg", "003");
//	      paramMap.put("cardno", "3104990200020000670");
//	      paramMap.put("random", "41AB2D78");
//	      paramMap.put("txnseq", "003");
//	      paramMap.put("befbal", "00001200");
//	      paramMap.put("txnamt", "500");
//	      paramMap.put("txntermid", "77777778");
//	      paramMap.put("mac1", "1B8289B2");
//	      paramMap.put("phone", "57b2x/0j5kJObpP5UCfdyQ==");
//	      paramMap.put("cardcnt", "0026");
//	      paramMap.put("attach", "");
//	      String json = gson.toJson(paramMap);
//	      Map<String,Object> param = new HashMap<String,Object>();
//	      param.put("txninfo", json);
//	      param.put("signcode", "75495B1F436C0DE04B75E2B563BCEF0E4B954D15320E11230DC9AADC9568308C6D1204D19992821A028073549E409C615C25D1D59D617B11277B1BE74837141B8DCBEF64C5B936431CBF13B8AC66194E49E8B7A568E2F9715E793E0402BB299F5CC958DAC5B69685EA7601508095AD1AEC42A5F04A1E6B07B1EB2E1B2E1BC0A6");
	      
	     //账户圈存确认
	      Gson gson = new Gson();
	      paramMap.put("mchntid", "000000010000002");
	      paramMap.put("termid", "00001310");
	      paramMap.put("password", "404DC3AC59706852");
	      paramMap.put("syssesq", "112");
	      paramMap.put("txndate", "20191125");	
	      paramMap.put("txntime", "102205");
	      paramMap.put("cardorg", "003");
	      paramMap.put("cardno", "3104990200020000670");
	      paramMap.put("oprresult", "00");
	      paramMap.put("carddate", "20191125");
	      paramMap.put("cardtime", "102228");
	      paramMap.put("random", "41AB2D78");
	      paramMap.put("txnamt", "500");
	      paramMap.put("afteramt", "00001700");
	      paramMap.put("txnseq", "2");
	      paramMap.put("TAC", "00000000");
	      paramMap.put("orgsyssesq", "001411");
	      paramMap.put("refno", "000000005132");    
	      paramMap.put("orgbatchno", "0");
	      paramMap.put("orgtermseq", "000001411");
	      paramMap.put("orgtransdate", "20191125");
	      paramMap.put("orgauthmode", "1");
	      paramMap.put("orgauthinstid", "23000001");
	      paramMap.put("phone", "57b2x/0j5kJObpP5UCfdyQ==");
	      paramMap.put("attach", "");
	      String json = gson.toJson(paramMap);
	      Map<String,Object> param = new HashMap<String,Object>();
	      param.put("txninfo", json);
	      param.put("signcode", "A346CD84B5B76C0A42251576C2EE0EABBCFB0F4D01E812DADCC325F78CBF1D713DB5C3C36DE75913424A3D3D1C01068467870F24EADFF6591D7216165B52A6DFFBE4E559A04C70329A1776615847CFA73971564F10DAEB4083495807CEEA617A12F93213B4C79E0FA16965B9D18137B49D8C2DA4F22C4A949AF85CBF53EE321D");
	    
	      
	      
//        paramMap.put("mchntid", "000000010000002");
//        paramMap.put("termid", "00001310");
//        paramMap.put("holdname", "0811");
//        paramMap.put("holdno", "0811");
//        paramMap.put("holdtype", "01");
//	      param.put("cardNo", "3104990200020000688");
//	      param.put("cardorg", "003");
//	      String json = gson.toJson(param);
//	      paramMap.put("txninfo", json);
//	      paramMap.put("signcode", "9CB25E3D4A4CB152A5C7CD65D3F85B260FDF7ED74F01C6B8455F90DD5698E1C348BFD41EE58C82D09F02BF46A256024A652E5FFF777E363B9AD3D6DD34BFDA26B61366C94B45E0D1167590198712C5858D4001533F039B881AE94C3412B6AD5EF26D08A59FDAFD8E19241953803FA8AC22AC42EDA7C2DAB07525D6FDB37EED09");
      
        
        
//       Gson gson = new Gson();
//      paramMap.put("cardNo", "3104990200020000688");
//      paramMap.put("cardorg", "003");
//      //String json = JSON.toJSONString(paramMap);
//      String json = gson.toJson(paramMap);
//      Map<String,Object> param = new HashMap<String,Object>();
//      param.put("txninfo", json);
//      param.put("signcode", "7F8B7CB96C6D95A64A81B9284039235CA74DAB4D4EEE78C60D612541D4872AA7C88C3A0CDD8163BEF0F15F70134FE262B40BE408D981B249E64A6E9D6FE0D069B44E39CA252E362C3FDCE44D575312CDA91DD70653A6082954D974E794DE57811F5624D6AAEC3DBD8588D2B158DB94902412FB56718805C1CD4ADD5D6EB390E8");
        
        
        //String resultJson = HttpClientUtil.httpPost("http://127.0.0.1:8080/citytxnservice/acct/ver1/close", paramMap);
        //String resultJson = HttpClientUtil.httpPost("http://127.0.0.1:8080/citytxnservice/term/ver1/txnQuery", paramMap);
        //String resultJson = HttpClientUtil.httpPost("http://127.0.0.1:8080/citytxnservice/issue/ver1/order", paramMap);
        //String resultJson = HttpClientUtil.httpPost("http://127.0.0.1:8080/citytxnservice/issue/ver1/cardinfo", paramMap);
        String resultJson = HttpClientUtil.httpPost("http://127.0.0.1:28090/acc/accEcashSaveConfirm", param);  //
        System.out.println("------senddata:"+json);
   //     String resultJson = HttpClientUtil.httpPost("http://127.0.0.1:8888/acc/resetPwd", param); 	//密码重置
    //    String resultJson = HttpClientUtil.httpPost("http://127.0.0.1:8888/acc/accEcashSave", param); 	//圈存请求
        //String resultJson = HttpClientUtil.httpPost("http://127.0.0.1:8888/acc/accEcashSaveConfirm", param); 	//圈存确认
        //String resultJson = HttpClientUtil.httpPost("http://127.0.0.1:8888/acc/cardInfoQuery", param); 	//客管卡信息查询
        //String resultJson = HttpClientUtil.httpPost("http://172.17.20.15:28080/acc/cardInfoQuery", param); 
        //String resultJson = HttpClientUtil.httpPost("http://172.17.20.15:8095/Zjbcardservice/account/cardInfoQuery", paramMap);
        //String resultJson = HttpClientUtil.httpPost("http://127.0.0.1:8080/citytxnservice/charge/ver1/mchntbalnce", paramMap);
        //String resultJson = HttpClientUtil.httpPost("http://127.0.0.1:8080/citytxnservice/active/ver1/req", paramMap);
        //String resultJson = HttpClientUtil.httpPost("http://127.0.0.1:8080/citytxnservice/active/ver1/order", paramMap);
        System.out.print(resultJson);
    }
}
