import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Login {
	
	private String Correo_usuario;
	private String Password;
	
	public Login(String Correo_usuario, String Password) {
		
		this.Correo_usuario = Correo_usuario;
		this.Password = Password;
	}
	
	
	public usuario ingresar() throws SQLException {
		
		usuario user = null;
		Conexion Conexion = new Conexion();
		
		String sql = "select * from usuario where Correo_usuario="+"'"+
		this.Correo_usuario+"'"+" and Password="+"'"+this.Password+"'";
		//System.out.println(sql);
		
		ResultSet rs = Conexion.devuelveConsulta(sql);
		
		while(rs.next()) {
			System.out.println("Ingreso Exitoso!");
			
			int Id_usuario=rs.getInt("Id_usuario"); //nombre de columna
			String Nombre=rs.getString("Nombre");
			String Apellido=rs.getString("Apellido");
			int DNI_usuario=rs.getInt("DNI");
			String Fecha_nacimiento=rs.getString("Contrasenia_usuario");
			String Num_cel= rs.getString("Numero cel");
			String Correo_usuario = rs.getString("Correo");
			String Password = rs.getString("Contraseña");
			int Nom_tipo = rs.getInt("Usuario");
			int Id_reserva = rs.getInt("Reserva");
			user = new usuario (Id_usuario, Nombre, Apellido,DNI_usuario,Fecha_nacimiento,Num_cel, Correo_usuario, Password,Nom_tipo,Id_reserva);
			
		}
		return user;
	}
	
	public String getCorreo_usuario() {
		return Correo_usuario;
	}
	public void setCorreo_usuario(String Correo_usuario) {
		this.Correo_usuario = Correo_usuario;
	}
	public String getContra() {
		return Password;
	}
	public void setContra(String Password) {
		this.Password = Password;
	}
}