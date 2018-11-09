package web.loanchecker.DataBase;


/*CLASE QUE CENTRALIZA LAS CREDENCIALES PARA EL ACCESO A LA BASE DE DATOS */

public class Database {
	private String driver;
	private String url;
	private String usuario;
	private String pass;
	
	public Database() {
		
		this.driver = "com.mysql.jdbc.Driver";
		this.url = "jdbc:mysql://localhost:3306/loancheker";
		this.usuario = "root"; //--> VERIFICAR
		this.pass = ""; //--> VERIFICAR 
	}

	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}


	public String getUsuario() {
		return usuario;
	}

	
	public String getPass() {
		return pass;
	}

	
	
	
	
}
