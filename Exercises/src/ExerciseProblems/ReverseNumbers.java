package ExerciseProblems;

public class ReverseNumbers {

	public static void main(String[] args) {
		int input = 123;
		// variable to hold reverse of input
		int reverse;
		// variable to hold integer value in a string - converting integer to string
		String inputStr;
		// variable to hold reverse of inputStr
		String reverseNumString = null;

		System.out.println(input);

		inputStr = Integer.toString(input);

		char[] num = inputStr.toCharArray();
		// this for loop starts from the last index and loops through the first index
		for (int i = num.length - 1; i >= 0; i--) {
			// concatenating reverseNumString to add on to string
			reverseNumString = reverseNumString + Character.toString(num[i]);

		}
		reverse = Integer.parseInt(reverseNumString);
		System.out.print(reverse);

	}

}
