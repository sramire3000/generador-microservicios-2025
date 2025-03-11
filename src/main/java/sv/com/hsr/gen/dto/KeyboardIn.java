package sv.com.hsr.gen.dto;

import java.util.Scanner;

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
public class KeyboardIn {
	
	private String empresa      ;
	private String type         ;
	private String proy_package ;
	private String proy_target  ;
	private String artifact     ;
	private String descripcion  ;
	private String group        ;
	private String source       ;
	private String jdk          ;
	private String servicio     ;	
	
	private String str_group       = "sv.com.acme";
	private String str_package     = "sv.com.demo.springboot.app.api.core";
	private String str_artifact    = "springboot-service-students";
	private String str_descripcion = "Servicio Students project for Spring Boot";
	private String str_target      = "/prueba/springboot-service-students";
	private String str_source_json = "json";
	
	
	public void load() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		
		//Pregunta el Tipo de Proyecto	
		System.out.println("type 0=HEXAGONAL");

		
		System.out.println("Ingresa ?=>");
		
		type = scanner.nextLine();
		
		switch (type.trim()) {
		case "0":
			type= "HEXAGONAL";
			break;
		default:
			type= "HEXAGONAL";
			break;
		}
		
		System.out.println("");		
		
		if (type.trim().toUpperCase().equals("HEXAGONAL")) {
			System.out.println("   group          : "+str_group);
			System.out.println("   package        : "+str_package);
			System.out.println("   artifact       : "+str_artifact);
			System.out.println("   descripcion    : "+str_descripcion);
			System.out.println("   target         : "+str_target);
			System.out.println("   JDK            : 21");
			System.out.println("   source         : "+str_source_json);
			System.out.println("");	
			System.out.println("");
			
			//Ingresa el Grupo
			ingreseGrupo();
			
			//Pregunta por el Paquete
			ingresePaquete();


			//Pregunta por el Artifact y Name
			ingreseArtifac();

			//Ingresa la Descripcion
			ingreseDescripcion();
			
			//Ingresa el Target
			ingreseTarget();
			
			//Ingresa el JDK
			ingreseJdk();
			
			//Ingresa el Json
			ingreseJson();
			
			//Print
			Print();			
			
		}
	}

	@SuppressWarnings("resource")
	private void ingresePaquete() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa package?         : =>"); proy_package = scanner.nextLine();	
		
		//Valida el Paquete
		if ((proy_package ==null) || (proy_package.trim().equals(""))) {
			if (type.trim().toUpperCase().equals("HEXAGONAL"))         {proy_package= str_package;}
			
//			if (type.trim().toUpperCase().equals("NORMAL"))         {proy_package= "sv.com.demo.springboot.app";
//			}else if (type.trim().toUpperCase().equals("CLOUD"))    {proy_package= "sv.com.demo.springboot.app";
//		    }else if (type.trim().toUpperCase().equals("API"))      {proy_package= "sv.com.demo.springboot.app.api";
//			}else if (type.trim().toUpperCase().equals("FEINGCLI")) {proy_package= "sv.com.demo.springboot.app";
//			}else if (type.trim().toUpperCase().equals("COMMONS"))  {proy_package= "sv.com.demo.springboot.app";
//			}else if (type.trim().toUpperCase().equals("CUSCA"))    {proy_package= "sv.com.cuscatlan.app";			
//			}
		}		
	}	
	
	@SuppressWarnings("resource")
	private void ingreseArtifac() {
		Scanner scanner = new Scanner(System.in);
		//Ingresa el Artifact
		System.out.print("Ingresa artifact?        : =>"); artifact = scanner.nextLine();	
		
		//Valida el artifact
		if ((artifact ==null) || (artifact.trim().equals(""))) {
			if (type.trim().toUpperCase().equals("HEXAGONAL"))         {artifact= str_artifact;}			
			
//			if (type.trim().toUpperCase().equals("NORMAL"))         {artifact= "springboot-service-inventario";
//			}else if (type.trim().toUpperCase().equals("CLOUD"))    {artifact= null;
//			}else if (type.trim().toUpperCase().equals("API"))      {artifact= "springboot-service-api-dbdatos";
//			}else if (type.trim().toUpperCase().equals("FEINGCLI")) {artifact= "springboot-service-inventario";
//			}else if (type.trim().toUpperCase().equals("COMMONS"))  {artifact= null;
//			}else if (type.trim().toUpperCase().equals("CUSCA"))    {artifact= "springboot-service-api-bdigital";
//			}
		}			
	}	
	
	@SuppressWarnings("resource")
	private void ingreseDescripcion() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa descripcion?     : =>"); descripcion = scanner.nextLine();
		
		//Valida la descripcion
		if ((descripcion ==null) || (descripcion.trim().equals(""))) {
			descripcion = str_descripcion;
		}	
	}	
	
	@SuppressWarnings("resource")
	private void ingreseGrupo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa group?           : =>"); group = scanner.nextLine();
		
		//Valida el group
		if ((group ==null) || (group.trim().equals(""))) {
			
			if (type.trim().toUpperCase().equals("HEXAGONAL"))         {group = str_group;}

//			if (type.trim().toUpperCase().equals("NORMAL"))         {group = "sv.com.demo.springboot.app.inventario";
//			}else if (type.trim().toUpperCase().equals("CLOUD"))    {group = null;
//			}else if (type.trim().toUpperCase().equals("API"))      {group = "sv.com.demo.springboot.app.dbdatos";
//			}else if (type.trim().toUpperCase().equals("FEINGCLI")) {group = "sv.com.demo.springboot.app.inventario";
//			}else if (type.trim().toUpperCase().equals("COMMONS"))  {group = null;
//			}else if (type.trim().toUpperCase().equals("CUSCA"))    {group = "sv.com.eclipse.app";
//			}
			
		}		
	}
	
	@SuppressWarnings("resource")
	private void ingreseTarget() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa target?          : =>"); proy_target = scanner.nextLine();

		//Valida el Target
		if ((proy_target ==null) || (proy_target.trim().equals(""))) {
			if (type.trim().toUpperCase().equals("HEXAGONAL"))         {proy_target = str_target;
			}
			
			
//			if (type.trim().toUpperCase().equals("NORMAL"))         {proy_target = "/test/spring-mono-proyecto";
//			}else if (type.trim().toUpperCase().equals("CLOUD"))    {proy_target = "/test/spring-cloud-proyecto";
//			}else if (type.trim().toUpperCase().equals("API"))      {proy_target = "/test/spring-api-proyecto";
//			}else if (type.trim().toUpperCase().equals("FEINGCLI")) {proy_target = "/test/spring-feing-proyecto";
//			}else if (type.trim().toUpperCase().equals("COMMONS"))  {proy_target = "/test/spring-commons-proyecto";
//			}else if (type.trim().toUpperCase().equals("CUSCA"))    {proy_target = "/test/spring-api-cusca-proyecto";
//			}			
		}
	}	
	
	@SuppressWarnings("resource")
	private void ingreseJdk() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa jdk?             : =>"); jdk = scanner.nextLine();
		//Valida el JDK
		if ((jdk ==null) || (jdk.trim().equals(""))) {
			jdk = "21";
		}			
	}	
	
	@SuppressWarnings("resource")
	private void ingreseJson() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa source Json?     : =>"); source = scanner.nextLine();
		//Valida Source
		if ((source ==null) || (source.trim().equals(""))) {
			source = str_source_json;
		}			
	}
		
	
	private void Print() {
		System.out.println("");	
		System.out.println("Info:");
		
		if(type != null)         System.out.println("type         : "+type); 
		if(proy_package != null) System.out.println("package      : "+proy_package);	
		if(artifact != null)     System.out.println("artifact     : "+artifact); 
		if(descripcion != null)  System.out.println("descripcion  : "+descripcion); 
		if(group != null)        System.out.println("group        : "+group); 
		if(proy_target != null)  System.out.println("target       : "+proy_target); 
		if(jdk != null)          System.out.println("jdk          : "+jdk);
		if(source !=null)        System.out.println("source       : "+source);
		System.out.println("");	
	}	
}
