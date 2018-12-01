package web.loanchecker.model;

import java.sql.Date;

public class Pagos {
	private int id_pago;
	private int id_prestamo;
	private int id_cliente;
	private String fecha; /* "yyyy-mm-dd" */
	private double monto;
	private double montoPagado;
	private boolean estado;

	//-----------Getters & Setters----------------------------//
	
	public int getId_pago() {
		return id_pago;
	}
	public void setId_pago(int id_pago) {
		this.id_pago = id_pago;
	}
	public int getId_prestamo() {
		return id_prestamo;
	}
	public void setId_prestamo(int id_prestamo) {
		this.id_prestamo = id_prestamo;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getMontoPagado() {
		return montoPagado;
	}
	public void setMontoPagado(double montoPagado) {
		this.montoPagado = montoPagado;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	 
	//-----------Constructor Field----------------------------//
	public Pagos(int id_pago, int id_prestamo, int id_cliente, String fecha, 
			double monto, double montoPagado,
			boolean estado) {
		super();
		this.id_pago = id_pago;
		this.id_prestamo = id_prestamo;
		this.id_cliente = id_cliente;
		this.fecha = fecha;
		this.monto = monto;
		this.montoPagado = montoPagado;
		this.estado = estado;
	}
		
	//-----------toString----------------------------//
	
	@Override
	public String toString() {
	return "Pagos [id_pago=" + id_pago + ", id_prestamo=" + id_prestamo + ", id_cliente=" + id_cliente + ", fecha="
			+ fecha + ", monto=" + monto + ", montoPagado=" + montoPagado + ", estado=" + estado + "]";

	}
}