package OOPDOGS;

import java.util.Scanner;

public class DogApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String myLocalString;
//		writeLine(myLocalString); // fails, local variable not initialized
		
		String name = "my dog fido";
		
		Dog fido = new Dog();
		writeLine("My dog is " + fido);
        
		
  // doesn't know her name yet		
		writeLine("Her name is " +fido.name);
		
		fido.name = "Fido";
        writeLine("its name is " + fido.name);
        
        fido.numberOfLegs = 3;
        writeLine(fido.name + " has " +fido.numberOfLegs +"  Legs");
        
    // Fido runs away and ends up in a shelter for three-legged dogs
    // When Fido gets adopoted....
        
      fido.rename("Hope");  
      writeLine("Her name is " +fido.name);  
      
      writeLine("Telling her to speak");
      fido.speak();
      
      writeLine("Bark, Hope");
      fido.bark();
      
      Dog myOtherDog = new Dog();
      myOtherDog.name = "Krusty";
      
      writeLine("My other dog's name is "+ myOtherDog.name);
      
      myOtherDog.speak();
      
      writeLine("You come home. Your dogs act as if you've been gone for sooo long");
    
      Dog[] myDogs = {fido, myOtherDog};
      
      for(Dog currentDog: myDogs) { // could have done 
   	  //for(int index = 0; index < myDogs.length; index++)
    	  currentDog.speak();  
    	
      }// closing for FOR loop
      
	} // closing bracket for main
	
	
	public static void writeLine(String message) {
		System.out.println(message);
	
	} // closing bracket for public static void
	

} // closing bracket for class Dog 
