package web.loanchecker.DataBase;

import java.util.*;
import java.sql.*;
import web.loanchecker.model.Clientes;

public class DAOCliente implements Operaciones {
	
	Database db = new Database();
	
	public String insertar(Object obj) {
		Clientes c = (Clientes) obj;
		Connection conn;
		PreparedStatement pst;
		String sql="insert into Clientes values (?.?,?.?,?,?,?,?,?,?)";
		String respuesta="";
		
		try {
		
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/loanchecker", "root", "");
		
			pst=conn.prepareStatement(sql);
			pst.setInt(1, c.getId_cliente());
			pst.setString(2, c.getNombre());
			pst.setString(3, c.getApellido());
			pst.setInt(4, c.getEdad());
			pst.setInt(5, c.getCelular());
			pst.setInt(6, c.getDni());
			pst.setString(7, c.getTelFijo());
			pst.setString(8, c.getDomicilioCobro());
			pst.setString(9, c.getDomicilioSecundario());
			pst.setString(10, c.getBarrio());
			
			int filas = pst.executeUpdate();
			
			respuesta= " se registraron " + filas + " elementos";
			
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return respuesta;
	}

	public String eliminar(Object obj) {
		Clientes c = (Clientes) obj;
		Connection conn;
		PreparedStatement pst;
		String sql= "delete from clientes where id_Cliente=?";
		String respuesta="";
		
		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/loanchecker", "root", "");
			pst=conn.prepareStatement(sql);
			pst.setInt(1, c.getId_cliente());

			int filas = pst.executeUpdate();
			
			respuesta= "Se eliminaron " + filas + " elementos";
			
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return respuesta;
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
	
	/*
	public String modificar(Object obj) {
		Clientes c = (Clientes) obj;
		Connection conn;
		PreparedStatement pst;
		String sql= "update clientes set nombre=?, apellido=?, edad=?, celular=?, domicilio=?, dni=? where id_cliente=?";
		String respuesta="";
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/loanchecker", "root", "");
			pst=conn.prepareStatement(sql);
			pst.setString(1, c.getNombre());
			pst.setString(2, c.getApellido());
			pst.setInt(3, c.getEdad());
			pst.setInt(4, c.getCelular());
			pst.setString(5, c.getDomicilioCobro());
			pst.setInt(6, c.getDni());
			pst.setInt(7, c.getId_cliente());
			
			int filas = pst.executeUpdate();
			
			respuesta= "Se modificaron " + filas + " elementos";
			
			conn.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return respuesta;
	}

	public List<Clientes> consultar() {
		List<Clientes> datos = new ArrayList<Clientes>();
		Connection conn;
		PreparedStatement pst;
		ResultSet rs;
		String sql = "select * from clientes";
		
		try {
			Class.forName(db.getDriver());
			conn = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPass());
			pst = conn.prepareStatement(sql);
			rs= pst.executeQuery();
			
			while(rs.next()) {
				datos.add(new Clientes(rs.getInt("id_cliente"), 
						rs.getString("nombre"), 
						rs.getString("apellido"), 
						rs.getInt("edad"), 
						rs.getInt("celular"), 
						rs.getString("domicilio"), 
						rs.getInt("dni")));
			}
			
			conn.close();
			
		}catch (SQLException e){
			e.getMessage();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(datos.size() + "numero de cambipos");
		return datos;
	}

	public List<Clientes> filtrar(String campo, String criterio) {
		List<Clientes> datos = new ArrayList<Clientes>();
		Connection conn;
		PreparedStatement pst;
		ResultSet rs;
		String sql = "select * from clientes";
		
		try {
			Class.forName(db.getDriver());
			conn = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPass());
			pst = conn.prepareStatement(sql);
			rs= pst.executeQuery();
			
			while(rs.next()) {
				datos.add(new Clientes(rs.getInt("id_cliente"), 
						rs.getString("nombre"), 
						rs.getString("apellido"), 
						rs.getInt("edad"), 
						rs.getInt("celular"), 
						rs.getString("domicilio"), 
						rs.getInt("dni")));
			}
			
			conn.close();
			
		}catch (SQLException e){
			e.getMessage();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return datos;
	}
	
	*/

}
