import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if the number is positive or negative
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int c = input.nextInt();
		
		if (c > 0) 
		{
			System.out.println("this is a positive number");
		
	    }
		
		if (c < 0) 
		{
	
	        System.out.println("this is a negative number");
	
	} 	
		else if ( c == 0)
			
	{
			System.out.println("The number " + c + " is neither positive or negative");
	
			}
		}
	}
    	


