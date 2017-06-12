package Arrays;

import java.util.Scanner;

public class LastNameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("What is your lastname?");
		   String lastName = input.next();
		   
		   char[] letters = lastName.toCharArray();

				   
		//System.out.println("There are " + lastName.length() + " letters in your lastname.");
		System.out.println("There are " + letters.length + " letters in your lastname.");
		
		/*
		String[] lName = new String[lastName.length()];
		
		int z = 0;
		//int y = 1;
		
		while (z < lastName.length()){
			//lName[z] = lastName.substring(z);
			System.out.println(lastName.substring(z, 1));
			z = z + 1;
			
		}*/
		
	}

}
