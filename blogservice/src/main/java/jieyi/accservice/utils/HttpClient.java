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

public class HttpClient {
	protected final static Logger logger = LoggerFactory.getLogger(HttpClient.class);

    protected static final String DATA_ENCODE = "UTF-8";
    protected int bindPort = 51001;
    protected String ip = "localhost";

    protected String modulus = "8B6D8CAE9C9494FC1AE3C90E5869111447FA19F66F62D904787C973862D08B0056CA891ECA0CA7CF5D38407BA7AF8FC9A83624CDC46B9A47B0FEBAD0FC730D80C7C1CA1088731D758C6D26A3A2DF7BD7634EEA107B6D752609A16C9C671758A853135214425C58B0DD25779DFB070B08817F0828C72BEF11A5D7F998D0F81D49";
    protected String exponent = "4782B76DF3372DB6A3E00285CE088D4EF69FAAE33F3BD68CB9734568111E5EBC9CC7224EDD58625533BD9F2D0CD3398F372C15F24774DCDB3A475BEFC61B08682A941F8B170B82944FB3CEBBD12E37190853271B88018F55A30E788CA2EF944BB0DDB3BA7D08426D0825A040AF3D082DDCA238EAC5445D372891AE6AF11D7FB5";
    
    public HttpClient(int bindPort, String ip) {
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
