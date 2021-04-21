package javaApp1;
import java.util.*;
import java.sql.*;

public class QueryExe {
	// connect to DB and get statement from DbConnection
	private DbConnector dbc = new DbConnector();
	private Statement stmt = dbc.state(dbc.connect());
	
	
	// build SQL query
	// execute
	// parse the results
	
	// add search query method
	public ArrayList<Object[]> search(String input) {
		try {
			ResultSet rs = stmt.executeQuery("SELECT id, name, age, department, role, salary FROM employee Where name LIKE'"+input+"%'");
			ArrayList<Object[]> query = new ArrayList<Object[]>(); 
			ArrayList<Object> lineQ = new ArrayList<Object>();
			while(rs.next()) {
				lineQ.add(rs.getInt(1));
				lineQ.add(rs.getString(2));
				lineQ.add(rs.getInt(3));
				lineQ.add(rs.getString(4));
				lineQ.add(rs.getString(5));
				lineQ.add(rs.getInt(6));
				ArrayList.add(lineQ);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// add filter query method
	List<Object[]> filter() {
		
	}
	
	// add report query method
	List<Object[]> report() {
		
	}
}


//while(rs.next()) {
//	int id = rs.getInt(1);
//	String name = rs.getString(2);
//	int age = rs.getInt(3);
//	String dept = rs.getString(4);
//	String role = rs.getString(5);
//	int salary = rs.getInt(6);
//	ArrayList.add(rs);
//}