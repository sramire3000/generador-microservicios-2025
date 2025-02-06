package sv.com.hsr.gen;

import java.io.IOException;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sv.com.hsr.gen.com.GeneraHexagonal;
import sv.com.hsr.gen.dto.KeyboardIn;
import sv.com.hsr.gen.dto.MyTemplate;

@SpringBootApplication
public class GeneradorMicroserviciosApplication {
	
	private static Logger logger = org.slf4j.LoggerFactory.getLogger(GeneradorMicroserviciosApplication.class);

	public static void main(String[] args) {
		
		SpringApplication.run(GeneradorMicroserviciosApplication.class, args);
		
		KeyboardIn keyboardIn = new KeyboardIn();
		
		//Pregunta por los datos
		keyboardIn.load();
		
		logger.info(keyboardIn.toString());
		
		try {
			
			if (keyboardIn.getType().trim().toUpperCase().equals("HEXAGONAL")) {
				GeneHexagonal(keyboardIn);
			}			
			
//			if (keyboardIn.getType().trim().toUpperCase().equals("EUREKA")) {
//				GeneraEureka(keyboardIn);
//			}
//			
//			if (keyboardIn.getType().trim().toUpperCase().equals("NORMAL"))         {
//				//doGenerarBaseNormal(keyboardIn);
//				//doGenerarMicroNormal(keyboardIn);				
//			}else if (keyboardIn.getType().trim().toUpperCase().equals("EUREKA"))   {		
//				//GeneraEureka(keyboardIn);
//			}else if (keyboardIn.getType().trim().toUpperCase().equals("CONFIG-SERVER"))   {		 
//				//GeneraConfig(keyboardIn);
//			}else if (keyboardIn.getType().trim().toUpperCase().equals("GATEWAY-SERVER"))   {		 
//				//GeneraGateway(keyboardIn);
//			}else if (keyboardIn.getType().trim().toUpperCase().equals("SERVICE-COMMONS-USUARIO"))   {		
//				//GeneraCommonsUsuario(keyboardIn);
//			}else if (keyboardIn.getType().trim().toUpperCase().equals("SERVICE-USUARIOS"))   {		
//				//GeneraServicioUsuario(keyboardIn);
//			}else if (keyboardIn.getType().trim().toUpperCase().equals("SERVICE-OUTH"))   {
//				//GeneraOuth(keyboardIn);
//			}else if (keyboardIn.getType().trim().toUpperCase().equals("SERVICE-PDF"))   {
//				//GeneraPdf(keyboardIn);
//			}else if (keyboardIn.getType().trim().toUpperCase().equals("COMMONS"))  {
//				//doGeneraCommonsLibreria(keyboardIn);
//			}else if (keyboardIn.getType().trim().toUpperCase().equals("CLOUD"))    {
//				//doGenerarCloud(keyboardIn);
//		    }else if (keyboardIn.getType().trim().toUpperCase().equals("API"))      {
//		    	//doGenerarApi(keyboardIn);
//			}else if (keyboardIn.getType().trim().toUpperCase().equals("FEINGCLI")) {
//				//doGenerarFeing(keyboardIn);
//			}else if (keyboardIn.getType().trim().toUpperCase().equals("CUSCA"))  {
//				//doGenerarBaseCusca(keyboardIn);
//				//doGenerarMicroCusca(keyboardIn);
//			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		logger.info("Fin......");
		System.exit(-1);		
	}
	
	private static void GeneHexagonal(KeyboardIn keyboardIn) throws Exception, IOException{
		MyTemplate myTemplate = new MyTemplate();
		
		myTemplate.setRootPath(keyboardIn.getProy_target()); 
		myTemplate.setPackageNameBase(keyboardIn.getProy_package());
		myTemplate.setArtifact(keyboardIn.getArtifact());
		myTemplate.setDescripcion(keyboardIn.getDescripcion());
		myTemplate.setGroup(keyboardIn.getGroup());
		myTemplate.setJdk(keyboardIn.getJdk());	
		myTemplate.setType(keyboardIn.getType());
		myTemplate.setSource(keyboardIn.getSource());
		

    	myTemplate.setPackageNameBase(keyboardIn.getProy_package());
    	myTemplate.setPackageName(keyboardIn.getProy_package()+"."+myTemplate.getNameApp());  
    	
    	logger.info(myTemplate.toString());
    	
    	GeneraHexagonal.load(myTemplate);			
		
	}

//	///GENERA MICROSERVICIO EUREKA SERVER
//	private static void GeneraEureka(KeyboardIn keyboardIn) throws Exception, IOException{
//		MyTemplate myTemplate = new MyTemplate();
//		myTemplate.setRootPath(keyboardIn.getProy_target()); 
//		myTemplate.setPackageNameBase(keyboardIn.getProy_package());
//		myTemplate.setJdk(keyboardIn.getJdk());		
//		myTemplate.setType(keyboardIn.getType());
//		myTemplate.setEmpresa(keyboardIn.getEmpresa());
//		
//    	//Eureka Server
//    	System.out.println("Generando tipo EUREKA SERVER.....");
//    	myTemplate.setPackageNameBase(keyboardIn.getProy_package());
//    	myTemplate.setPackageName(keyboardIn.getProy_package()+".eureka");  
//    	GeneraEurekaServer.create(myTemplate);			
//	}	

}
