package Arrays;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int secretNumber = 11;
		int guess;
		
		 do {
		System.out.println("Pick a number:");
		   guess = input.nextInt();
			 
		 if(guess== secretNumber) {
			
			 System.out.println("You guessed the right number!");
			 
		 } else {  
		      
			 System.out.println("Sorry, guess again.");
		 }
		 
				
		 } while (guess != secretNumber);

		 input.close();
	}
}

