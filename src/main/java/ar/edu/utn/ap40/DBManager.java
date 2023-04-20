package ar.edu.utn.ap40;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBManager {
	
	private static String DB_NAME="TrabajoIntegrador";
	private static String DB_URL="jdbc:mysql://localhost:3306/?user=root"+DB_NAME;
	private static String DB_USERNAME="root";
	private static String DB_PASSWORD="163078Tt5952";
	private static DBManager instance=null;
	
	private DBManager() {
		
	}
	
    public static DBManager getInstance() {
		if(instance==null) {
			instance=new DBManager();
		}
		
		return instance;
	}
    
    public Connection connect() {
    	Connection connection=null;
    	
    	try {
			connection=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return connection;
    }

	
	


}
