import java.sql.*;
import javax.swing.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;





public class sqliteConnection {
	private static Logger log = Logger.getLogger(sqliteConnection.class);
	Connection conn=null; 
	
	public static Connection dbConnector() {
		
		try {
			//log.setAdditivity(false);
			BasicConfigurator.configure();
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/logio/Desktop/Java Project/Registered");
			JOptionPane.showMessageDialog(null, "Connection successfull");
			log.info("Connection was established");
			
			return conn;
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		
	}
}
