package Arrays;

import java.util.Scanner;

public class FavoriteColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Scanner input = new Scanner(System.in);
      
		while(true) {
			  System.out.println("What is your favorite color?"); 
			  String favoriteColor = input.next();

			  if(favoriteColor.equals("Blue. No yel-- Auuuuuuuugh!")) {
			    System.out.println("You're just making Monty Python references.");
			    System.out.println("Get out!");
			  //  break;
			  }
                break;
			
         //       System.out.println("Your favorite color is " + favoriteColor);
			}
		
		System.out.println("Done looping");
	}

}
