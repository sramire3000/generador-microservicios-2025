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
		
		//JkfArchetype.txt
		myTemplate.setTemplateName("JkfArchetype.txt");
		myTemplate.setFileName("JkfArchetype");
		myTemplate.setDir(new File(myTemplate.getProyecto()));
		UtilCopy.CopyFile(myTemplate);
		Utils.replace("service-name", myTemplate.getArtifact(), myTemplate);			
		
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
		
		//Dockerfile
		myTemplate.setTemplateName("Dockerfile.txt");
		myTemplate.setFileName("Dockerfile");
		myTemplate.setDir(new File(myTemplate.getProyecto()));
		UtilCopy.CopyFile(myTemplate);
		Utils.replace("service-name", myTemplate.getArtifact(), myTemplate);	
		
		//k8s-config-development
		myTemplate.setTemplateName("k8s-config-development.txt");
		myTemplate.setFileName("k8s-config-development.txt");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator + "scm"));		
		UtilCopy.CopyFile(myTemplate);
		
		//k8s-config-master
		myTemplate.setTemplateName("k8s-config-master.txt");
		myTemplate.setFileName("k8s-config-master.txt");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator + "scm"));		
		UtilCopy.CopyFile(myTemplate);
		
		//k8s-config-qa
		myTemplate.setTemplateName("k8s-config-qa.txt");
		myTemplate.setFileName("k8s-config-qa.txt");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator + "scm"));		
		UtilCopy.CopyFile(myTemplate);	
		
		//parameters
		myTemplate.setTemplateName("parameters.txt");
		myTemplate.setFileName("parameters.txt");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator + "scm"));		
		UtilCopy.CopyFile(myTemplate);
		
		//Jenkinsfile
		myTemplate.setTemplateName("Jenkinsfile");
		myTemplate.setFileName("Jenkinsfile");
		myTemplate.setDir(new File(myTemplate.getProyecto()));
		UtilCopy.CopyFile(myTemplate);			
		
		//pom-archetype.template
		myTemplate.setTemplateName("pom-archetype.template");
		myTemplate.setFileName("pom-archetype.template");
		myTemplate.setDir(new File(myTemplate.getProyecto()));
		UtilCopy.CopyFile(myTemplate);		
		
		//README.md
		myTemplate.setTemplateName("README.md");
		myTemplate.setFileName("README.md");
		myTemplate.setDir(new File(myTemplate.getProyecto()));
		UtilCopy.CopyFile(myTemplate);	
		
		//JkfArchetype
		myTemplate.setTemplateName("JkfArchetype");
		myTemplate.setFileName("JkfArchetype");
		myTemplate.setDir(new File(myTemplate.getProyecto()));
		UtilCopy.CopyFile(myTemplate);		
		
		//mvnw
//		myTemplate.setTemplateName("mvnw.txt");
//		myTemplate.setFileName("mvnw");
//		myTemplate.setDir(new File(myTemplate.getProyecto()));
//		UtilCopy.CopyFile(myTemplate);			
		
		//mvnw.cmd
