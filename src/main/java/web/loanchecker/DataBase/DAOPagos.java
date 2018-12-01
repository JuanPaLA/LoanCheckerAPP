package web.loanchecker.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import web.loanchecker.model.Pagos;

public class DAOPagos implements Operaciones {
	
	Database db = new Database();

	@Override
	public String insertar(Object obj) {
		Pagos p = (Pagos) obj;
		Connection conn;
		PreparedStatement pst;
		String sql="insert into pagos values (?,?,?,?,?,?,?)";
		String respuesta="";
		
		try {
			Class.forName(db.getDriver());
			conn = DriverManager.getConnection(
					db.getUrl(),
					db.getUsuario(),
					db.getPass());
		
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
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuesta;
	}

	@Override
	public String eliminar(Object obj) {
		Pagos p = (Pagos) obj;
		Connection conn;
		PreparedStatement pst;
		String sql = "delete from cobros where id_cobro=?";
		String respuesta="";
	
		try {
			Class.forName(db.getDriver());
			conn = DriverManager.getConnection(
					db.getUrl(),
					db.getUsuario(),
					db.getPass());
			pst=conn.prepareStatement(sql);
			pst.setInt(1, p.getId_pago());

			int filas = pst.executeUpdate();
			
			respuesta= "Se eliminaron " + filas + " elementos";
			
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuesta;
	}

	@Override
	public String modificar(Object obj) {
		Pagos p = (Pagos) obj;
		Connection conn;
		PreparedStatement pst;
		String sql="update pagos set id_pago=?, id_prestamo=?, id_cliente=?, "
				+ "fecha=?, monto=?,"
				+ "monto pagado=?, estado=?";
		String respuesta="";
		
		try {
			Class.forName(db.getDriver());
			conn = DriverManager.getConnection(
					db.getUrl(),
					db.getUsuario(),
					db.getPass());
		
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
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuesta;
	}

	@Override
	public List<?> consultar() {
	List<Pagos> datosP = new ArrayList<Pagos>();
	Connection conn;
	PreparedStatement st;
	ResultSet rs;
	String sql = "select * from pagos";
	
	try {
		Class.forName(db.getDriver());
		conn = DriverManager.getConnection(
				db.getUrl(),
				db.getUsuario(),
				db.getPass());
		st = conn.prepareStatement(sql);
		rs = st.executeQuery();
		
		while(rs.next()) {
			datosP.add(new Pagos(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6), rs.getBoolean(7)));
			System.out.println(datosP.get(0).toString());
		}
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return datosP;
		
	}

	@Override
	public List<?> filtrar(String campo, String criterio) {
		List<Pagos> datosP = new ArrayList<Pagos>();
		Connection conn;
		PreparedStatement st;
		ResultSet rs;
		String sql = "select * from pagos where " + campo + criterio;
		
		try {
			Class.forName(db.getDriver());
			conn = DriverManager.getConnection(db.getDriver(), db.getUsuario(), db.getPass());
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			
			while(rs.next()) {
				datosP.add(new Pagos(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6), rs.getBoolean(7)));
			}
			
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
			return null;
	}

}
