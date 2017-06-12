package Constructors;

public class ConstructorPet {
 
	String name;
	int hunger;
	
	public ConstructorPet(String newName) {
	
	     name = newName;
	     hunger = 50;
	     
	}     
	public ConstructorPet(String newName, int initialHunger) {
	    		     
		name = newName;
	     hunger = initialHunger;
	     	     
}	
	
 @Override	     

	public String toString(){
	 System.out.println();
	 return "Pet named "+ name + ". Hunger level is " + hunger;
 
 }
	
	
}
