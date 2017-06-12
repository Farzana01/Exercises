package OOPDOGS;

public class Dog {
	
	String name; // class dog has the attribute name. defaults to null because String is an object
	int numberOfLegs = 4;// setting a default  
    
	
// void is used so that rename doesn't argue back	
	void rename(String newName) {
	 // could have done this:
	 // name = newName;	
	  this.name = newName;
	
	} // closing bracket for rename method

	void speak () {
		bark();
	  // name is same as this.name	
		System.out.println("Hello, my name is " + name);
		
	} // closing bracket for speak

    void bark () {
    	System.out.println("Urrrrrf ");
    } // closing bracket for bark method	
    	
   

} // Closing bracket for class Dog
