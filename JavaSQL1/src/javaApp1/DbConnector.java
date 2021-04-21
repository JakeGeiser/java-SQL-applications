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
	public void showpword() {
		System.out.println(password);
	}
	
	// connect method
	private Connection con = null;
	public Connection connect() {
		try {
			System.out.println("Connecting...");
			this.con = DriverManager.getConnection(url,user,password);
			System.out.println("Connected");
			return this.con;
		}catch(SQLException e) {
			System.out.println("Issue connection to DB");
			return this.con;
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
	

}
