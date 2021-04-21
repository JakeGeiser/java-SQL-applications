package javaApp1;

public class Employee {
	// https://www.tutorialspoint.com/java/java_encapsulation.htm
	 private int id;
	 private String name;
	 private String department;
	 private String role;
	 private int salary;
	 
	 // declare getVariable methods
	 public int getID() {
		 return id;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public String getDepartment() {
		 return department;
	 }
	 
	 public String getRole() {
		 return role;
	 }
	 
	 public int getSalary() {
		 return salary;
	 }
	 
	 // declare setVariable methods
	 public void setID(int newID) {
		 id = newID;
	 }
	 
	 public void setName(String newName) {
		name = newName;
	 }
	 
	 public void setDepartment(String newDept) {
		 department = newDept;
	 }
	 
	 public void setRole(String newRole) {
		 role = newRole;
	 }
	 
	 public void setSalary(int newSalary) {
		 salary = newSalary;
	 }
	 
}
