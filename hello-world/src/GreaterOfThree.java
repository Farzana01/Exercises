import java.util.Scanner;

public class GreaterOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find the largest of the three value
		
				System.out.print("Enter first value:");
				Scanner input1 = new Scanner(System.in);
				int x = input1.nextInt();
				System.out.print("Enter second value:");
				Scanner input2 = new Scanner(System.in);
				int y = input2.nextInt();
				
				System.out.print("Enter third value:");
				Scanner input3 = new Scanner(System.in);
				int z = input3.nextInt();
				
				if (x >= y && x >= z )
					System.out.print("The largest value is: " + x);
				
				else if (y >= x && y >= z)
					System.out.print("The largest value is: " + y);
				
				else if (z >= x && z >= y)
					System.out.print("The largest value is: " + z);
				
						
				input1.close();
				input2.close();
				input3.close();
			}

	

}
