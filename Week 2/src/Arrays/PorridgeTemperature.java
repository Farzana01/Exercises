package Arrays;

import java.util.Scanner;

public class PorridgeTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String porridgeTemperature;
		do {
			System.out.println("Please specify porridge temperature.");
			System.out.println("Type\"help\" to list options.");
			porridgeTemperature = input.nextLine();
			if (porridgeTemperature.equals("help")) {
				System.out.println("Options: too hot, too cold, just right");
			}
			
			} while (porridgeTemperature.equals("help"));
		
		
		System.out.println("You chose " + porridgeTemperature);
		
		System.out.println("Do it with while:");
		
		porridgeTemperature = "help";
		while (porridgeTemperature.equals("help")) {
				System.out.println("Please specify porridge temperature.");
		        System.out.println("Type\"help\" to list options.");
		        porridgeTemperature = input.nextLine();
		        if (porridgeTemperature.equals("help")) {
		        	System.out.println("Options: too hot, too cold, just right");
		        }
		}
		
	}
}	
		
		
		
		
		
		
		
		



