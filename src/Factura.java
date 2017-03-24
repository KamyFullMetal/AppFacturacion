import java.util.Date;

public class Factura {
	
	// Atributos
	
	private int codigo;
	private Tarifa tarifa;
	private Date fechaEmision;
	private Date[] periodoFactura;
	private float importe = getImporte();
	
	// Constructor
	
	public void Factura(int cod, Tarifa tarifa, Date fechaEmision, Date[] periodoFactura, float importe){
		
		this.codigo = cod;
		this.tarifa = tarifa;
		this.fechaEmision = fechaEmision;
		this.periodoFactura = periodoFactura;
		this.importe = importe;
	}

	private float getImporte() {
		// TODO Auto-generated method stub
		return 0;
	}

}
