package jieyi.accservice.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.interfaces.RSAPrivateKey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import jieyi.accservice.utils.NumberStringUtil;
import jieyi.accservice.utils.RsaUtil;

public class HttpClientFor62 {
	protected final static Logger logger = LoggerFactory.getLogger(HttpClientFor62.class);

    protected static final String DATA_ENCODE = "UTF-8";
    protected int bindPort = 51001;
    protected String ip = "localhost";

    
    //62bin圈存所用
    protected String modulus = "0083B1BF08A68884EB03A02108B47B46287C0339C8A8F210386B9090283BB91C0EFDBBCF865B556BD17F26924891B1A8659BC1E335890D8535391DA80ADE1D0631084F706B41C6C995CE1584F3EFF1DE529E2C4282C484B32B20AC468679D65C7CDE16B9390FA64469379A12C6F91080AE904027987181342E66F744B44A687951";
    protected String exponent = "4BF94EEBFEA6E387711FFFEEB5B0285952B1C9B42942FC7890156614CFDF8A805B80EDC7E508F29A797017142679075D16EE53D59EAB5E1DC645859C3F671F1A737BCF46F14FA579DA0A21068AD471611D183EFD675A778B3AE58954924BD1FAA4EFCFD436AAD48EFABD4928D7380DC52B36678FFF4AB6C761D59E920C7FD7C1";
    public HttpClientFor62(int bindPort, String ip) {
        this.bindPort = bindPort;
        this.ip = ip;
    }

    public String sendAndRecieve(String txninfo) {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("txninfo", txninfo);
        
        try {
            RSAPrivateKey privateKey = RsaUtil.loadPrivateKey(modulus, exponent, 16);
            byte[] signData = SignatureUtil.signature(txninfo.getBytes(DATA_ENCODE), privateKey, "");
            jsonObject.put("signcode", NumberStringUtil.bytesToHexString(signData));
        } catch (Exception e) {
            e.printStackTrace();
        }

        HttpURLConnection connection = null;
        OutputStream out = null;
        InputStream in = null;
        try {
            URL url = new URL("http://" + ip + ":" + bindPort);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(30000);
            connection.setReadTimeout(30000);
            connection.setDoOutput(true);
            
            out = connection.getOutputStream();
            out.write(("data=" + jsonObject.toString()).getBytes(DATA_ENCODE));
            out.flush();

            in = connection.getInputStream();
            
            //下面对获取到的输入流进行读取
            BufferedReader bufr = new BufferedReader(new InputStreamReader(in));
            StringBuilder response = new StringBuilder();
            String line = null;
            while ((line = bufr.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            /*
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.disconnect();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            */
        }
        return null;
    }
}
