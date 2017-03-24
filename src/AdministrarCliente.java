import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AdministrarCliente {
	
	private ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	
	public void addCliente() throws ParseException{							// Dar de alta un cliente
		Scanner sc = null;  //Puede que este mal si NullPointerException
		
		System.out.println("Introduzca el nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Introduzca el NIF: ");
		String NIF = sc.nextLine();
		
		System.out.println("Introduzca la provincia: ");
		String provincia = sc.nextLine();
		System.out.println("Introduzca la población: ");
		String poblacion = sc.nextLine();
		System.out.println("Introduzca el CP: ");
		int CP = sc.nextInt();
		Direccion direccion = new Direccion(CP, provincia, poblacion);
		
		System.out.println("Introduzca el correo: ");
		String correo = sc.nextLine();
		
		System.out.println("Introduzca la fechaAlta: ");		
		String dateString = sc.next();
	    DateFormat formatter = new SimpleDateFormat("EEEE dd MMM yyyy");		// Ejemplo: Monday 21 April 2016
	    Date fechaAlta = formatter.parse(dateString);
		
		System.out.println("Introduzca la tarifa: ");			
		float n = sc.nextFloat();
		Tarifa tarifa = new Tarifa(n);
		
		Cliente nuevoCliente = new Cliente(nombre, NIF, direccion, correo, fechaAlta, tarifa);
		listaCliente.add(nuevoCliente);
		
	}

}
