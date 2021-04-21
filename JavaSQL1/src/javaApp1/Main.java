package javaApp1;

public class Main {
	// interact to get input 
	// call manager class
	public static void main(String[] args) {
		DbConnector dbc = new DbConnector();
		System.out.println(dbc.showpword());

//		try {
//			
//			ResultSet rs = stmt.executeQuery("SELECT name, age FROM employee");
//			while(rs.next()) {
//				String name = rs.getString(1);
//				int age = rs.getInt(2);
//				System.out.println(name + " | "+age);
//			}
//			
//			
//			// deal with results
//			
//			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				con.close();
//			} catch (SQLException e) {
//				// ignored
//			}
//		}
//		
//		// query 
//		
//		// deal with results

	}

}


