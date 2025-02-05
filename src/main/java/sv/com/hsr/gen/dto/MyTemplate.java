package sv.com.hsr.gen.dto;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor              //genera un constructor sin argumentos, uno vacío
@AllArgsConstructor             //genera un constructor para todos los atributos de la clase.
@Getter //Metodos Gettes
@Setter //Metodos Setters
@EqualsAndHashCode              //genera los métodos equals y hashcode.
@ToString   
public class MyTemplate {
	
	private String type;
    private String rootPath;
    private String packageName;
    private String packageNameBase;
    private String entityClassName;
    private String entityName;
    private String templateName;
    private String fileName;
    private List<DataBaseFields> list = new ArrayList<DataBaseFields>();
    private String collectionName;
    private String jdk;
    private String servicio_padre;
    private String empresa;
    
    private File dir;
    private String proyecto;
    
    private String artifact;
    private String descripcion;
    private String group;
    private String source;
    
    public String getPackagePath(){
        String packagePath = "";
        String[] array = packageName.split("\\.");
        for(String str : array){
            packagePath += str + File.separator;
        }
        return packagePath;
    }
    
    public String getNameApp(){
    	
        String packagePath = "";
        String[] array     = artifact.split("-");
        
        for(String str : array){
            packagePath = str;
        }
        
        return packagePath;
    }    
    
    
    public String getNameApp2(){
    	
        String packagePath = "";
        String[] array     = packageName.split("\\.");
       
        for(String str : array){
            packagePath = str;
        }
        
        return packagePath;
    }
}
