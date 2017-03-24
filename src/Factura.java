import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Factura {
	
	// Atributos
	
	private int codigo;
	private Tarifa tarifa;
	private Date fechaEmision;
	private Date[] periodoFactura = new Date[2];
	private int NIF;
	private float importe;
	
	// Constructor

	public Factura(int cod, Tarifa tarifa, Date fechaEmision, Date[] periodoFactura, float importe, int NIF){
		this.codigo = cod;
		this.tarifa = tarifa;
		this.fechaEmision = fechaEmision;
		this.periodoFactura = periodoFactura;
		this.importe = importe;
		this.NIF = NIF;
	}
	
	public Date getFecha(){
		return fechaEmision;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Tarifa getTarifa() {
		return tarifa;
	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date[] getPeriodoFactura() {
		return periodoFactura;
	}

	public void setPeriodoFactura(Date[] periodoFactura) {
		this.periodoFactura = periodoFactura;
	}

	public int getNIF() {
		return NIF;
	}

	public void setNIF(int nIF) {
		NIF = nIF;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public ArrayList<Factura> getListaFactura() {
		return listaFactura;
	}

	public void setListaFactura(ArrayList<Factura> listaFactura) {
		this.listaFactura = listaFactura;
	}

}
