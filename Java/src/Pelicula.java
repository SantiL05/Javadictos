
import java.util.*;

public class Pelicula {
	private int Id_pelicula;
	private String Categoria_pelicula;
	private long Duracion_pelicula;
	private String Sinopsis_pelicula;
	private long Reserva_pelicula;
	private double Precio_2D;
	private double Precio_3D;
	
public Pelicula (int Id_pelicula,String Categoria_pelicula,long Duracion_pelicula,String Sinopsis_pelicula,long Reserva_pelicula,double Precio_2D,double Precio_3D) {


		this.Id_pelicula=Id_pelicula;
		this.Categoria_pelicula=Categoria_pelicula;
		this.Duracion_pelicula=Duracion_pelicula;
		this.Sinopsis_pelicula=Sinopsis_pelicula;
		this.Reserva_pelicula=Reserva_pelicula;
		this.Precio_2D=Precio_2D;
		this.Precio_3D=Precio_3D;
		}

public int getId_pelicula() {
	return Id_pelicula;
}

public void setId_pelicula(int id_pelicula) {
	Id_pelicula = id_pelicula;
}

public String getCategoria_pelicula() {
	return Categoria_pelicula;
}

public void setCategoria_pelicula(String categoria_pelicula) {
	Categoria_pelicula = categoria_pelicula;
}

public long getDuracion_pelicula() {
	return Duracion_pelicula;
}

public void setDuracion_pelicula(long duracion_pelicula) {
	Duracion_pelicula = duracion_pelicula;
}

public String getSinopsis_pelicula() {
	return Sinopsis_pelicula;
}

public void setSinopsis_pelicula(String sinopsis_pelicula) {
	Sinopsis_pelicula = sinopsis_pelicula;
}

public long getReserva_pelicula() {
	return Reserva_pelicula;
}

public void setReserva_pelicula(long reserva_pelicula) {
	Reserva_pelicula = reserva_pelicula;
}

public double getPrecio_2D() {
	return Precio_2D;
}

public void setPrecio_2D(double precio_2d) {
	Precio_2D = precio_2d;
}

public double getPrecio_3D() {
	return Precio_3D;
}

public void setPrecio_3D(double precio_3d) {
	Precio_3D = precio_3d;
}

}
