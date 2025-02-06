package sv.com.hsr.gen.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

import sv.com.hsr.gen.dto.MyTemplate;

public class UtilCopy {
	
	private static void CopyFile2(MyTemplate myTemplate) {
	    try {
    	    String sourceFile     = System.getProperty("user.dir") + File.separator + Utils.getRecurso(myTemplate.getType()) + File.separator + myTemplate.getTemplateName();
    	    String destinationFile= myTemplate.getDir() + File.separator + myTemplate.getFileName();
    	    
    	    File src = new File(sourceFile);
    	    File dest = new File(destinationFile);
    	    if (dest.exists() == false) {
    	    	Files.copy(src.toPath(), dest.toPath());
    	    }
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Hubo un error de entrada/salida!!!");
		}
	}
	
    public static void CopyFile(MyTemplate myTemplate){
        try {
    	    String sourceFile     = System.getProperty("user.dir") + File.separator + Utils.getRecurso(myTemplate.getType()) + File.separator + myTemplate.getTemplateName();
    	    String destinationFile= myTemplate.getDir() + File.separator + myTemplate.getFileName();
    	    
            if(!myTemplate.getDir().exists() && !myTemplate.getDir().isDirectory()){
            	myTemplate.getDir().mkdirs();
            }    	    
    	    

            if(!new File(destinationFile).exists()){
                File inFile = new File(sourceFile);
                File outFile = new File(destinationFile);
                

                FileInputStream in = new FileInputStream(inFile);
                FileOutputStream out = new FileOutputStream(outFile);

                int c;
                while( (c = in.read() ) != -1)
                    out.write(c);

                in.close();
                out.close();
                System.out.println("New...."+destinationFile);            	
            }            
            
        } catch(IOException e) {
        	e.printStackTrace();
            System.err.println("Hubo un error de entrada/salida!!!");
        }    	
    }		
    
    public static void createDir(File dir){
        if(!dir.exists() && !dir.isDirectory()){
			dir.mkdirs();
		}    	
    }	    
}