package javaApp1;
import java.util.*;

public class DbManager {
	// validate input to method, throw error
	// determines what query to execute
	// call QueryExecute
	// build result from results of QueryExe
	public static void main(String[] args) {
		
	}
	QueryExe query = new QueryExe();
	
	public ArrayList<Employee> featureSearch(String name){
		ArrayList<Employee> managerResult = new ArrayList<Employee>();
		
		try {
			ArrayList<ArrayList<Object>> queryResult = query.search(name);
			
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
		} catch (NumberFormatException e) {
			System.out.println("Check input if valid");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return managerResult;
		}
	}
	
	public ArrayList<Employee> featureFilter(String field, String title){
		ArrayList<Employee> managerResult = new ArrayList<Employee>();
		
		ArrayList<ArrayList<Object>> queryResult = query.filter(field, title);

		try {
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
		} catch (NumberFormatException e) {
			System.out.println("Check input if valid");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return managerResult;
		}
	}

	public ArrayList<ArrayList<Object>> featureReport(){
		return query.report();
	}
	
	public boolean checkFeatureInput(int input) {
		if (input == 1 || input == 2 || input ==3) {
			return true;
		}
		else {
			System.out.println("Ensure feature selection is either 1, 2, or 3");
			return false;
		}
	}
	
	public void disconnect() {
		DbConnector dbc = new DbConnector();
		dbc.disconnect();
	}
	
}

