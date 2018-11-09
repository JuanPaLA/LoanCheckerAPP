package web.loanchecker.model;

import java.util.List;

public class Gestores {
	private int id_gestor;
	private String nombre;
	private String apellido;
	private String dni;
	private List<Prestamos> prestamos;
	private List<Clientes> clientes;
	private List<Pagos> pagos;
	
	public int getId_gestor() {
		return id_gestor;
	}
	public void setId_gestor(int id_gestor) {
		this.id_gestor = id_gestor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public List<Prestamos> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(List<Prestamos> prestamos) {
		this.prestamos = prestamos;
	}
	public List<Clientes> getClientes() {
		return clientes;
	}
	public void setClientes(List<Clientes> clientes) {
		this.clientes = clientes;
	}
	public List<Pagos> getPagos() {
		return pagos;
	}
	public void setPagos(List<Pagos> pagos) {
		this.pagos = pagos;
	}
	
	public Gestores(int id_gestor, String nombre, String apellido, String dni, List<Prestamos> prestamos,
			List<Clientes> clientes, List<Pagos> pagos) {
		super();
		this.id_gestor = id_gestor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.prestamos = prestamos;
		this.clientes = clientes;
		this.pagos = pagos;
	}
	
	@Override
	public String toString() {
		return "Gestores [id_gestor=" + id_gestor + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", prestamos=" + prestamos + ", clientes=" + clientes + ", pagos=" + pagos + "]";
	}
	
	
}
