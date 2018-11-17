package web.loanchecker.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import web.loanchecker.model.Clientes;
import web.loanchecker.model.Pagos;

public class DAOPagos implements Operaciones {

	@Override
	public String insertar(Object obj) {
		Pagos p = (Pagos) obj;
		Connection conn;
		PreparedStatement pst;
		String sql="insert into pagos values (?,?,?,?,?,?,?)";
		String respuesta="";
		
		try {
		
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/loanchecker", "root", "");
		
			pst=conn.prepareStatement(sql);
			pst.setInt(1, p.getId_pago());
			pst.setInt(2, p.getId_prestamo());
			pst.setInt(3, p.getId_cliente());
			pst.setString(4, p.getFecha());
			pst.setDouble(5, p.getMonto());
			pst.setDouble(6, p.getMontoPagado());
			pst.setBoolean(7, p.isEstado());
			
			int filas = pst.executeUpdate();
			
			respuesta= " se registraron " + filas + " elementos";
			
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return respuesta;
	}

	@Override
	public String eliminar(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String modificar(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> consultar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> filtrar(String campo, String criterio) {
		// TODO Auto-generated method stub
		return null;
	}

}
