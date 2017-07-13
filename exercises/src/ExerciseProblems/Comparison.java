package ExerciseProblems;

public class Comparison {

	public static void main(String[] args) {
		String txt = "Fantastic";
		String lang = "Java";
		boolean state = (txt == lang);
		System.out.println("String equality test: " +state);
		
		state = (txt !=lang);
		System.out.println("String equality test: " +state);
		
		int dozen = 12;
		int score = 20;
		state = (dozen > score);
		System.out.println("Greater than test: " +state);
		
		state = (dozen < score);
		System.out.println("String equality test: " +state);
	}

}
