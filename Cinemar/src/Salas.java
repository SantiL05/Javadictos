
public class Salas {
	private int Id_salas;
	private String Nombre_pelicula;
	private int Capacidad_sala;
	private int Id_pelicula;

public Salas (int Id_salas,String Nombre_pelicula,int Capacidad_sala,int Id_pelicula) {


this.Id_salas=Id_salas;
this.Nombre_pelicula=Nombre_pelicula;
this.Capacidad_sala=Capacidad_sala;
this.Id_pelicula=Id_pelicula;
}

public int getId_salas() {
	return Id_salas;
}

public void setId_salas(int id_salas) {
	Id_salas = id_salas;
}

public String getNombre_pelicula() {
	return Nombre_pelicula;
}

public void setNombre_pelicula(String nombre_pelicula) {
	Nombre_pelicula = nombre_pelicula;
}

public int getCapacidad_sala() {
	return Capacidad_sala;
}

public void setCapacidad_sala(int capacidad_sala) {
	Capacidad_sala = capacidad_sala;
}

public int getId_pelicula() {
	return Id_pelicula;
}

public void setId_pelicula(int id_pelicula) {
	Id_pelicula = id_pelicula;
}

}