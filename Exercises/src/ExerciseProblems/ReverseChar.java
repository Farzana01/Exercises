package ExerciseProblems;

import java.util.ArrayList;

public class ReverseChar {

	public static void main(String[] args) {
		String input = "COLUMBUS";
		String reverse = "";

		char[] a = input.toCharArray();
		System.out.println(input);
		for (int i = a.length - 1; i >= 0; i--) {
			reverse = reverse + Character.toString(a[i]);
			System.out.println(reverse);

		}
		System.out.println("Prints this outside the loop:" + reverse);

	}

}
