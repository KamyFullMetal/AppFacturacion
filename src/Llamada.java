import java.util.Date;

public class Llamada {

	// Atributos
	
	private int tlfnDestino;
	private Date fechaHora;
	private int duracion;
	private int NIF;
	
	// Constructor
	
	public void llamada(int tlfnDestino, Date fechaHora, int duracion, int nif){
		
		this.tlfnDestino = tlfnDestino;
		this.fechaHora = fechaHora;
		this.duracion = duracion;
		this.NIF = nif;
		
	}
	
	public Date getFecha(){
		return fechaHora;
	}
}
