package sv.com.hsr.gen.com;

import java.io.File;

import sv.com.hsr.gen.dto.MyTemplate;

public class GeneraEurekaServer {

	public static void create(MyTemplate myTemplate) throws Exception {
		String filePath = myTemplate.getPackagePath();
		myTemplate.setProyecto(myTemplate.getRootPath() + File.separator+"springboot-service-eureka-server");
		
		
	}
}
