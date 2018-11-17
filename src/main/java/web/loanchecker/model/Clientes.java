package web.loanchecker.model;

public class Clientes {
	private int id_cliente;
	private String nombre;
	private String apellido;
	private int edad; //¿?
	private int celular;
	private int dni;
	private String telFijo;
	private String domicilioCobro;
	private String domicilioSecundario;
	private String barrio;
	
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getTelFijo() {
		return telFijo;
	}
	public void setTelFijo(String telFijo) {
		this.telFijo = telFijo;
	}
	public String getDomicilioCobro() {
		return domicilioCobro;
	}
	public void setDomicilioCobro(String domicilioCobro) {
		this.domicilioCobro = domicilioCobro;
	}
	public String getDomicilioSecundario() {
		return domicilioSecundario;
	}
	public void setDomicilioSecundario(String domicilioSecundario) {
		this.domicilioSecundario = domicilioSecundario;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	
	@Override
	public String toString() {
		return "Clientes [id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", celular=" + celular + ", dni=" + dni + ", telFijo=" + telFijo + ", domicilioCobro="
				+ domicilioCobro + ", domicilioSecundario=" + domicilioSecundario + ", barrio=" + barrio + "]";
	}
	
	public Clientes(int id_cliente, String nombre, String apellido, int edad, int celular, int dni, String telFijo,
			String domicilioCobro, String domicilioSecundario, String barrio) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.celular = celular;
		this.dni = dni;
		this.telFijo = telFijo;
		this.domicilioCobro = domicilioCobro;
		this.domicilioSecundario = domicilioSecundario;
		this.barrio = barrio;
	}

	
	
	
}