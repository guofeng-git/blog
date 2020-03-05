package jieyi.accservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import jieyi.tools.commuclient_8583.sendmsg.JieYiCommunication8583;

/**
 * 初始化JieYiCommunication8583，仅需项目启动时初始化一次
 * 
 * @author YUAN DONG
 *
 */
@Component
public class JieYiCommunication8583C {

	private static JieYiCommunication8583 jieYiCommunication8583;

	// static {
	// JieYiCommunication8583C.jieYiCommunication8583=new
	// JieYiCommunication8583("E:\\Workspace\\xintian_develop\\webservice\\src\\main\\resources\\conf\\datagramxml");
	// }

	@Value("${communicate.datagramxmlpath}")
	private String datagramxmlpath;

	// @PostConstruct
	// public void getxx() {
	// JieYiCommunication8583C.jieYiCommunication8583 = new
	// JieYiCommunication8583("E:\\Workspace\\xintian_develop\\webservice\\src\\main\\resources\\conf\\datagramxml");
	// }

	public static JieYiCommunication8583 getJieYiCommunication8583() {
		return jieYiCommunication8583;
	}

	@Autowired
	public void init(JieYiCommunication8583 jieYiCommunication8583) {
		JieYiCommunication8583C.jieYiCommunication8583 = jieYiCommunication8583;
	}

	@Bean
	public JieYiCommunication8583 getBean() {
		System.out.println("---xml路径："+System.getProperty("user.dir") + datagramxmlpath);
		JieYiCommunication8583 jieYiCommunication8583 = new JieYiCommunication8583(System.getProperty("user.dir") + datagramxmlpath);
//		Map<String, List<DatagramConfig>> map = CommonParam.commonMap;
//		List<DatagramConfig> list = map.get("datagramconfig_E:/Workspace/xintian_develop/webservice/src/main/resources/conf/datagramxml");
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getName());
//		}
		return jieYiCommunication8583;
	}
}
