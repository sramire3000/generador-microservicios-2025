package sv.com.hsr.gen.com;

import java.io.File;
import java.io.IOException;

import com.google.common.base.CaseFormat;

import sv.com.hsr.gen.dto.MyTemplate;
import sv.com.hsr.gen.util.UtilCopy;
import sv.com.hsr.gen.util.Utils;

public class GeneraHexagonal {

	public static void load(MyTemplate myTemplate) throws IOException, Exception  {
		String filePath = myTemplate.getPackagePath();
		
		myTemplate.setProyecto(myTemplate.getRootPath());		
		
		//.classpath
		myTemplate.setTemplateName("classpath.txt");
		myTemplate.setFileName(".classpath");
		myTemplate.setDir(new File(myTemplate.getProyecto()));
		UtilCopy.CopyFile(myTemplate);			
		
		//.factorypath
		myTemplate.setTemplateName("factorypath.txt");
		myTemplate.setFileName(".factorypath");
		myTemplate.setDir(new File(myTemplate.getProyecto()));
		UtilCopy.CopyFile(myTemplate);			
		
		//.gitattributes
		myTemplate.setTemplateName("gitattributes.txt");
		myTemplate.setFileName(".gitattributes");
		myTemplate.setDir(new File(myTemplate.getProyecto()));
		UtilCopy.CopyFile(myTemplate);		
		
		//.gitignore
		myTemplate.setTemplateName("gitignore.txt");
		myTemplate.setFileName(".gitignore");
		myTemplate.setDir(new File(myTemplate.getProyecto()));
		UtilCopy.CopyFile(myTemplate);		
		
		//.project
		myTemplate.setTemplateName("project.txt");
		myTemplate.setFileName(".project");
		myTemplate.setDir(new File(myTemplate.getProyecto()));
		UtilCopy.CopyFile(myTemplate);		
		Utils.replace("<name>spring-hexagonal</name>", "<name>"+myTemplate.getArtifact()+"</name>", myTemplate);			
		
		
		//HELP.md
		myTemplate.setTemplateName("HELP.md.txt");
		myTemplate.setFileName("HELP.md");
		myTemplate.setDir(new File(myTemplate.getProyecto()));
		UtilCopy.CopyFile(myTemplate);	
		
		//mvnw
		myTemplate.setTemplateName("mvnw.txt");
		myTemplate.setFileName("mvnw");
		myTemplate.setDir(new File(myTemplate.getProyecto()));
		UtilCopy.CopyFile(myTemplate);			
		
		//mvnw.cmd
		myTemplate.setTemplateName("mvnw.cmd.txt");
		myTemplate.setFileName("mvnw.cmd");
		myTemplate.setDir(new File(myTemplate.getProyecto()));
		UtilCopy.CopyFile(myTemplate);	
		
		//pom.xml
		myTemplate.setTemplateName("pom.xml.txt");
		myTemplate.setFileName("pom.xml");
		myTemplate.setDir(new File(myTemplate.getProyecto()));
		UtilCopy.CopyFile(myTemplate);	
		
		Utils.replace("<groupId>com.example</groupId>", "<groupId>"+myTemplate.getGroup()+"</groupId>", myTemplate);		
		Utils.replace("<artifactId>spring-demo-hexagonal</artifactId>", "<artifactId>"+myTemplate.getArtifact()+"</artifactId>", myTemplate);
		Utils.replace("<name>spring-demo-hexagonal</name>", "<name>"+myTemplate.getArtifact()+"</name>", myTemplate);
		Utils.replace("<description>Demo project for Spring Boot</description>", "<description>"+myTemplate.getDescripcion()+"</description>", myTemplate);
		
		//maven-wrapper.jar
		myTemplate.setTemplateName("maven-wrapper.jar");
		myTemplate.setFileName("maven-wrapper.jar");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator + ".mvn/wrapper"));
		UtilCopy.CopyFile(myTemplate);
		
		
		//maven-wrapper.properties
		myTemplate.setTemplateName("maven-wrapper.properties.txt");
		myTemplate.setFileName("maven-wrapper.properties");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator + ".mvn/wrapper"));
		UtilCopy.CopyFile(myTemplate);
		
		
		//MavenWrapperDownloader.java
		myTemplate.setTemplateName("MavenWrapperDownloader.java");
		myTemplate.setFileName("MavenWrapperDownloader.java");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator + ".mvn/wrapper"));
		UtilCopy.CopyFile(myTemplate);		
		
		//org.eclipse.core.resources.prefs
		myTemplate.setTemplateName("org.eclipse.core.resources.prefs");
		myTemplate.setFileName("org.eclipse.core.resources.prefs");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator + ".settings"));
		UtilCopy.CopyFile(myTemplate);			
		
		//org.eclipse.jdt.apt.core.prefs
		myTemplate.setTemplateName("org.eclipse.jdt.apt.core.prefs");
		myTemplate.setFileName("org.eclipse.jdt.apt.core.prefs");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator + ".settings"));
		
		//org.eclipse.jdt.core.prefs
		myTemplate.setTemplateName("org.eclipse.jdt.core.prefs");
		myTemplate.setFileName("org.eclipse.jdt.core.prefs");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator + ".settings"));
		
		//org.eclipse.m2e.core.prefs
		myTemplate.setTemplateName("org.eclipse.m2e.core.prefs");
		myTemplate.setFileName("org.eclipse.m2e.core.prefs");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator + ".settings"));		
		
		//org.springframework.ide.eclipse.prefs
		myTemplate.setTemplateName("org.springframework.ide.eclipse.prefs");
		myTemplate.setFileName("org.springframework.ide.eclipse.prefs");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator + ".settings"));		
		
		//application.properties
		myTemplate.setTemplateName("application.properties.txt");
		myTemplate.setFileName("application.properties");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator + "src/main/resources"));	
		UtilCopy.CopyFile(myTemplate);
		Utils.replace("spring.application.name=spring-demo-hexagonal", "spring.application.name="+myTemplate.getArtifact(), myTemplate);		
		Utils.replace("logging.file.name=/logs/demo-hexagonal-service/demo-hexagonal-service.log", "logging.file.name=/logs/"+myTemplate.getArtifact()+"/"+myTemplate.getArtifact()+".log", myTemplate);
		
		//Main
		String camelCaseMain = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, myTemplate.getArtifact().replaceAll("-", "_"));
		myTemplate.setTemplateName("Application.txt");
		myTemplate.setFileName(camelCaseMain+"Application.java");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath));
		
		Utils.createJavaFile(myTemplate);		
		Utils.replace("SpringDemoHexagonalApplication", camelCaseMain+"Application", myTemplate);	
		Utils.replace("package com.example.demo;","package "+ myTemplate.getPackageName()+";", myTemplate);
		Utils.replace("---------- API core Service Started ----------", "---------- "+myTemplate.getArtifact()+" Started ----------", myTemplate);
		
		//Creacion de Carpetas
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "application"));		
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "application/ports"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "application/ports/input"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "application/ports/output"));
		
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "domain"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "domain/exception"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "domain/model"));
		
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/input/rest"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/input/rest/mapper"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/input/rest/model"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/input/rest/model/request"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/input/rest/model/response"));
		
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/output/persistence"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/output/persistence/entity"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/output/persistence/mapper"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/output/persistence/repository"));
		
		
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "utils"));
		
		//create application.ports.input.IStudentServicePort
		createApplicationPortsInputServicePort(myTemplate, "IServicePort.txt");
		createApplicationPortsOutPutPersistencePort(myTemplate, "IPersistencePort.txt");
		
		
	}
	
	



	public static void createApplicationPortsInputServicePort(MyTemplate myTemplate, String template) throws Exception{
		 
			String filePath = myTemplate.getPackagePath();
			myTemplate.setProyecto(myTemplate.getRootPath());	
			myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "application/ports/input"));
			myTemplate.setTemplateName(template);

	    	String sCarpAct = System.getProperty("user.dir") + File.separator + myTemplate.getSource();
	    	
	    	
	    	File carpeta = new File(sCarpAct);
	    	String[] listado = carpeta.list();
	    	
	    	if (listado == null || listado.length == 0) {
	    	    System.out.println("No hay elementos dentro de la carpeta actual "+sCarpAct);
	    	    return;
	    	}
	    	else {
	    		
	    	    for (int i=0; i< listado.length; i++) {
	    	    	String archivo           = listado[i];
	    	    	String archivo_sin_ext   = listado[i].substring(0, listado[i].lastIndexOf("."));
	    	    	String entityClassName   = Utils.ConvertCamelCase(archivo_sin_ext);
	    	    	String entityName        = archivo_sin_ext.toLowerCase();
	    	    	String collectionName    = archivo_sin_ext.toLowerCase();
	 	    	
	    	    	myTemplate.setList(Utils.getMongFieldList(archivo, myTemplate.getSource()));
	    	    	myTemplate.setEntityClassName(entityClassName);
	    	    	myTemplate.setEntityName(entityName);
	    	    	myTemplate.setCollectionName(collectionName);
	    	    	
	    	        String fileName = "I"+myTemplate.getEntityClassName() + "ServicePort.java";
	    	        Utils.createJavaFileRenderComun(myTemplate,fileName);
	    	    }
	    	} 			
			
	 }
	
	 private static void createApplicationPortsOutPutPersistencePort(MyTemplate myTemplate, String template) throws Exception {
			String filePath = myTemplate.getPackagePath();
			myTemplate.setProyecto(myTemplate.getRootPath());	
			myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "application/ports/output"));
			myTemplate.setTemplateName(template);

	    	String sCarpAct = System.getProperty("user.dir") + File.separator + myTemplate.getSource();
	    	
	    	
	    	File carpeta = new File(sCarpAct);
	    	String[] listado = carpeta.list();
	    	
	    	if (listado == null || listado.length == 0) {
	    	    System.out.println("No hay elementos dentro de la carpeta actual "+sCarpAct);
	    	    return;
	    	}
	    	else {
	    		
	    	    for (int i=0; i< listado.length; i++) {
	    	    	String archivo           = listado[i];
	    	    	String archivo_sin_ext   = listado[i].substring(0, listado[i].lastIndexOf("."));
	    	    	String entityClassName   = Utils.ConvertCamelCase(archivo_sin_ext);
	    	    	String entityName        = archivo_sin_ext.toLowerCase();
	    	    	String collectionName    = archivo_sin_ext.toLowerCase();
	 	    	
	    	    	myTemplate.setList(Utils.getMongFieldList(archivo, myTemplate.getSource()));
	    	    	myTemplate.setEntityClassName(entityClassName);
	    	    	myTemplate.setEntityName(entityName);
	    	    	myTemplate.setCollectionName(collectionName);
	    	    	
	    	        String fileName = "I"+myTemplate.getEntityClassName() + "PersistencePort.java";
	    	        Utils.createJavaFileRenderComun(myTemplate,fileName);
	    	    }
	    	} 			
			
	 }
	
	
}
