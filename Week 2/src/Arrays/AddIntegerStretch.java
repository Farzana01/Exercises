package Arrays;

import java.util.Scanner;

public class AddIntegerStretch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y = 0;
		int z = 0;
		
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Enter an low integer number:");
		int low = input.nextInt();
		   
		System.out.println("Enter an high integer number:");
		int high = input.nextInt();
		
		int diff = high - low;
		
		if (diff <= 0){
			System.out.println("You've entered invalid high & low number:");
			System.exit(0);
		}
		
		int[] numArray = new int[diff+1];
			
		int x = low; // Set the starting point as the low value
		
		
		// Loop through low to high range and store the values in the array
		while ( z <= numArray.length-1 ){  
			numArray[z] = x;
			y = y + numArray[z];
			z = z + 1;
			x = x + 1;
		    
		}
		
		//Built the container string with the total amount
		String result = Integer.toString(y);
		result = result + " ("; // add the parenthesis to the container string
		
		
		// build out the container string from the array values
		for (int a = 0; a < numArray.length; a++){
			if ((numArray.length-1) == a) // Do not add the + sign for the last value
			result = result + numArray[a];
			else
				result = result + numArray[a] + " + ";
		}
		
		result = result + ")"; // add the parenthesis to the container string
	    
		
		//Print the container string
		System.out.print(result);
		
		
		input.close();

	}

}
