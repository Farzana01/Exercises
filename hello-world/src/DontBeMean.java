
import java.util.Scanner;

public class DontBeMean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// calculate the mean of four integers and display the result
		
// declare variable 
		
		float total = 0;
		float mean = 0;
			
		System.out.print("Enter first value:");
		Scanner input1 = new Scanner(System.in);
		float a = input1.nextFloat();
		System.out.print("Enter second value:");
		Scanner input2 = new Scanner(System.in);
		float b = input2.nextFloat();
		System.out.print("Enter third value:");
		Scanner input3 = new Scanner(System.in);
		float c = input3.nextFloat();
		System.out.print("Enter fourth value:");
		Scanner input4 = new Scanner(System.in);
		float d = input4.nextFloat();
		
		
		total = a + b + c + d;
		System.out.print("The total is: "); 
		System.out.printf("%.2f", total);
		System.out.println("");
		
		mean = total/4;
				
		System.out.print("The mean value is: ");
		System.out.printf("%.2f", mean);

		input1.close();
		input2.close();
		input3.close();
		input4.close();
	}

}
