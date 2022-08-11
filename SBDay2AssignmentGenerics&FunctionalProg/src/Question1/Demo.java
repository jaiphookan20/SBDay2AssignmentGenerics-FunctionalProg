package Question1;

public class Demo {

	public Demo(String string) {
		System.out.println(string);
	}

	public static void main(String[] args) {
		
		/* Generic Class/object of type String */
		Generic<String> genericObj = new Generic<>();
		genericObj.add("Hello, adding a string element into the Generic Class Obj");
		System.out.println(genericObj.get());
		
		/* Generic Class/object of type Integer */
		Generic<Integer> genericObj2 = new Generic<>();
		genericObj2.add(69);
		System.out.println(genericObj2.get());
		
		/* Generic Class/object of type Demo Class */
		Generic<Demo> demoObjGeneric = new Generic<>();
		demoObjGeneric.add(new Demo("Entered 69 again, in the Demo Class Object"));
		
		

	}

}

/* 
Output: 	
Hello, adding a string element into the Generic Class Obj
69
Entered 69 again, in the Demo Class Object
 */



/* 
Question 1:
Create your own Generic Class and use a Demo class to implement it. (Refer Notes
for clarification)
*/
