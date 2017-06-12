import java.util.Scanner;

public class FirstNameLastName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input = new Scanner(System.in);
		System.out.println("Please type your First Name");
			String first = input.next();
			int firstlength = 0;
			firstlength = first.length();
				
		System.out.println("Please type your Last Name");
			String last = input.next();
			int lastlength = 0;
			lastlength = last.length();
			
	  	    if (firstlength > lastlength)
		System.out.println("Your first name is longer than your last name.");
		
		else if (firstlength < lastlength)
		System.out.println("Your last name is longer than your first name.");
		
		else
		System.out.println("Your first name is the same length as your last name.");	
			input.close();
	}
	


	
}
