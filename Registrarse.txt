package Cienemar;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Conexion {
	
	final String DRIVER="com.mysql.cj.jdbc.Driver";
	final String URL="jdbc:mysql://localhost/cinemar";
	final String USER="root";
	final String PASS="";
	Connection conn=null;
	ResultSet st = null;
	ResultSet rs = null;
	PreparedStatement ps = null;

	
	private String Nombre;
	private String Apellido;
	private String DNI_usuario;
	private String Fecha_nacimiento;
	private String Num_cel;
	private String Correo_usuario;
	private String Password;
	private int Nom_tipo;
	private int Id_reserva;
	
	public Conexion() { //constructor 	
	
	try {

		//Conexion con el serviodr XAMPP y la base de datos.
		Class.forName(DRIVER);	
		conn=DriverManager.getConnection(URL,USER,PASS);
		System.out.println("Conectando a la base de datos cinemar..."+ "\n");
		
		System.out.println("Creando Consulta..." + "\n");
		
		String sql = "INSERT INTO usuario VALUES(null,"+"'"+this.Nombre+"',"+
				"'"+this.Apellido+"',"+"'"+this.DNI_usuario+"',"+"'"+this.Fecha_nacimiento+"',"+this.Num_cel+"',"+"'"+this.Correo_usuario+"'"+this.Password+"',"+"1,0)";
				  
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		this.Nombre = teclado.next();
		
		System.out.println("Ingrese su apellido: ");
		this.Apellido= teclado.next();
		
		System.out.println("Ingrese su DNI: ");
		this.DNI_usuario= teclado.next();
		
		System.out.println("Ingrese su fecha_nac: ");
		this.Fecha_nacimiento= teclado.next();
		
		System.out.println("Ingrese su cel: ");
		this.Num_cel= teclado.next();
		
		System.out.println("Ingrese su correo: ");
		this.Correo_usuario= teclado.next();
		
		System.out.println("Ingrese su password: ");
		this.Password= teclado.next();
		
		this.Nom_tipo=3;
		this.Id_reserva=0;
		
		
		
		
		System.out.println("Usuario cargado con exito!...");
	
	}catch(Exception e) {
		System.out.println("Error, no se pudo acceder a la base de datos...");
	}	
}	
	
	public static void main(String[] args) {
		
		Conexion consulta = new Conexion();

	}
}