package Nulls;

public class Nulls {

	String instanceVariable;// gets the value null
	
	void myMethod() {
		String localVariable;
// need to initialize before we use it		
		localVariable = "foo";
		System.out.println(localVariable);
		System.out.println("instance variable is " +instanceVariable);
		System.out.println("is instance variable null? " +instanceVariable == null);
		
		if(instanceVariable != null) {
			System.out.println("not null!");
		} else {
			System.out.println("null's toString method returns" +instanceVariable.toString()); 
			
		}
		
		
		
		
		System.out.println("null's toString() method returns " +instanceVariable.toString());
			
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
