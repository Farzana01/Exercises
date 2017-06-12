package Arrays;

import java.util.Scanner;

public class AddInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int x = 1;
		int y = 0;
		int z = 0;
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter an integer number:");
		int num = input.nextInt();
		
		
		int[] numArray = new int[num];
		
		
		
		while ( z <= num -1 ){
			numArray[z] = x;
			y = y + numArray[z];
			z = z + 1;
			x = x + 1;
		    
		}
		
		String result = Integer.toString(y);
		result = result + " (";
		
		for (int a = 0; a < numArray.length; a++){
			if ((numArray.length-1) == a)
			result = result + numArray[a];
			else
				result = result + numArray[a] + " + ";
		}
		
		result = result + ")";
	    
		
		
		System.out.print(result);
		
		
		input.close();
	}
	
}
