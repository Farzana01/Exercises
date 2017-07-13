package ExerciseProblems;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
	System.out.println("Hello");
	System.out.println("Please enter your name");
	Scanner input = new Scanner(System.in);
	String name = input.nextLine();
	System.out.println("Hello "+name);
	
	}

}
