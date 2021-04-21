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
	public ArrayList<ArrayList<Object>> search(String input) {
		ArrayList<ArrayList<Object>> query = new ArrayList<ArrayList<Object>>(); 
		try {
			
			ResultSet rs = stmt.executeQuery("SELECT id, name, age, department, role, salary FROM employee Where name LIKE'"+input+"%'");
			while(rs.next()) {
				ArrayList<Object> lineQ = new ArrayList<Object>();
				lineQ.add(rs.getInt(1));
				lineQ.add(rs.getString(2));
				lineQ.add(rs.getInt(3));
				lineQ.add(rs.getString(4));
				lineQ.add(rs.getString(5));
				lineQ.add(rs.getInt(6));
				query.add(lineQ);
			}
			return query;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return query;
		}
	}
	
	// add filter query method
	public ArrayList<ArrayList<Object>> filter(String field, String title) {
		ArrayList<ArrayList<Object>> query = new ArrayList<ArrayList<Object>>();
		try {
			ResultSet rs = stmt.executeQuery("SELECT id, name, age, department, role, salary FROM employee Where "+field+" = "+title);
			while(rs.next()) {
				ArrayList<Object> lineQ = new ArrayList<Object>();
				lineQ.add(rs.getInt(1));
				lineQ.add(rs.getString(2));
				lineQ.add(rs.getInt(3));
				lineQ.add(rs.getString(4));
				lineQ.add(rs.getString(5));
				lineQ.add(rs.getInt(6));
				query.add(lineQ);
			}
			return query;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return query;
		}
	}
	
	// add report query method
	public ArrayList<ArrayList<Object>> report() {
		ArrayList<ArrayList<Object>> query = new ArrayList<ArrayList<Object>>();
		try {
			
			ResultSet rs = stmt.executeQuery("SELECT department, MIN(salary), CEIL(AVG(salary)), MAX(salary), CEIL((AVG(salary/12))) FROM employee GROUP BY department");
			while(rs.next()) {
				ArrayList<Object> lineQ = new ArrayList<Object>();
				lineQ.add(rs.getString(1));
				lineQ.add(rs.getInt(2));
				lineQ.add(rs.getInt(3));
				lineQ.add(rs.getInt(4));
				lineQ.add(rs.getInt(5));
				query.add(lineQ);
			}
			return query;
		} catch (SQLException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
			return query;
		}
	}
}

