package sv.com.hsr.gen.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import sv.com.hsr.gen.util.Utils;


@NoArgsConstructor              //genera un constructor sin argumentos, uno vacío
@AllArgsConstructor             //genera un constructor para todos los atributos de la clase.
@Getter //Metodos Gettes
@Setter //Metodos Setters
@EqualsAndHashCode              //genera los métodos equals y hashcode.
@ToString 
public class DataBaseFields {
    private String name;				//Nombre del Campo
    private String camelCaseNameLower;  //Nombre del Campo camelCase
    private String camelCaseNameUpper;  //Nombre del Campo camelCase
    private String tableRef;		    //Nombre de la Tabla de las FK
    private String camelCasetableRef;   //Nombre de la Tabla de las FK    
    private String uno_mayuscula_name;  
    private String uno_mayuscula_tableRef;
    private boolean isPk;       		//Llave Primaria 
    private boolean isAutoGen;  		//LLave Autogeneradas
    private boolean isNull;     		//false = requerido, true = No requerido
    private boolean isFind;	    		//Busqueda Exacta
    private boolean isFindLike;			//Busqueda que contenga like    
    private String type;				//Tipo de Campo Varchar, String, Short, Integer, Long, Double, BigDecimal, Date, TIMESTAMP, Boolean, ManyToOne
    private String description;			//Descripcion del Campo
    private String len;					//Tamaño
    private boolean isUnique;           //Campo Unico
    private boolean isEncrypt;          //Encriptado
    private String nameLabel;           //Para el Mapper
    private String camelCaseNameLabelLower;  //Nombre del Campo camelCase
    private String camelCaseNameLabelUpper;  //Nombre del Campo CamelCase
    
    
	public String getNombre_lower() {
		return name.toLowerCase();
	}
	
	public String getTableRef_lower() {
		return tableRef.toLowerCase();
	}
	
	public String getNameUpper() {
		return name.toUpperCase();
	}
	
	public String nameUpper() {
		return name.toUpperCase();
	}
	

}
