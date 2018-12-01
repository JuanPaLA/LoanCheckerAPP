package web.loanchecker.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import web.loanchecker.model.Clientes;
import web.loanchecker.model.Prestamos;

public class DAOPrestamos implements Operaciones {

	Database db = new Database();	
	
	@Override
	public String insertar(Object obj) {

		Prestamos p = (Prestamos) obj;
		Connection conn;
		PreparedStatement pst;
		String sql="insert into prestamos values (?,?,?,?,?,?,?,?,?,?,?)";
		String respuesta="";
		
		try {
		
			Class.forName(db.getDriver());
			conn = DriverManager.getConnection(
					db.getUrl(),
					db.getUsuario(),
					db.getPass());
		
			pst=conn.prepareStatement(sql);
			pst.setInt(1, p.getId_prestamo());
			pst.setInt(2,  p.getId_cliente());
			pst.setInt(3, p.getId_pagos());
			pst.setDouble(4, p.getMonto());
			pst.setDouble(5, p.getTasa());
			pst.setDouble(6, p.getMontoSaldado());
			pst.setInt(7, p.getCantidadPagos());
			pst.setInt(8, p.getDiasPagados());
			pst.setInt(9, p.getDiasNoPagados());
			pst.setString(10, p.getFechaInicio());
			pst.setBoolean(11, p.isEstado());
			
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
		Prestamos pp = (Prestamos) obj;
		Connection conn;
		PreparedStatement pst;
		String sql = "delete from prestamos where id_prestamo=?";
		
		try {
			Class.forName(db.getDriver());
			conn = DriverManager.getConnection(
					db.getUrl(),
					db.getUsuario(),
					db.getPass());			
			pst=conn.prepareStatement(sql);
			pst.setInt(1, pp.getId_prestamo());
			
			pst.executeUpdate();
			
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
