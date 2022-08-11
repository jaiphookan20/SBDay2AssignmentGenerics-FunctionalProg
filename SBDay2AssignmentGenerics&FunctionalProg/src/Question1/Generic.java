package Question1;

public class Generic<T> {
		
	T obj;
	
	/* Add Generic Object of any Type */
	void add(T obj) {
		this.obj = obj;
	}
	
	/* Return obj of type T */
	T get() {
		return obj;
	}
	
	
}



/* 
	Question 1:
	Create your own Generic Class and use a Demo class to implement it. (Refer Notes
	for clarification)
*/
 