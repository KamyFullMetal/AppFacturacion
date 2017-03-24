import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Cliente {
	
	/*Atributos*/
	
	private String nombre;
	private String NIF;
	private Direccion direccion = new Direccion();
	private String correo;
	private Date fechaAlta;
	private Tarifa tarifa = new Tarifa();
	private ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	
	/*Constructor*/
	
	public Cliente (String nom, String nif, Direccion direc, String correu, Date dataAlta, Tarifa tarifa){
		this.nombre = nom;
		this.NIF = nif;
		this.direccion = direc;
		this.correo = correu;
		this.fechaAlta = dataAlta;
		this.tarifa = tarifa;
	}
	
	public void addCliente(){
		Scanner sc = null;  //Puede que este mal si NullPointerException
		System.out.println("Introduzca el nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduzca el NIF: ");
		String NIF = sc.nextLine();
		System.out.println("Introduzca la dirección: ");		// Falta completar la introducción de la dirección
		Direccion direccion = sc.nextLine();
		System.out.println("Introduzca el correo: ");
		String correo = sc.nextLine();
		System.out.println("Introduzca la fechaAlta: ");		// Falta completar la introducción de las fechas
		Date fechaAlta = sc.nextLine();
		System.out.println("Introduzca la tarifa: ");			
		float n = sc.nextFloat();
		Tarifa nuevatarifa = new Tarifa(n);
		
	}
	
	public Date getFecha(){
		return fechaAlta;
	}
	
}