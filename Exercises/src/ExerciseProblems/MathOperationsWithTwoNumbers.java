package ExerciseProblems;

import java.util.Scanner;

public class MathOperationsWithTwoNumbers {

	public static void main(String[] args) {
// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
/*Test Data:
		Input first number: 125
		Input second number: 24
		Expected Output :
		125 + 24 = 149
		125 - 24 = 101
		125 x 24 = 3000
		125 / 24 = 5
		125 mod 24 = 5		
*/
		
		System.out.println("Please input your first number : ");
		Scanner input1 = new Scanner(System.in);
		int a = input1.nextInt();
		System.out.println("Please input your second number : ");
		Scanner input2  = new Scanner(System.in);
		int b = input2.nextInt();
		
		System.out.println("The sum of " +a +" and " +b +" : " +(a+b));
		System.out.println("The difference between " +a +" and " +b +" : " +(a-b));
		System.out.println("The product of " +a +" and " +b +" : " +(a*b));
		System.out.println("The quotient of " +a +" and " +b +" : " +(a/b));
		System.out.println("The mod of " +a + " and " +b +" : " +(a%b));
		
	}

}
