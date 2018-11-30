//https://www.youtube.com/watch?v=Sxm3b9_f9RU&t=0s&list=LLUYqnuH7Npjvq1_bGB7E3yw&index=4

package web.loanchecker.DataBase;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/*CLASE QUE CENTRALIZA LAS CREDENCIALES PARA EL ACCESO A LA BASE DE DATOS */

public class Database {

	private String driver;
	private String url;
	private String usuario;
	private String pass;
	
	public Database() {
		this.driver="com.mysql.jdbc.Driver";
		this.url="jdbc:mysql://sql10.freesqldatabase.com:3306/sql10266055";
		this.usuario="sql10266055";
		this.pass="4qmg65xSW8";
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
