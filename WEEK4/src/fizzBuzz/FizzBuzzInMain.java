package fizzBuzz;

public class FizzBuzzInMain {

	public static void main(String[] args) {

		int countUpTo = 20;

		for (int count = 1; count <= countUpTo; count++) {

			String say = "" + count; // default to count

			if (count % 3 == 0 && count % 5 == 0) {
				say = "FizzBuzz";//

			} else if (count % 3 == 0) {

				say = "Fizz";//
			} else if (count % 5 == 0) {
			say = "Buzz";
			}

			System.out.println(say);
		}

	}

	public static boolean isFizz(int number) {
		return number % 3 == 0;
	}

	public static boolean isBuzz(int number) {
		return number % 5 == 0;

	}

}