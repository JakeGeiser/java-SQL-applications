package javaApp1;
import java.sql.*;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;

public class DbConnector {
	// configure connection credentials
	private String url = "jdbc:postgresql://localhost:5432/postgres";
	private String user = "postgres";
	private Config config = new Config(); // pull password from other file
	private String password = config.password();
	
	
	// connect method
	private static Connection con;
	public Connection connect() {
		try {
			System.out.println("Connecting...");
//			System.out.println(url);
//			System.out.println(user);
//			System.out.println(password);
			con = DriverManager.getConnection(url,user,password);
			System.out.println("Connected");
			return con;
		}catch(SQLException e) {
			System.out.println("Issue connecting to DB");
			return con;
		}
	}
	
	// make statement
	private Statement stmt = null;
	public Statement state(Connection C) {
		try {
			this.stmt = C.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.stmt;
	}
	
	// disconnect method
	public void disconnect() {
		if (con != null) {
	        try {
	            con.close();
	        } catch (SQLException e) { /* Ignored */}
	    }
	}

}
