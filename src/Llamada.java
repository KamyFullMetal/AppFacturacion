import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Llamada {

	// Atributos
	
	private int tlfnDestino;
	private Date fechaHora;
	private int duracion;
	private int NIF;
	private ArrayList<Llamada> listaLlamada = new ArrayList<Llamada>();
	// Constructor

	public Llamada(int tlfnDestino, Date fechaHora, int duracion, int nif){
		
		this.tlfnDestino = tlfnDestino;
		this.fechaHora = fechaHora;
		this.duracion = duracion;
		this.NIF = nif;
		
	}
	
	// Metodos
	
	// Dar alta una llamada
	public void DarAlta() throws ParseException{
		Scanner sc = null;
		
		System.out.println("Introduzca el numero al que llamas: ");
		int llamada = sc.nextInt();
		
		System.out.println("Introduzca ahora la fecha de la llamada: Ex: Monday 12 December 2013");
	    String dateString = sc.next();
	    DateFormat formatter = new SimpleDateFormat("EEEE dd MMM yyyy");
	    Date date = formatter.parse(dateString);
	    
	    System.out.println("Introduzca la duracion de la llamada en minutos:");
	    int duracion = sc.nextInt();
	    
	    System.out.println("Por acabar, introduzca el nif del cliente que ha realizado la llamada: ");
	    int NIF = sc.nextInt();
		
		sc.close();
		
		//Crear la nueva llamada
		Llamada e = new Llamada(llamada, date, duracion, NIF);
		listaLlamada.add(e);
	}	
	
	public void listarLlamadas(){
		System.out.println("Lista de todas las llamadas:\n************************************************");
		System.out.println("NIF\tFecha\tDuracion\tTelefono Destinatario");
		for(Llamada e : listaLlamada){
			System.out.println(e.getNIF()+" "+e.getFecha()+" "+e.getDuracion()+" "+e.getTlfnDestino());
		}
	}
	
	public void listarLlamadasNIF(int NIF){
		System.out.println("Lista de todas las llamadas de "+ NIF +":\n************************************************");
		System.out.println("NIF\tFecha\tDuracion\tTelefono Destinatario");
		for(Llamada e : listaLlamada){
			if(e.getNIF() == NIF){
				System.out.println(e.getNIF()+" "+e.getFecha()+" "+e.getDuracion()+" "+e.getTlfnDestino());
			}
		}
	}
	
	public int getTlfnDestino() {
		return tlfnDestino;
	}

	public void setTlfnDestino(int tlfnDestino) {
		this.tlfnDestino = tlfnDestino;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getNIF() {
		return NIF;
	}

	public void setNIF(int nIF) {
		NIF = nIF;
	}

	public Date getFecha(){
		return fechaHora;
	}
}
