import java.util.Scanner;

public class GreaterOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Find the greater of the two value
		
		System.out.print("Enter first value:");
		Scanner input1 = new Scanner(System.in);
		int x = input1.nextInt();
		System.out.print("Enter second value:");
		Scanner input2 = new Scanner(System.in);
		int y = input2.nextInt();
		
		/*System.out.print("Enter third value:");
		Scanner input3 = new Scanner(System.in);
		int z = input3.nextInt();*/
		
		if (x > y )
			System.out.print("The larger value is: " + x);
		
		else if (y > x)
			System.out.print("The larger value is: " + y);
		
		else
			System.out.print("The numbers are equal");
		
		
		input1.close();
		input2.close();
		
	}

}

