package web.loanchecker.model;

import java.util.List;

import web.loanchecker.model.*;

public class Prestamos {
	private int id_prestamo;
	private String cliente;
	private double tasa;
	private double monto;
	private double pagado;
	private boolean estado;
	private List<Pagos>pagos;
	
	public int getId_prestamo() {
		return id_prestamo;
	}
	public void setId_prestamo(int id_prestamo) {
		this.id_prestamo = id_prestamo;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getTasa() {
		return tasa;
	}
	public void setTasa(double tasa) {
		this.tasa = tasa;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getPagado() {
		return pagado;
	}
	public void setPagado(double pagado) {
		this.pagado = pagado;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public List<Pagos> getPagos() {
		return pagos;
	}
	public void setPagos(List<Pagos> pagos) {
		this.pagos = pagos;
	}
	
	public Prestamos(int id_prestamo, String cliente, double tasa, double monto, double pagado, boolean estado,
			List<Pagos> pagos) {
		super();
		this.id_prestamo = id_prestamo;
		this.cliente = cliente;
		this.tasa = tasa;
		this.monto = monto;
		this.pagado = pagado;
		this.estado = estado;
		this.pagos = pagos;
	}
	@Override
	public String toString() {
		return "Prestamos [id_prestamo=" + id_prestamo + ", cliente=" + cliente + ", tasa=" + tasa + ", monto=" + monto
				+ ", pagado=" + pagado + ", estado=" + estado + ", pagos=" + pagos + "]";
	}

	
	
}
