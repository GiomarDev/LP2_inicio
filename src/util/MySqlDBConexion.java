package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDBConexion {
	static{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConexion(){
		Connection con=null;
		try {
			
		    con = DriverManager.getConnection("jdbc:mysql://node225989-env-4646598.j.layershift.co.uk/sedenorte?serverTimezone=CST","root","MITtez11643");           
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
		
}