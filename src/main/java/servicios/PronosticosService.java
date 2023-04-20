package servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ar.edu.utn.ap40.DBManager;
import entidades.Pronosticos;

public class PronosticosService {
	
	public void crearPronosticos(Pronosticos pronosticos) {
		
		String query="INSERT INTO PRONOSTICOS (ronda, nombre, puntaje) VALUES ('"
				+pronosticos.getRonda()+"',"+ pronosticos.getNombre()+"',"+
				"',"+pronosticos.getPuntaje()+")";
		Connection connection = DBManager.getInstance().connect();
		try {
			Statement s = connection.createStatement();
			s.executeUpdate(query);
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
				e.printStackTrace();
				// throw new DAOException("Error al conectar con la base de datos", e);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				connection.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
		
	
	
	public Pronosticos getPronosticos(int id) {
		Pronosticos pronosticos=null;
		
		String query="SELECT * FROM PRONOSTICOS WHERE cd_pronosticos = '"+ id +"'";
		Connection conexion = DBManager.getInstance().connect();
		try {
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery(query);
			if (rs.next()) {
				pronosticos = new Pronosticos();
				pronosticos.setId(rs.getInt(1));
				pronosticos.setRonda(rs.getString(2));
				pronosticos.setNombre(rs.getString(3));
				pronosticos.setPuntaje(rs.getInt(4));
			}
		} catch (SQLException e) {
			try {
				conexion.rollback();
				e.printStackTrace();
				// throw new DAOException("Error al conectar con la base de datos", e);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conexion.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return pronosticos;

	}
	
	public ArrayList<Pronosticos> getPronosticos() {
		ArrayList<Pronosticos> pronosticos = new ArrayList<Pronosticos>();
		String query = "SELECT * FROM PRONOSTICOS";
		Connection conexion = DBManager.getInstance().connect();
		try {
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery(query);

			while (rs.next()) {
				Pronosticos pronostico = null;
				pronostico = new Pronosticos();
				pronostico.setId(rs.getInt(1));
				pronostico.setRonda(rs.getString(2));
				pronostico.setNombre(rs.getString(3));
				pronostico.setPuntaje(rs.getInt(4));

				pronosticos.add(pronostico);
			}

		} catch (SQLException e) {
			try {
				conexion.rollback();
				e.printStackTrace();
				// throw new DAOException("Error al conectar con la base de datos", e);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conexion.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return pronosticos;
	}

	

}
