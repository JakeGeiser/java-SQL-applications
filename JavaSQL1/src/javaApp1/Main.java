package javaApp1;
import java.util.*;

public class Main {
	// interact to get input 
	// call manager class
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String proceed0 = "yes";
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Features");
		System.out.println("=========");
		System.out.println("1. Search");
		System.out.println("2. Filter");
		System.out.println("3. Report");
		System.out.println("=========");
		
		DbManager manager = new DbManager();
		
		while(proceed0=="yes") {
			System.out.println("Select Feature(1,2,3): ");
			int feature = scan.nextInt();
			scan.nextLine();
			// use valid input checker
			if(manager.checkFeatureInput(feature) == false) {
				System.out.println("");
				continue;
			}
			// proceed to using feature
			if(feature==1) {
				
			}
			else if(feature==2) {
				
			}
			else if(feature==3) {
	
			}
		}
		
		
		
		
		
		
		scan.close();
	}

}


