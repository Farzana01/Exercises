package Arrays;

import java.util.Scanner;

public class PrintNameAgainAndAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		String message = input.nextLine();
		
		int count = 1;
		while (count <= 5) {
			count++ ;
			System.out.println(message);	
			 
		}
	input.close();	
	}

}
