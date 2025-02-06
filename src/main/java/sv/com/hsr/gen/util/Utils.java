package sv.com.hsr.gen.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.resource.FileResourceLoader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.CaseFormat;

import org.beetl.core.Template;

import sv.com.hsr.gen.dto.DataBaseFields;
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
	   
	    /* Lectura de los Json */
	    public static List<DataBaseFields> getMongFieldList(String fileName, String carpetaJson) throws Exception{
	        List<DataBaseFields> dataBaseFieldsList = new ArrayList<DataBaseFields>();
	        ObjectMapper objectMapper = new ObjectMapper();
	        
	        String file = System.getProperty("user.dir")+ File.separator + carpetaJson + File.separator + fileName;
	        
	        //System.out.println(file);
	        
			
			List<Map<String,Object>> list = (List<Map<String,Object>>)objectMapper.readValue(new FileInputStream(file), List.class);
			
	        for(Map<String,Object> map : list){
	        	
	        	//Instanciando
	            DataBaseFields dataBaseFields = new DataBaseFields();
	          
	            //Name
	            dataBaseFields.setName(map.get("name").toString());
	            
	            //Type
	            dataBaseFields.setType(map.get("type").toString());
	            
	            //Descripcion
	            if(map.get("description") != null) {dataBaseFields.setDescription(map.get("description").toString());}
	            
	            //Length
	            if(map.get("type").equals("String")) {
	            	if (map.get("len")!= null) {
	            		dataBaseFields.setLen(map.get("len").toString());
	            	}
	            }      
	            
	            //Length
	            if(map.get("type").equals("Varchar")) {
	            	if (map.get("len")!= null) {
	            		dataBaseFields.setLen(map.get("len").toString());
	            	}
	            }             
	            
	            //Campo de requerido
	            try {
	            	dataBaseFields.setNull((Boolean) map.get("isNull"));	
				} catch (Exception e) {
					dataBaseFields.setNull(true); //No requerido
				}
	            
	            //Campo de Busqueda
	            try {
	                dataBaseFields.setFind((Boolean) map.get("isFind"));
				} catch (Exception e) {
					dataBaseFields.setFind(false);
				}
	            //Campo de Busqueda Like
	            try {
	            	dataBaseFields.setFindLike((Boolean) map.get("isFindLike"));	
				} catch (Exception e) {
					dataBaseFields.setFindLike(false);
				}
	            
	            //Campo LLave Primaria
	            try {
	            	dataBaseFields.setPk((Boolean) map.get("isPk"));
	            	try {
	            		dataBaseFields.setAutoGen((Boolean) map.get("isAutoGen"));
					} catch (Exception e) {
						dataBaseFields.setAutoGen(false);
					}
				} catch (Exception e) {
					dataBaseFields.setPk(false);
					dataBaseFields.setAutoGen(false);
				}
	            
	            //Tabla para las Fk
	            try {
	            	dataBaseFields.setTableRef(map.get("tableRef").toString());		
	            	dataBaseFields.setCamelCasetableRef(map.get("tableRef").toString().substring(0, 1).toUpperCase() + map.get("tableRef").toString().substring(1));
				} catch (Exception e) {
					dataBaseFields.setTableRef("");	
				}
	            
	            dataBaseFields.setCamelCaseName(map.get("name").toString().substring(0, 1).toUpperCase() + map.get("name").toString().substring(1));
	            
	            String nombre_temp = map.get("name").toString().substring(0, 1).toUpperCase() + map.get("name").toString().substring(1);
	            
	            if (nombre_temp.contains("_")) {
	            	Integer pos = nombre_temp.indexOf("_");
	            	String uno = nombre_temp.substring(0, pos);
	            	String dos = nombre_temp.substring(pos, nombre_temp.length()).toLowerCase();
	            	
	            	dataBaseFields.setUno_mayuscula_name(uno+dos);
	            }else {
	            	dataBaseFields.setUno_mayuscula_name(map.get("name").toString().substring(0, 1).toUpperCase() + map.get("name").toString().substring(1));
	            }
	            
	            //Tabla Ref
	            if (!dataBaseFields.getTableRef().equals("")){
		            nombre_temp = map.get("tableRef").toString().substring(0, 1).toUpperCase() + map.get("tableRef").toString().substring(1);
		            if (nombre_temp.contains("_")) {
		            	Integer pos = nombre_temp.indexOf("_");
		            	String uno = nombre_temp.substring(0, pos);
		            	String dos = nombre_temp.substring(pos, nombre_temp.length()).toLowerCase();
		            	
		            	dataBaseFields.setUno_mayuscula_tableRef(uno+dos);
		            }else {
		            	dataBaseFields.setUno_mayuscula_tableRef(map.get("tableRef").toString().substring(0, 1).toUpperCase() + map.get("tableRef").toString().substring(1));
		            }	            	
	            }
	            
	            dataBaseFieldsList.add(dataBaseFields);
	        }
	        return dataBaseFieldsList;
	    }
	    
	    public static String ConvertCamelCase(String dato) {
	    	 String result = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, dato.replaceAll("-", "_"));	    	
	    	 return result;
	    }
	    
	    public static void createJavaFileRenderComun(MyTemplate myTemplate,String fileName){
	        try{
	            
	            String root = System.getProperty("user.dir") + File.separator + "template/comun"  + File.separator;
	            
	            //logger.info("Ruta Template ===>"+root);
	            
	            FileResourceLoader resourceLoader = new FileResourceLoader(root,"utf-8");
	            Configuration cfg = Configuration.defaultConfiguration();
	            GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);

	            Template t = gt.getTemplate(myTemplate.getTemplateName());
	   
	            t.binding("myUtil",myTemplate);
	    
	            String str = t.render();
	            
	            
	            File dir = myTemplate.getDir();
	            
	            if(!dir.exists() && !dir.isDirectory()){
	                dir.mkdirs();
	            }
	            
	            //System.out.println(dir + File.separator + fileName);
	            
	            File file = new File( dir + File.separator + fileName );
	            
	            if(!file.exists()){
	            	//Nueva
	                file.createNewFile();
	                FileWriter fileWriter = new FileWriter(file);
	                BufferedWriter bw = new BufferedWriter(fileWriter);
	                
	                bw.write(str);
	                bw.flush();
	                bw.close();
	                System.out.println("New...."+dir + File.separator + fileName);
	            }else {
	            	if (fileName.equals("application.properties")) {
	            		FileWriter fileWriter = new FileWriter(file);
	            		BufferedWriter bw = new BufferedWriter(fileWriter);
	                    bw.write(str);
	                    bw.flush();
	                    bw.close();
	                    System.out.println("Modifi...."+ dir + File.separator + fileName);            		
	            	}
	            	//Existente
	            }
	        }catch(Exception e){
	            System.out.println(e.getMessage());
	        }

	    } 	    

}
