import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AdministrarFactura {

	private ArrayList<Factura> listaFactura = new ArrayList<Factura>();
	
	// Metodos

		private float getImporte(int NIF, Date[] periodoFactura, Tarifa tari) {		// COMPLETAR
			//Sumatorio de todos los minutos del cliente por la tarifa aplicada
			//coger las llamadas del Cliente con NIF dentro de esas fechas
			
			int sumaDuracion = 0;
			
			float tarifa = tari.getPrecio();
			float impo= sumaDuracion*tarifa;
			return impo;
		}
		
		public void emitirFactura() throws ParseException{
			Scanner sc = null; //Puede fallar con NullPointerException
			
			System.out.println("Introduzca el codigo de la factura: Ex:123");
			int codigo = sc.nextInt();
			
			System.out.println("Introduzca la tarifa que tienen contratada el cliente: EX: 54");
			int precio = sc.nextInt();
			tarifa.setPrecio(precio);
			
			System.out.println("Introduzca la fecha de Emision: Ex: Monday 12 December 2013");
		    String dateString = sc.next();
		    DateFormat formatter = new SimpleDateFormat("EEEE dd MMM yyyy");
		    Date dateEmision = formatter.parse(dateString);
			
		    System.out.println("Introduzca el periodo de Factura: Ex: \nMonday 12 December 2013 \nFriday 17 April 2015");
		    String dateStringInit = sc.next();
		    DateFormat formatterInit = new SimpleDateFormat("EEEE dd MMM yyyy");
		    Date dateInit = formatterInit.parse(dateStringInit);
		    
		    String dateStringFinal = sc.next();
		    DateFormat formatterFinal = new SimpleDateFormat("EEEE dd MMM yyyy");
		    Date dateFinal = formatterFinal.parse(dateStringFinal);
			
		    periodoFactura[0] = dateInit;
		    periodoFactura[1] = dateFinal;
		    
		    System.out.println("Introduzca el NIF del cliente: Ex: 12456");
		    int NIF = sc.nextInt();
		    
		    //incompleto y erroneo seguramente
		    float importe = getImporte(NIF, periodoFactura, tarifa);
		    
		    sc.close();
		    
		    Factura e = new Factura(codigo, tarifa, dateEmision, periodoFactura, importe, NIF);
		    listaFactura.add(e);
		}
		
		public void listarFacturasCodigo(int codigo){
			System.out.println("Lista de todas las llamadas con codigo "+ codigo +":\n************************************************");
			System.out.println("NIF\tFechaEmision\tFecha\tTarifa\tImporte");
			for(Factura i : listaFactura){
				if(i.getCodigo() == codigo){
					System.out.println(i.getNIF()+" "+i.getFechaEmision()+" "+i.getFecha()+" "+i.getTarifa()+" "+i.getImporte());
				}
			}
		}
		
		public void listarFacturasNIF(int NIF){
			System.out.println("Lista de todas las llamadas con NIF "+ NIF +":\n************************************************");
			System.out.println("NIF\tFechaEmision\tFecha\tTarifa\tImporte\tCodigo");
			for(Factura i : listaFactura){
				if(i.getNIF() == NIF){
					System.out.println(i.getNIF()+" "+i.getFechaEmision()+" "+i.getFecha()+" "+i.getTarifa()+" "+i.getImporte()+" "+i.getNIF());
				}
			}
		}
}
