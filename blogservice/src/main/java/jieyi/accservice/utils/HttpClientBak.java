package jieyi.accservice.utils;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

public class HttpClientBak {
	private final static Logger logger = LoggerFactory.getLogger(HttpClientBak.class);

	private CloseableHttpClient createSSLClientDefault(){
		try {
             SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
                 //信任所有
                 public boolean isTrusted(X509Certificate[] chain,
                                 String authType) throws CertificateException {
                     return true;
                 }
             }).build();
             SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext);
             return HttpClients.custom().setSSLSocketFactory(sslsf).build();
         } catch (KeyManagementException e) {
        	 logger.error("Error:", e);
         } catch (NoSuchAlgorithmException e) {
        	 logger.error("Error:", e);
         } catch (KeyStoreException e) {
        	 logger.error("Error:", e);
         }
         return  HttpClients.createDefault();
	}

	public String httpPostSsl(String url, String sendData, String charset, Map<String, String> headerMap){
        CloseableHttpClient httpclient = this.createSSLClientDefault();  
        HttpPost httpPost = new HttpPost(url);
        String recvData = null;
        try {
            httpPost.setEntity(new StringEntity(sendData, charset));
        	
            if(headerMap != null){
	            for (Entry<String, String> entry : headerMap.entrySet()) {
	            	String key = entry.getKey().toString();
	            	String value = entry.getValue().toString();
	            	httpPost.setHeader(key, value);
               }
            }
            
			logger.debug("request url:" + httpPost.getURI());
			logger.debug("request header:" + headerMap);
			logger.debug("request charset:" + charset);
			logger.debug("request data:" + sendData);
			
            CloseableHttpResponse resp = httpclient.execute(httpPost);
            try {  
                HttpEntity entity = resp.getEntity();  
                
    			if (resp.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
    				logger.debug("httpPost fail, status code = " + resp.getStatusLine().getStatusCode());
    			}
    				
    			if (entity != null) {  
                    recvData = EntityUtils.toString(entity, charset);
    				logger.debug("Response content: " + recvData); 
                }  
            } finally {  
            	if(resp != null){
            		resp.close();
            	}
            }  
        } catch (Exception e) {  
        	logger.error("Error:", e);
        	e.printStackTrace();
        } finally {  
            // 关闭连接,释放资源    
            try { 
            	if(httpclient != null){
            		httpclient.close(); 
            	}
            } catch (IOException e) {  
            	logger.error("Error:", e);
            }  
        }  
        return recvData;
	}
	
	
	public String httpPostSsl(String url, List<NameValuePair> params, String charset, Map<String, String> headerMap){
        CloseableHttpClient httpclient = this.createSSLClientDefault();  
        HttpPost httpPost = new HttpPost(url);
        String recvData = null;
        try {
        	UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(params,"UTF-8");
        	//添加参数
        	httpPost.setEntity(urlEncodedFormEntity);
            
            if(headerMap != null){
	            for (Entry<String, String> entry : headerMap.entrySet()) {
	            	String key = entry.getKey().toString();
	            	String value = entry.getValue().toString();
	            	httpPost.setHeader(key, value);
               }
            }
            
			logger.debug("request url:" + httpPost.getURI());
			logger.debug("request header:" + headerMap);
			logger.debug("request charset:" + charset);
			logger.debug("request params:" + params);
			
            CloseableHttpResponse resp = httpclient.execute(httpPost);
            try {  
                HttpEntity entity = resp.getEntity();  
                
    			if (resp.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
    				logger.debug("httpPost fail, status code = " + resp.getStatusLine().getStatusCode());
    			}
    				
    			if (entity != null) {  
                    recvData = EntityUtils.toString(entity, charset);
    				logger.debug("Response content: " + recvData); 
                }  
            } finally {  
            	if(resp != null){
            		resp.close();
            	}
            }  
        } catch (Exception e) {  
        	logger.error("Error:", e);
        	e.printStackTrace();
        } finally {  
            // 关闭连接,释放资源    
            try { 
            	if(httpclient != null){
            		httpclient.close(); 
            	}
            } catch (IOException e) {  
            	logger.error("Error:", e);
            }  
        }  
        return recvData;
	}
}
