package DiplomaturaJavaUTN.LoanChecker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import web.loanchecker.DataBase.DAOCliente;
import web.loanchecker.DataBase.DAOPagos;
import web.loanchecker.DataBase.DAOPrestamos;
import web.loanchecker.model.Clientes;
import web.loanchecker.model.Pagos;
import web.loanchecker.model.Prestamos;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        
    	//DAOCliente a = new DAOCliente();
    	
    	//Clientes nabo = new Clientes(3, "pacho", "herrera", 23, 32165444, "malabai 22", 65414787); 
    	
    	DAOPagos p = new DAOPagos();
    	Pagos pp = new Pagos(1,1,1, "1995-11-11", 4321, 1000, false);
    	p.insertar(pp);
    	
    	//Prestamos p = new Prestamos(1,3,1, 44, 1231, 1000, 12, 11, 10, "1995-12-12", false);
    	
    	//DAOPrestamos prest = new DAOPrestamos();
    	
    	
    	
    	
    	
    	
    	//prest.insertar(p);
    	
    	//a.insertar(nabo);
    	
    	//a.eliminar(nabo);
    	
    	
    	
    }
}