//		myTemplate.setTemplateName("mvnw.cmd.txt");
//		myTemplate.setFileName("mvnw.cmd");
//		myTemplate.setDir(new File(myTemplate.getProyecto()));
//		UtilCopy.CopyFile(myTemplate);	
		
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
		
		//UtilValidate
		myTemplate.setTemplateName("UtilValidate.txt");
		myTemplate.setFileName("UtilValidate.java");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "utils"));	
		UtilCopy.CopyFile(myTemplate);	
		Utils.replace("package com.example.demo;", "package "+myTemplate.getPackageName()+".utils;", myTemplate);
		
		//UtilAES256
		myTemplate.setTemplateName("UtilAES256.txt");
		myTemplate.setFileName("UtilAES256.java");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "utils"));	
		UtilCopy.CopyFile(myTemplate);	
		Utils.replace("package com.example.demo;", "package "+myTemplate.getPackageName()+".utils;", myTemplate);		
		
		//ErrorCatalog
		myTemplate.setTemplateName("ErrorCatalog.txt");
		myTemplate.setFileName("ErrorCatalog.java");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "utils"));	
		UtilCopy.CopyFile(myTemplate);			
		Utils.replace("package com.example.demo;", "package "+myTemplate.getPackageName()+".utils;", myTemplate);
		
		//GlobalControllerAdvice
		myTemplate.setTemplateName("GlobalControllerAdvice.txt");
		myTemplate.setFileName("GlobalControllerAdvice.java");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/input/rest"));	
		UtilCopy.CopyFile(myTemplate);			
		Utils.replace("com.example.demo", myTemplate.getPackageName(), myTemplate);
		
		
		
		myTemplate.setTemplateName("ErrorResponse.txt");
		myTemplate.setFileName("ErrorResponse.java");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "domain/model"));	
		UtilCopy.CopyFile(myTemplate);	
		Utils.replace("package com.example.demo;", "package "+myTemplate.getPackageName()+".domain.model;", myTemplate);
		
		//Creacion de Carpetas
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "application"));		
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "application/ports"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "application/ports/input"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "application/ports/output"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "application/service"));
		
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "domain"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "domain/exception"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "domain/model"));
		
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters"));
		
		
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/input/rest"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/input/rest/mapper"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/input/rest/model"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/input/rest/model/request"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/input/rest/model/response"));
		
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/output/persistence"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/output/persistence/entity"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/output/persistence/mapper"));
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/output/persistence/repository"));
		
		
		UtilCopy.createDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "utils"));
		
		
		createDomainEntity(myTemplate, "Entity.txt");
		createDomainRepository(myTemplate, "Repository.txt");
		createInfraPersitenceMappers(myTemplate, "PersitenceMappers.txt");
		
		
		createDomainNotFoundException(myTemplate, "NotFoundException.txt");
		createDomainModel(myTemplate, "Model.txt");
		createInfraPersistenceCreateRequest(myTemplate, "CreateRequest.txt");
		createInfraPersistenceStudentRsponse(myTemplate, "StudentResponse.txt");
		createInfraInputRestaMpper(myTemplate, "IStudentRestMapper.txt");
		
		createApplicationPortsOutPutPersistencePort(myTemplate, "IPersistencePort.txt");
		createApplicationPortsInputServicePort(myTemplate, "IServicePort.txt");
		createApplicationService(myTemplate, "StudentService.txt");
		createInfraRestAdapter(myTemplate, "StudentRestAdapter.txt");
		
		
		createInfraPersistenceAdapter(myTemplate, "PersistenceAdapter.txt");
		
		
	}

	private static void createInfraRestAdapter(MyTemplate myTemplate, String template) throws Exception{
		String filePath = myTemplate.getPackagePath();
		myTemplate.setProyecto(myTemplate.getRootPath());	
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/input/rest"));
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
    	    	
    	        String fileName = myTemplate.getEntityClassName() + "RestAdapter.java";

    	        Utils.createJavaFileRenderComun(myTemplate,fileName);
    	    }
    	} 
	}

	private static void createInfraInputRestaMpper(MyTemplate myTemplate, String template) throws Exception{
		String filePath = myTemplate.getPackagePath();
		myTemplate.setProyecto(myTemplate.getRootPath());	
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/input/rest/mapper"));
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
    	    	
    	        String fileName = "I"+myTemplate.getEntityClassName() + "RestMapper.java";

    	        Utils.createJavaFileRenderComun(myTemplate,fileName);
    	    }
    	} 
		
	}

	private static void createInfraPersistenceStudentRsponse(MyTemplate myTemplate, String template) throws Exception{
		String filePath = myTemplate.getPackagePath();
		myTemplate.setProyecto(myTemplate.getRootPath());	
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/input/rest/model/response"));
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
    	    	
    	        String fileName = myTemplate.getEntityClassName() + "Response.java";

    	        Utils.createJavaFileRenderComun(myTemplate,fileName);
    	    }
    	} 
		
	}

	private static void createInfraPersistenceCreateRequest(MyTemplate myTemplate, String template) throws Exception{
		String filePath = myTemplate.getPackagePath();
		myTemplate.setProyecto(myTemplate.getRootPath());	
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/input/rest/model/request"));
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
    	    	
    	        String fileName = myTemplate.getEntityClassName() + "CreateRequest.java";

    	        Utils.createJavaFileRenderComun(myTemplate,fileName);
    	    }
    	} 
		
	}

	private static void createInfraPersistenceAdapter(MyTemplate myTemplate, String template) throws Exception{
		String filePath = myTemplate.getPackagePath();
		myTemplate.setProyecto(myTemplate.getRootPath());	
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/output/persistence"));
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
    	    	
    	        String fileName = myTemplate.getEntityClassName() + "PersistenceAdapter.java";

    	        Utils.createJavaFileRenderComun(myTemplate,fileName);
    	    }
    	} 	
	}

	private static void createInfraPersitenceMappers(MyTemplate myTemplate, String template) throws Exception{
		String filePath = myTemplate.getPackagePath();
		myTemplate.setProyecto(myTemplate.getRootPath());	
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/output/persistence/mapper"));
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
    	    	
    	        String fileName = "I"+myTemplate.getEntityClassName() + "PersitenceMappers.java";

    	        Utils.createJavaFileRenderComun(myTemplate,fileName);
    	    }
    	} 		

		
	}

	private static void createDomainRepository(MyTemplate myTemplate, String template) throws Exception{
		String filePath = myTemplate.getPackagePath();
		myTemplate.setProyecto(myTemplate.getRootPath());	
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/output/persistence/repository"));
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
    	    	
    	        String fileName = "I"+myTemplate.getEntityClassName() + "Repository.java";

    	        Utils.createJavaFileRenderComun(myTemplate,fileName);
    	    }
    	} 		
	}

	private static void createDomainEntity(MyTemplate myTemplate, String template) throws Exception{
		String filePath = myTemplate.getPackagePath();
		myTemplate.setProyecto(myTemplate.getRootPath());	
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "infrastructure/adapters/output/persistence/entity"));
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
    	    	
    	        String fileName = myTemplate.getEntityClassName() + "Entity.java";

    	        Utils.createJavaFileRenderComun(myTemplate,fileName);
    	    }
    	} 			
	}

	private static void createDomainNotFoundException(MyTemplate myTemplate, String template)  throws Exception{
		String filePath = myTemplate.getPackagePath();
		myTemplate.setProyecto(myTemplate.getRootPath());	
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "domain/exception"));
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
    	    	
    	        String fileName = myTemplate.getEntityClassName() + "NotFoundException.java";

    	        Utils.createJavaFileRender(myTemplate,fileName);
    	    }
    	}
		
	}


	private static void createApplicationService(MyTemplate myTemplate, String template)  throws Exception{
		String filePath = myTemplate.getPackagePath();
		myTemplate.setProyecto(myTemplate.getRootPath());	
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "application/service"));
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
    	    	
    	        String fileName = myTemplate.getEntityClassName() + "Service.java";

    	        Utils.createJavaFileRender(myTemplate,fileName);
    	    }
    	}
		
	}





	private static void createDomainModel(MyTemplate myTemplate, String template) throws Exception{
		String filePath = myTemplate.getPackagePath();
		myTemplate.setProyecto(myTemplate.getRootPath());	
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath+ "domain/model"));
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
    	    	
    	        String fileName = myTemplate.getEntityClassName() + ".java";

    	        Utils.createJavaFileRenderComun(myTemplate,fileName);
    	    }
    	} 	
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

	    	        Utils.createJavaFileRender(myTemplate,fileName);
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
	    	        Utils.createJavaFileRender(myTemplate,fileName);
	    	    }
	    	} 			
			
	 }
	
	
}
