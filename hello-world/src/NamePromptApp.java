import java.util.Scanner;

public class NamePromptApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);

			System.out.println("What is your name?");
			String name = input.nextLine();
			System.out.println("Hello, " + name);

			input.close();
	}

}
