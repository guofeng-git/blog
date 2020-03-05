package jieyi.accservice;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
@MapperScan(basePackages = {"jieyi.accservice.dao", "jieyi.accservice.restcontroller"})
public class AccPreServiceApplication {
	private static Logger logger = LoggerFactory.getLogger(AccPreServiceApplication.class);


	public static void main(String[] args) throws Exception {					
		SpringApplication.run(AccPreServiceApplication.class, args);
		logger.debug("rest service started success!");
	}
}
