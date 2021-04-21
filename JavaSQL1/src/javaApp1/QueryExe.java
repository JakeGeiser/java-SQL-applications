package javaApp1;
import java.util.*;
import java.sql.*;

public class QueryExe {
	// connect to DB and get statement from DbConnection
	DbConnector dbc = new DbConnector();
	Statement stmt = dbc.state(dbc.connect());
	
	
	// build SQL query
	// execute
	// parse the results
	
	
	List<Object[]> search() {
		
	}
	List<Object[]> filter() {
		
	}
	List<Object[]> report() {
		
	}
}
