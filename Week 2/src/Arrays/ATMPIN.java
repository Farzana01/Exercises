package Arrays;

import java.util.Scanner;

public class ATMPIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner (System.in); 
   // String setPin = "1234"; 	
	int setPin = 1234;	

	//String guess;
	int guess = 1;
	
	do {
		
		System.out.println("Enter your four digit PIN number:");
		int pin = input.nextInt();
		 if(setPin == pin) {
			 
			 System.out.println("You guessed the right number!");
			 System.exit(0);
			 
		 } else {  
		     
			 if (guess == 3){
				 
				 System.out.println("Sorry, You've guessed incorrect pin 3 times. Return after 5 minutes.");
				 System.exit(0);
			 }
			 
			 System.out.println("Sorry, guess again.You will be allowed 3 attempts.");
			 
			 guess = guess + 1; // or guess = guess++
			 
			 
		 } 
		 
// guess ==user Pin would be comparing references, not values				
	} while (guess < 4); //while(!guess.equals(userPin));
		
	input.close();
	
	}
}