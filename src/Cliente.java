import java.util.Date;

public class Cliente {
	/*Atributos*/
	String nombre;
	String NIF;
	Direccion direccion = new Direccion();
	String correo;
	Date fechaAlta;
	Tarifa tarifa = new Tarifa();
	
	
	/*Constructor*/
	public void cliente (String nom, String nif, Direccion direc, String correu, Date dataAlta, Tarifa tari){
		this.nombre = nom;
		this.NIF = nif;
		this.direccion = direc;
		this.correo = correu;
		this.fechaAlta = dataAlta;
		this.tarifa = tari;
	}
	
}