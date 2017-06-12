import java.util.Scanner;

public class AreTheyEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// compare if two numbers are equal

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number");

		// input first number
		int firstNumber = input.nextInt();

		// input second number
		// Scanner input2 = new Scanner(System.in);

		System.out.println("Enter your second number");

		int secondNumber = input.nextInt();

		if (firstNumber == secondNumber) {
			System.out.println(firstNumber + "is equal to" + secondNumber);

		} else {
			System.out.println(firstNumber  + " is not equal to" + secondNumber);
		}
   
		input.close();
	}

}
