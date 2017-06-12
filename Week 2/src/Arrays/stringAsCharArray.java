package Arrays;

public class stringAsCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myName="Sue";
		char[] letters = myName.toCharArray();
		
		
		System.out.println("The first letter of my name is " +letters[0]);
		
		int lengthOfString = myName.length();
		
		int lastIndex = letters.length - 1;
		
		System.out.println("The last letter of the boy's name is " +letters[2]);
		
		
	}

}
