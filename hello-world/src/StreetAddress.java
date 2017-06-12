import java.util.Scanner;

public class StreetAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Enter home address
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter street address:");
		
		int houseNumber = input.nextInt();
		String street = input.next();
		String street2 = input.nextLine();
		
		System.out.println("house number is " + houseNumber);
		System.out.println("street is " + street +" " + street2);

	}

}
