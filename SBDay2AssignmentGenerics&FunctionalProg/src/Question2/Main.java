package Question2;

import java.util.ArrayList;
import java.util.List;

/* We do not need to do "implements" when dealing with a functional interface*/
public class Main {

	public static void main(String[] args) {
		
		List<String> city = new ArrayList<>();
		city.add("New York City");
		city.add("Buenos Aires");
		city.add("Madrid");
		city.add("Bombay");
		city.add("Monterrey");
		city.add("Sao Paolo");
		
		
		/* Lambda Expression */
		PrintList interfaceObj = (x) -> {
			
			for(String cities:x){
	            System.out.println(cities);
	        }
		};
		
		/* Calling the method in main method*/
		interfaceObj.display(city);		
	}


}

/* 

Outputs: 
New York City
Buenos Aires
Madrid
Bombay
Monterrey
Sao Paolo
/* 

Question 2:
Create a List of city in the Main class and print them using Lambda Expression.
Interface PrintList {
abstract void display(List<String> city);
}
Note: Use the above interface to solve the question


*/