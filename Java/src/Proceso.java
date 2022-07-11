
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
import java.sql.SQLException;
import java.io.IOException;
public class Proceso {

	private static final String ResultSet = null;
	public static void main(String[] args) {
		System.out.println("Bienvenido:");
		System.out.println("Si usted está registrado ingrese 1");
		System.out.println("Si usted quiere registrarse ingrese 2");
		Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        if (opcion == 1);{
        	new Conexion ();
        	System.out.println("Ingrese correo electrónico:");
        	Scanner email = new Scanner(System.in); 
        	String correo = email.nextLine();
        	Object Consulta= realizaConsulta (); 
        	} 
	}
}