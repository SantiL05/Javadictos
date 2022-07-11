import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Cienemar.Conexion;

public class Pelicula {

	private int Id_pelicula;
	private String Nombre_pelicula;
	private String Fecha_recerva;
	private double Precio2D;
	private double Precio3D;
	

	public Pelicula(int Id_pelicula, String Nombre_pelicula,String Fecha_recerva,double Precio2D, double Precio3D) {
		super();
		this.Id_pelicula = Id_pelicula;
		this.Nombre_pelicula = Nombre_pelicula;
		this.Fecha_recerva = Fecha_recerva;
		this.Precio2D = Precio2D;
		this.Precio3D = Precio3D;
	}
	public int getId_p() {
		return Id_pelicula;
	}
	public void setId_p(int id_p) {
		this.Id_pelicula = id_p;
	}
	public String getNombre() {
		return Nombre_pelicula;
	}
	public void setNombre(String nombre) {
		this.Nombre_pelicula = nombre;
	}
	
	public String getFecha() {
		return Fecha_recerva;
	}
	public void setFecha(String Fecha) {
		this.Fecha_recerva = Fecha;
	}
	
	

	public double getPrecio() {
		return Precio2D;
	}
	public void setPrecio2D(double Precio2D) {
		this.Precio2D = Precio2D;
	}
	
	public double getPrecio3() {
		return Precio3D;
	}
	public void setPrecio3D(double Precio3D) {
		this.Precio3D = Precio3D;
	}
	
	@Override
	public String toString() {
		return "Pelicula [Id_pelicula=" + Id_pelicula + ", Nombre_pelicula=" + Nombre_pelicula + ", Fecha_recerva=" + Fecha_recerva + ", Precio2D=" + Precio2D +", Precio3D=" + Precio3D + "]";
	}
}