import java.util.Scanner;

public class FullName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please type your First Name");
			String first = input.next();
			
		System.out.println("Please type your Last Name");
			String last = input.next();
			
		   	input.close();		
		
		System.out.println("Your full name is " +first +" " +last);
		
		
		
		
		
		
	}
	
	
	

}
