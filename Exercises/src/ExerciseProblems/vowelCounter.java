package ExerciseProblems;

import java.util.Scanner;

public class vowelCounter {
	public static void main(String[] args) {

//ask user to input some text
		System.out.println("Enter some text here: ");
//take user input thru scanner
		Scanner reader = new Scanner (System.in);
//user input will be string, therefore it will be saved into String variable 'input'- in the current line
		String input = reader.nextLine();
//the vowel letters will be looked for by iteration 
		char[] letters = input.toCharArray();
//declaring count to count the total number of vowel in a string
		int count = 0;
		for (char c:letters) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			count++;
			
			break;
			default:
			}
		}
			System.out.println("The total number of vowels in the string [ " + input + "] is " + count);
		}
		
		
		
		
	}
	
	