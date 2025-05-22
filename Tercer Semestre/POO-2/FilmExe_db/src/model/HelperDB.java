
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class HelperDB {

	public boolean executeDML(String sql, Object object) { 
		
		boolean check = false;	
		try {Connection connection = new ConnectionBD().getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			for (int i = 1; i < object.length; i++) {
				ps.setObject(i, object.getName());
			}
			int valid = ps.executeUpdate();
			
			if (valid > 0) check = true;

		} catch (SQLException e) {
			System.out.println("El error es: " + e.toString());
			check = false;
		}
		return check;
	}

	public ResultSet ejecutarConsulta(String sql, Object object) {

		ResultSet datos = null;

		try { Connection connection = new ConnectionBD().getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			datos = ps.executeQuery();

		} catch (SQLException e) {
			System.out.println("El error es: " + e.toString());
			datos = null;
		}
		return datos;
	}

	public boolean SetPreparedStatement(Object object){
		for (int i = 0; i < object.; ++) {
			Object object1 = arr[];
			
		}
	
	}
}
