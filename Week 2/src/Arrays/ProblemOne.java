package Arrays;

import java.util.Scanner;

public class ProblemOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//part b
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("What is your first peer's name?");		
		String first = input.next();
		
		System.out.println("What is your second peer's name?");	
		String second = input.next();
		      
		System.out.println("What is your third peer's name?");	
		        String third = input.next();
		       
	    System.out.println("What is your fourth peer's name?");	
		        String fourth = input.next();
		       
		 		       char[] name1 = first.toCharArray();
		               char[] name2 = second.toCharArray();
		               char[] name3 = third.toCharArray();
		               char[] name4 = fourth.toCharArray();
				       
System.out.println("The first letters of my peers are "+ name1[0] + name2[0] + name3[0] + name4[0]); 		       
		       
		       
	}

}
