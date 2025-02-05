package sv.com.hsr.gen.util;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.resource.FileResourceLoader;
import org.beetl.core.Template;

import sv.com.hsr.gen.dto.MyTemplate;

public interface Utils {
	
    public static String getRecurso(String tipo) {
    	String respuesta = "";
    	
    	if (tipo.equals("HEXAGONAL")) {
    		respuesta     = "template/hexagonal";
    	}
    	
//    	if (tipo.equals("NORMAL")) {
//    		respuesta     = "template/normal";
//    	} else if (tipo.equals("EUREKA")) {
//    		respuesta     = "template/cloud";
//    	} else if (tipo.equals("CONFIG-SERVER")) {
//    		respuesta     = "template/cloud";
//    	} else if (tipo.equals("GATEWAY-SERVER")) {
//    		respuesta     = "template/cloud";
//    	} else if (tipo.equals("SERVICE-COMMONS-USUARIO")) {    		
//    		respuesta     = "template/cloud";
//    	} else if (tipo.equals("SERVICE-USUARIOS")) {    		
//    		respuesta     = "template/cloud";
//    	} else if (tipo.equals("SERVICE-OUTH")) {
//    		respuesta     = "template/cloud";
//    	} else if (tipo.equals("SERVICE-PDF")) {
//    		respuesta     = "template/cloud";
//    	} else if (tipo.equals("API")) {
//    		respuesta     = "template/api";
//    	} else if (tipo.equals("FEINGCLI")) {
//    		respuesta     = "template/feingcli";
//    	} else if (tipo.equals("COMMONS")) {
//    		respuesta     = "template/commons";
//    	} else if (tipo.equals("CLOUD")) {
//    		respuesta     = "template/cloud";
//    	} else if (tipo.equals("CUSCA")) {
//    		respuesta     = "template/cusca";    		
//    	} else {
//    		respuesta     = "template/normal";
//    	}
    	
    	return respuesta;
    }
    
	public static void replace(String oldstring, String newstring, MyTemplate myTemplate) throws IOException { 
		
		String destinationFile= myTemplate.getDir() + File.separator + myTemplate.getFileName();
		File file = new File(destinationFile);		
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		String line = null; 
		StringBuffer sbf=new StringBuffer();
		
		try {
			while ((line = reader.readLine()) != null) {
				sbf.append(line+"\n"); 
			}
		} finally {
			reader.close(); 
		}
		
		String newString = sbf.toString();
		newString = newString.replaceAll(oldstring, newstring);
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
		writer.write (newString); // Escribir archivo 
		writer.close(); 
		
	}
	
	   public static void createJavaFile(MyTemplate myTemplate){
	        try{
	            
	            String root = System.getProperty("user.dir") + File.separator + getRecurso(myTemplate.getType()) + File.separator;
	            
	            //System.out.println("Ruta Template...."+root);
	            
	            FileResourceLoader resourceLoader = new FileResourceLoader(root,"utf-8");
	            Configuration cfg = Configuration.defaultConfiguration();
	            GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);

	            Template t = gt.getTemplate(myTemplate.getTemplateName());
	   
	            t.binding("myUtil",myTemplate);
	    
	            String str = t.render();
	            
	            	
	            
	            
	            if(!myTemplate.getDir().exists() && !myTemplate.getDir().isDirectory()){
	            	myTemplate.getDir().mkdirs();
	            }
	            
	            //System.out.println(dir + File.separator + fileName);
	            
	            File file = new File( myTemplate.getDir() + File.separator + myTemplate.getFileName() );
	            if(!file.exists()){
	            	//Nueva
	                file.createNewFile();
	                FileWriter fileWriter = new FileWriter(file);
	                BufferedWriter bw = new BufferedWriter(fileWriter);
	                
	                bw.write(str);
	                bw.flush();
	                bw.close();
	                System.out.println("New...."+myTemplate.getDir() + File.separator + myTemplate.getFileName());
	            }else {
	            	if (myTemplate.getFileName().equals("application.properties")) {
	            		FileWriter fileWriter = new FileWriter(file);
	            		BufferedWriter bw = new BufferedWriter(fileWriter);
	                    bw.write(str);
	                    bw.flush();
	                    bw.close();
	                    System.out.println("Modifi...."+ myTemplate.getDir() + File.separator + myTemplate.getFileName());            		
	            	}
	            	//Existente
	            }
	        }catch(Exception e){
	            System.out.println(e.getMessage());
	        }

	    }		

}
