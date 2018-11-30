package DiplomaturaJavaUTN.LoanChecker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

import web.loanchecker.DataBase.DAOCliente;
import web.loanchecker.model.Clientes;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {        
    	
    	String port;
    	try {
    		if(IpDetect.ipDetecter().equals("192.168.0.96")) {
    			port = "3306";
    		}else {
    			port="3308";
    		}
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loanchecker", "root", "");
    		Statement pst = null;
    		String query = "INSERT INTO clientes VALUES (6, 'cacho', 'lopes', 22, '123321', 123123, '123123', 'asdsad', 'asdasd', 'sdfsfs')";
    		String query2 = "select * from clientes";
    		
    		pst =con.createStatement();
    		
    		pst.executeUpdate(query);
   
    		
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    	
    	
    	
    	
    	//DAOCliente a = new DAOCliente();
//    	
//    	Clientes nabo = new Clientes(3, "pacho", "herrera", 23, 32165444, "malabai 22", 65414787); 
//    	
//    	//a.insertar(nabo);
//    	
//    	a.eliminar(nabo);
    	
    	
    	
    	
    	
    }
}
