package Arrays;

import java.util.Random;
import java.util.Scanner;


public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
		
		Random generator = new Random();
				int secretNumber = generator.nextInt(100) + 1;
					
		System.out.println("The secret number is " + secretNumber);
		System.out.println("Pick a number from 1 to 100:");
			
		int guess;
			
		do {
		
			guess = input.nextInt();
			
			if (guess == secretNumber) {
					
					 System.out.println("You guessed the right number!");
					 
				 } else {  
				      
					 System.out.println("Sorry, guess again.");
				 }
				 
						
	             }  while (guess != secretNumber);
				 
	             input.close();
				 

	}
		
}


	

	
	


