package javaApp1;
import java.util.*;

public class DbManager {
	// validate input to method, throw error
	// determines what query to execute
	// call QueryExecute
	// build result from results of QueryExecute
	QueryExe query = new QueryExe();
	
	public ArrayList<Employee> featureSearch(String name){
		ArrayList<ArrayList<Object>> queryResult = query.search(name);
		ArrayList<Employee> managerResult = new ArrayList<Employee>();
		
		for (ArrayList<Object> row : queryResult) {
			// declare a temporary employee object to be added to list
			Employee tempName = new Employee();
			tempName.setID(Integer.parseInt(row.get(0).toString()));
			tempName.setName(row.get(1).toString());
			tempName.setAge(Integer.parseInt(row.get(2).toString()));
			tempName.setDepartment(row.get(3).toString());
			tempName.setRole(row.get(4).toString());
			tempName.setSalary(Integer.parseInt(row.get(5).toString()));
			managerResult.add(tempName);
		}
		return managerResult;
	}
	
	public ArrayList<Employee> featureFilter(String field, String title){
		ArrayList<ArrayList<Object>> queryResult = query.filter(field, title);
		ArrayList<Employee> managerResult = new ArrayList<Employee>();
		
		for (ArrayList<Object> row : queryResult) {
			// declare a temporary employee object to be added to list
			Employee tempName = new Employee();
			tempName.setID(Integer.parseInt(row.get(0).toString()));
			tempName.setName(row.get(1).toString());
			tempName.setAge(Integer.parseInt(row.get(2).toString()));
			tempName.setDepartment(row.get(3).toString());
			tempName.setRole(row.get(4).toString());
			tempName.setSalary(Integer.parseInt(row.get(5).toString()));
			managerResult.add(tempName);
		}
		return managerResult;
	}

	public ArrayList<Employee> featureReport(){
		
	}
	
}
