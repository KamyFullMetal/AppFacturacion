import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Cliente {
	
	/*Atributos*/
	
	private String nombre;
	private String NIF;
	private Direccion direccion;
	private String correo;
	private Date fechaAlta;
	private Tarifa tarifa;
	/*Constructor*/
	
	public Cliente (String nom, String nif, Direccion direc, String correu, Date dataAlta, Tarifa tarifa){
		this.nombre = nom;
		this.NIF = nif;
		this.direccion = direc;
		this.correo = correu;
		this.fechaAlta = dataAlta;
		this.tarifa = tarifa;
	}
	
	public Date getFecha(){
		return fechaAlta;
	}
	
}