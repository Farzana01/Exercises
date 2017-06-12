
import java.util.Scanner;

public class ConsonantOrVowel 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Figure out whether a letter is consonant or vowel
		
		System.out.println("Enter an alphabet:");
		
			Scanner input = new Scanner(System.in);
		
		char val = input.next().charAt(0);
					
		switch (val) {
		 case 'a': 
			 System.out.println("This is a vowel");
			 break;
		
		 case 'A': 
			 System.out.println("This is a vowel");
			 break;
		
		 case 'e': 
			 System.out.println("This is a vowel");
			 break;
			 
		 case 'E': 
			 System.out.println("This is a vowel");
			 break;
			 
		 case 'i': 
			 System.out.println("This is a vowel");
			 break;
			 
		 case 'I': 
			 System.out.println("This is a vowel");
			 break;
			 
		 case 'o': 
			 System.out.println("This is a vowel");
			 break;
			 
		 case 'O': 
			 System.out.println("This is a vowel");
			 break;
			 
		 case 'u': 
			 System.out.println("This is a vowel");
			 break;
			 
		 case 'U': 
			 System.out.println("This is a vowel");
			 break;	 
			 
		 default: 
			 System.out.println("This is a consonant");
			 break;	 
		}
		
	input.close();
	
		
	
	}

}
