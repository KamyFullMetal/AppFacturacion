import java.util.Date;

public class Factura {
	
	// Atributos
	
	private int codigo;
	private Tarifa tarifa;
	private Date fechaEmision;
	private Date[] periodoFactura;
	private int NIF;
	private float importe = getImporte(NIF, periodoFactura, tarifa);
	
	// Constructor
	
	public void factura(int cod, Tarifa tarifa, Date fechaEmision, Date[] periodoFactura, float importe, int NIF){
		this.codigo = cod;
		this.tarifa = tarifa;
		this.fechaEmision = fechaEmision;
		this.periodoFactura = periodoFactura;
		this.importe = importe;
		this.NIF = NIF;
	}

	private float getImporte(int NIF, Date[] periodoFactura, Tarifa tari) {		// COMPLETAR
		//Sumatorio de todos los minutos del cliente por la tarifa aplicada
		//coger las llamadas del Cliente con NIF dentro de esas fechas
		
		int sumaDuracion = 0;
		
		float tarifa = tari.getPrecio();
		float impo= sumaDuracion*tarifa;
		return impo;
	}
	
	public Date getFecha(){
		return fechaEmision;
	}

}
