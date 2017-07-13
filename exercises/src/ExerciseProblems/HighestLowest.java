package ExerciseProblems;

import java.util.Scanner;

public class HighestLowest {

	public static void main(String[] args) {
		
	 System.out.println("Enter your first number : ");
      Scanner input = new Scanner(System.in);
      int a = input.nextInt();
 	  
 	 System.out.println("Enter your second number : "); 
 	  int b = input.nextInt();
 	  
 	  if (a > b) {
 		  
 		 System.out.println(a +" is the higher number.");
 		 
 	  } else 
 		 System.out.println(b +" is the higher number.");
 		 
 	 	  
 	  }
	  
  
	}

