package web.loanchecker.model;

public class Clientes {
	private int id_cliente;
	private String nombre;
	private String apellido;
	private int edad;
	private String celular;
	private String domicilio;
	private String dni;
	
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public Clientes(int id_cliente, String nombre, String apellido, int edad, String celular, String domicilio,
			String dni) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.celular = celular;
		this.domicilio = domicilio;
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Clientes [id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", celular=" + celular + ", domicilio=" + domicilio + ", dni=" + dni + "]";
	}
	
	
	
	
}
