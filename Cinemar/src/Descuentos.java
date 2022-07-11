
import java.util.*;

public class Descuentos {
	private int Id_descuentos;
	private int Dias_descuentos;
	private int Porcentaje_descuentos;
public Descuentos (int Id_descuentos,int Dias_descuentos,int Porcentaje_descuentos) {
	this.Id_descuentos=Id_descuentos;
	this.Dias_descuentos=Dias_descuentos;
	this.Porcentaje_descuentos=Porcentaje_descuentos;
}
public int getId_descuentos() {
	return Id_descuentos;
}
public void setId_descuentos(int id_descuentos) {
	Id_descuentos = id_descuentos;
}
public int getDias_descuentos() {
	return Dias_descuentos;
}
public void setDias_descuentos(int dias_descuentos) {
	Dias_descuentos = dias_descuentos;
}
public int getPorcentaje_descuentos() {
	return Porcentaje_descuentos;
}
public void setPorcentaje_descuentos(int porcentaje_descuentos) {
	Porcentaje_descuentos = porcentaje_descuentos;
}

}