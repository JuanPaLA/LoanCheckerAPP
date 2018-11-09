package web.loanchecker.model;

import java.sql.Date;

public class Pagos {
	private int id_pago;
	private int id_prestamo;
	private int id_cliente;
	private Date fecha; //-> Date SQL
	private int dias;
	private boolean estado;
	private int diasPagos;
	private int diasRestantes;
	
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public int getDiasPagos() {
		return diasPagos;
	}
	public void setDiasPagos(int diasPagos) {
		this.diasPagos = diasPagos;
	}
	public int getDiasRestantes() {
		return diasRestantes;
	}
	public void setDiasRestantes(int diasRestantes) {
		this.diasRestantes = diasRestantes;
	}
	
	//-----------constructor----------------------------//
	public Pagos(int id_pago, int id_prestamo, int id_cliente, Date fecha, int dias, boolean estado, int diasPagos,
			int diasRestantes) {
		super();
		this.id_pago = id_pago;
		this.id_prestamo = id_prestamo;
		this.id_cliente = id_cliente;
		this.fecha = fecha;
		this.dias = dias;
		this.estado = estado;
		this.diasPagos = diasPagos;
		this.diasRestantes = diasRestantes;
	}
	//-----------Getters & Setters----------------------------//
	@Override
	public String toString() {
		return "Pagos [id_pago=" + id_pago + ", id_prestamo=" + id_prestamo + ", id_cliente=" + id_cliente + ", fecha="
				+ fecha + ", dias=" + dias + ", estado=" + estado + ", diasPagos=" + diasPagos + ", diasRestantes="
				+ diasRestantes + "]";
	}
	

	
}
