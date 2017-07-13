package ExerciseProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class HighestLowestWithIfLoop {

	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		
			
		if ((a>=b)&&(a>=c)&&(a>=d)&&(a>=e)){
			 System.out.println ("The largest number is : " +a);
		} else if ((b>=c)&& (b>=d)&&(b>=e)) {
			System.out.println ("The largest number is : " +b);
		} else if ((c>=d)&& (c>=e)) {
			System.out.println ("The largest number is : " +c);
		} else if ((d>=e)) {
			System.out.println ("The largest number is : " +d);
		} else {
			System.out.println ("The largest number is : " +e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}	

			