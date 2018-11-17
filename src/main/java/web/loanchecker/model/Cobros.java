package web.loanchecker.model;

import java.sql.Date;

public class Cobros {
	private int id_cobro;
	private int id_prestamo;
	private int id_cliente;
	private int id_pago;
	private int id_gestor;
	private double monto;
	private double montoCobrado;
	private Date fechaCobro; // --> Date SQL!
	
	
}
