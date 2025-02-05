package sv.com.hsr.gen.com;

import java.io.File;
import java.io.IOException;

import com.google.common.base.CaseFormat;

import sv.com.hsr.gen.dto.MyTemplate;
import sv.com.hsr.gen.util.UtilCopy;
import sv.com.hsr.gen.util.Utils;

public class GeneraHexagonal {

	public static void load(MyTemplate myTemplate) throws IOException  {
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
		
		//Main
		String camelCaseMain = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, myTemplate.getArtifact().replaceAll("-", "_"));
		myTemplate.setTemplateName("Application.txt");
		myTemplate.setFileName(camelCaseMain+"Application.java");
		myTemplate.setDir(new File(myTemplate.getProyecto() + File.separator +"src/main/java"+ File.separator + filePath));
		
		Utils.createJavaFile(myTemplate);		
		Utils.replace("SpringDemoHexagonalApplication", camelCaseMain+"Application", myTemplate);	
		Utils.replace("package com.example.demo;","package "+ myTemplate.getPackageName()+";", myTemplate);
		Utils.replace("---------- Product Service Started ----------", "---------- "+myTemplate.getArtifact()+" Service Started ----------", myTemplate);			
		
	}
}
