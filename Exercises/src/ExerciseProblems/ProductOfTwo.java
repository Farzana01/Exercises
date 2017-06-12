package ExerciseProblems;

import java.util.Scanner;

public class ProductOfTwo {

	public static void main(String[] args) {
/*
 * 	Write a Java program that takes two numbers as input and display the product of two numbers.
 * 
 * 
 */
      System.out.println("Please input two numbers: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int product = a*b;
	  System.out.println("The produc of these numbers are :" +product);	
		
		
	}

}
