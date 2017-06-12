import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ask the users to enter a number and figure out if it is an odd or even number
		
		Scanner input = new Scanner(System.in);
			System.out.println("Enter your number");
			
// input your number
			
			int X = input.nextInt();		
			
	if (X % 2 == 1) {
		System.out.println("Your number is odd");
	
	} else {
		System.out.println("Your number is even");
	}
		input.close();
	
	}

}
