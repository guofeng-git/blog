package jieyi.accservice.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "httpClientService")
public class HttpClientService {

    public  String doPost(String httpUrl, String param, String charset) throws Exception {
        HttpURLConnection connection = null;
        InputStream is = null;
        OutputStream os = null;
        BufferedReader br = null;
        String result = null;
        try {
        	try{
        		URL url = new URL(httpUrl);
                // 通过远程url连接对象打开连接
                connection = (HttpURLConnection) url.openConnection();
                // 设置连接请求方式
        	} catch (IOException ex) {
				throw new Exception("CommunicationErrorcode.SOCKETCONNFAILED");// 通讯连接失败
			}
        	
        	try{
        		 connection.setRequestMethod("POST");
                 // 设置连接主机服务器超时时间：15000毫秒
                 connection.setConnectTimeout(20000);
                 // 设置读取主机服务器返回数据超时时间：60000毫秒
                 connection.setReadTimeout(60000);

                 // 默认值为：false，当向远程服务器传送数据/写数据时，需要设置为true
                 connection.setDoOutput(true);
                 // 默认值为：true，当前向远程服务读取数据时，设置为true，该参数可有可无
                 connection.setDoInput(true);
                 // 设置传入参数的格式:请求参数应该是 name1=value1&name2=value2 的形式。
                 connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                 // 通过连接对象获取一个输出流
        	} catch (IOException ex) {
				throw new Exception("CommunicationErrorcode.PROTOCOLERROR");// 通讯协议错误
			}
            
            try{
                os = connection.getOutputStream();
                // 通过输出流对象将参数写出去/传输出去,它是通过字节数组写出的
                os.write(param.getBytes(charset));
                os.flush();
            } catch (IOException e) {
			    throw new Exception("CommunicationErrorcode.SOCKETSENDERROR");
		    }
            
            int responseCode;
            try{
            	responseCode = connection.getResponseCode();
            }catch(Exception e){
            	throw new Exception("CommunicationErrorcode.RESPONSEERROR");// 接受后台返回异常
            }
            
            // 通过连接对象获取一个输入流，向远程读取
            if (responseCode == 200) {
                try{
                    is = connection.getInputStream();
                    byte[] buf = new byte[1024];
    				// 定义一个StringBuffer用来存放字符串
    				StringBuffer sb = new StringBuffer();
    				// 开始读取数据
    				int len = 0;// 每次读取到的数据的长度
    				while ((len = is.read(buf)) != -1) {// len值为-1时，表示没有数据了
    					// append方法往sb对象里面添加数据
    					sb.append(new String(buf, 0, len, charset));
    				}
    				result = sb.toString();
                } catch (IOException ex) {
        			if (java.net.SocketTimeoutException.class.isInstance(ex)) {
        				throw new Exception("CommunicationErrorcode.SOCKETNORESPONSE");// 后台无应答
        			} else {
        				throw ex;
        			}
        		}   
            }else{
                throw new Exception("CommunicationErrorcode.RESPONSEERROR");// 接受后台返回异常
            }
        } catch (Exception e) {
           throw e;
        } finally {
            // 关闭资源
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != os) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // 断开与远程地址url的连接
            if (null != connection) {
                try {
                	 connection.disconnect();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } 
        }
        return result;
    }
    
	public String doPostJson(String httpUrl, String param, String charset)
			throws Exception {
		    HttpURLConnection connection = null;
	        InputStream is = null;
	        OutputStream os = null;
	        BufferedReader br = null;
	        String result = null;
	        try {
	        	try{
	        		URL url = new URL(httpUrl);
	                // 通过远程url连接对象打开连接
	                connection = (HttpURLConnection) url.openConnection();
	                // 设置连接请求方式
	        	} catch (IOException ex) {
					throw new Exception("CommunicationErrorcode.SOCKETCONNFAILED");// 通讯连接失败
				}
	        	
	        	try{
	        		 connection.setRequestMethod("POST");
	                 // 设置连接主机服务器超时时间：15000毫秒
	                 connection.setConnectTimeout(20000);
	                 // 设置读取主机服务器返回数据超时时间：60000毫秒
	                 connection.setReadTimeout(60000);

	                 // 默认值为：false，当向远程服务器传送数据/写数据时，需要设置为true
	                 connection.setDoOutput(true);
	                 // 默认值为：true，当前向远程服务读取数据时，设置为true，该参数可有可无
	                 connection.setDoInput(true);
	                 // 设置传入参数的格式:请求参数应该是 name1=value1&name2=value2 的形式。
	                 //connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	                 connection.setRequestProperty("Content-Type","application/json; charset=" + charset);
	                 connection.setRequestProperty("accept","application/json");

	                 // 通过连接对象获取一个输出流
	        	} catch (IOException ex) {
					throw new Exception("CommunicationErrorcode.PROTOCOLERROR");// 通讯协议错误
				}
	            
	            try{
	                os = connection.getOutputStream();
	                // 通过输出流对象将参数写出去/传输出去,它是通过字节数组写出的
	                os.write(param.getBytes(charset));
	                os.flush();
	            } catch (IOException e) {
				    throw new Exception("CommunicationErrorcode.SOCKETSENDERROR");
			    }
	            
	            int responseCode;
	            try{
	            	responseCode = connection.getResponseCode();
	            }catch(Exception e){
	            	throw new Exception("CommunicationErrorcode.RESPONSEERROR");// 接受后台返回异常
	            }
	            
	            // 通过连接对象获取一个输入流，向远程读取
	            if (responseCode == 200) {
	                try{
	                    is = connection.getInputStream();
	                    byte[] buf = new byte[1024];
	    				// 定义一个StringBuffer用来存放字符串
	    				StringBuffer sb = new StringBuffer();
	    				// 开始读取数据
	    				int len = 0;// 每次读取到的数据的长度
	    				while ((len = is.read(buf)) != -1) {// len值为-1时，表示没有数据了
	    					// append方法往sb对象里面添加数据
	    					sb.append(new String(buf, 0, len, charset));
	    				}
	    				result = sb.toString();
	                } catch (IOException ex) {
	        			if (java.net.SocketTimeoutException.class.isInstance(ex)) {
	        				throw new Exception("CommunicationErrorcode.SOCKETNORESPONSE");// 后台无应答
	        			} else {
	        				throw ex;
	        			}
	        		}   
	            }else{
	                throw new Exception("CommunicationErrorcode.RESPONSEERROR");// 接受后台返回异常
	            }
	        } catch (Exception e) {
	           throw e;
	        } finally {
	            // 关闭资源
	            if (null != br) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            if (null != os) {
	                try {
	                    os.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            if (null != is) {
	                try {
	                    is.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            // 断开与远程地址url的连接
	            
	            if (null != connection) {
	                try {
	                	 connection.disconnect();
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }   
	        }
	        return result;
	}


}
