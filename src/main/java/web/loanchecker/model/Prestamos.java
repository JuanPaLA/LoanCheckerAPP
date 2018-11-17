package web.loanchecker.model;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import web.loanchecker.model.*;

public class Prestamos {
	
	private int id_prestamo;
	private int id_cliente;
	private int id_pagos;
	private double monto;
	private double tasa;
	private double montoSaldado;
	private int cantidadPagos;
	private int diasPagados;
	private int diasNoPagados;
	private String fechaInicio; 
	private boolean estado; //True-> saldado; False-> en pago.
	private List<Pagos> pagos; //No va en el constructor
	
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
	public int getId_pagos() {
		return id_pagos;
	}
	public void setId_pagos(int id_pagos) {
		this.id_pagos = id_pagos;
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
	public double getMontoSaldado() {
		return montoSaldado;
	}
	public void setMontoSaldado(double montoSaldado) {
		this.montoSaldado = montoSaldado;
	}
	public int getCantidadPagos() {
		return cantidadPagos;
	}
	public void setCantidadPagos(int cantidadPagos) {
		this.cantidadPagos = this.pagos.size();
	}
	public int getDiasPagados() {
		return diasPagados;
	}
	public void setDiasPagados(int diasPagados) {
		this.diasPagados = diasPagados;
	}
	public int getDiasNoPagados() {
		return diasNoPagados;
	}
	public void setDiasNoPagados(int diasNoPagados) {
		this.diasNoPagados = diasNoPagados;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Prestamos [id_prestamo=" + id_prestamo + ", id_cliente=" + id_cliente + ", id_pagos=" + id_pagos
				+ ", tasa=" + tasa + ", monto=" + monto + ", montoSaldado=" + montoSaldado + ", cantidadPagos="
				+ cantidadPagos + ", diasPagados=" + diasPagados + ", diasNoPagados=" + diasNoPagados + ", fechaInicio="
				+ fechaInicio + ", estado=" + estado + "]";
	}
	
	public Prestamos(int id_prestamo, int id_cliente, int id_pagos, double tasa, double monto,
			double montoSaldado, int cantidadPagos, int diasPagados, int diasNoPagados, String fechaInicio,
			boolean estado) {
		super();
		this.id_prestamo = id_prestamo;
		this.id_cliente = id_cliente;
		this.id_pagos = id_pagos;
		this.tasa = tasa;
		this.monto = monto;
		this.montoSaldado = montoSaldado;
		this.cantidadPagos = cantidadPagos;
		this.diasPagados = diasPagados;
		this.diasNoPagados = diasNoPagados;
		this.fechaInicio = fechaInicio;
		this.estado = estado;
	}
	
	
	
}