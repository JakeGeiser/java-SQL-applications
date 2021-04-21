package javaApp1;
import java.util.*;

public class Main {
	// interact to get input 
	// call manager class
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean proceed0 = true;
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Features");
		System.out.println("=========");
		System.out.println("1. Search");
		System.out.println("2. Filter");
		System.out.println("3. Report");
		System.out.println("=========");
		
		DbManager manager = new DbManager();
		
		while(proceed0) {
			System.out.println("Select Feature(1,2,3): ");
			int feature = scan.nextInt();
			scan.nextLine();
			// use valid input checker
			if(manager.checkFeatureInput(feature) == false) {
				System.out.println("");
				continue;
			}
			// proceed to using feature
			while(feature == 1) {
			
				// get input
				System.out.println("Enter name(or what it starts with, ie. Susan, Su, or S): ");
				String nameIn = scan.nextLine();
				// use feature search
				ArrayList<Employee> employees = manager.featureSearch(nameIn);
				// print out employees
				System.out.println("");
				System.out.println("ID | Name (age) | Department | Role | Salary");
				for( Employee e : employees) {
					System.out.println(e.getID()+ " | "
										+ e.getName() + " ("
										+ e.getAge() + ") | "
										+ e.getDepartment() + " | "
										+ e.getRole() + " | "
										+ e.getSalary());
				}
				
				System.out.println("");
				System.out.println("Use feature 1 again? (yes/no): ");
				if (scan.nextLine().equals("yes")) {
					System.out.println("Using feature 1 again...");
					System.out.println("");
					continue;
				}
				else {
					System.out.println("Would you like to use a different feature?");
					if (scan.nextLine().equals("yes")) {
						System.out.println("================================");
						System.out.println("Enter Feature: ");
						feature = scan.nextInt();
						scan.nextLine();
					}
					else {
						proceed0 = false;
						break;
					}
				}
			
			}
			
			while(feature==2) {
				// get input
				System.out.println("Enter field: ");
				String fieldIn = scan.nextLine();
				System.out.println("Enter "+fieldIn+": ");
				String titleIn = scan.nextLine();
				// use feature search
				ArrayList<Employee> employees = manager.featureFilter(fieldIn, titleIn);
				// print out employees
				System.out.println("");
				System.out.println("ID | Name (age) | Department | Role | Salary");
				for( Employee e : employees) {
					System.out.println(e.getID()+ " | "
										+ e.getName() + " ("
										+ e.getAge() + ") | "
										+ e.getDepartment() + " | "
										+ e.getRole() + " | "
										+ e.getSalary());
				}
				
				System.out.println("");
				System.out.println("Use feature 2 again? (yes/no): ");
				if (scan.nextLine().equals("yes")) {
					System.out.println("Using feature 2 again...");
					System.out.println("============================");
					System.out.println("");
					continue;
				}
				else {
					System.out.println("Would you like to use a different feature?");
					if (scan.nextLine().equals("yes")) {
						System.out.println("================================");
						System.out.println("Enter Feature: ");
						feature = scan.nextInt();
						scan.nextLine();
					}
					else {
						proceed0 = false;
						break;
					}
				}
				
			}
			if(feature==3) {
				
				ArrayList<ArrayList<Object>> report = manager.featureReport();
				// print out employees
				System.out.println("");
				System.out.println("Department | Minimum | Average | Maximum | Montly Average");
				for( ArrayList<Object> row : report) {
					System.out.println(row.get(0)+ " | "
										+ row.get(1) + " | "
										+ row.get(2) + " | "
										+ row.get(3) + " | "
										+ row.get(4));
				}
				
				
				System.out.println("");
				System.out.println("Would you like to use a different feature?");
				if (scan.nextLine().equals("yes")) {
					
				}
				else {
					proceed0 = false;
					break;
				}
				
			}
			
			
		}
		
		
		
		
		
		
		scan.close();
	}

}


