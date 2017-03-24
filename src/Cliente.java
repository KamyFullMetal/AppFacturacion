import java.util.Date;

public class Cliente {
	
	/*Atributos*/
	
	private String nombre;
	private String NIF;
	private Direccion direccion = new Direccion();
	private String correo;
	private Date fechaAlta;
	private Tarifa tarifa = new Tarifa();
	
	/*Constructor*/
	
	public void cliente (String nom, String nif, Direccion direc, String correu, Date dataAlta, Tarifa tarifa){
		this.nombre = nom;
		this.NIF = nif;
		this.direccion = direc;
		this.correo = correu;
		this.fechaAlta = dataAlta;
		this.tarifa = tarifa;
	}
	
}