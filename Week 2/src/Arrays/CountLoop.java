package Arrays;

public class CountLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1;
		while (count < 11) {
			System.out.println("The count is " +count);
			count++ ; //remember, this increases the value by 1
			
		}
		
		System.out.println("With do/while:");
		count = 1;
		do {
			System.out.println("The count is " +count);
			count++; //remember, this increases the value by 1
		
		} while (count < 11);
								
	}

}
