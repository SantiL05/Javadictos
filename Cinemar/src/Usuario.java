import java.sql.SQLException;
import java.util.*;

public class Usuario {
	
	private int Id_usuario;
	private String Nombre;
	private String Apellido;
	private int DNI;
	private Date Fecha_nacimiento;
	private int Celular;
	private String Email;
	private String Password;
	private int Tipo_usuario;
	private int Id_reserva;
	
	public Usuario(int Id_usuario, String Nombre, String Apellido, String Email, String Password, int Tipo_usuario, int Id_reserva) {

		
		this.Id_usuario = Id_usuario;
		this.Nombre=Nombre;
		this.Apellido= Apellido;
		this.Email = Email;
		this.Password = Password;
		this.Tipo_usuario = Tipo_usuario;
		this. Id_reserva = Id_reserva;
	}

	public int getId_usuario() {
		return Id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		Id_usuario = id_usuario;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public Date getFecha_nacimiento() {
		return Fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		Fecha_nacimiento = fecha_nacimiento;
	}

	public int getCelular() {
		return Celular;
	}

	public void setCelular(int celular) {
		Celular = celular;
	}

	public int getTipo_usuario() {
		return Tipo_usuario;
	}

	public void setTipo_usuario(int tipo_usuario) {
		Tipo_usuario = tipo_usuario;
	}

	public int getId_reserva() {
		return Id_reserva;
	}

	public void setId_reserva(int id_reserva) {
		Id_reserva = id_reserva;
	}
}