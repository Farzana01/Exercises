package CalulatorApp;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 Calculator myCalc = new Calculator();
		 updateDisplay(0);
		 
		 int newDisplayValue = myCalc.pushNumbers(42);
		 updateDisplay(newDisplayValue);

	      myCalc.pushAdd();
	      
	      newDisplayValue = myCalc.pushNumbers(44);
	      updateDisplay(newDisplayValue);
	      
	      newDisplayValue = myCalc.pushEquals();
	      updateDisplay(newDisplayValue);
	      
	      myCalc.pushMinus();
	      
	      newDisplayValue = myCalc.pushNumbers(63);
	      updateDisplay(newDisplayValue);
	      
	      newDisplayValue = myCalc.pushEquals();
	      updateDisplay(newDisplayValue);
	      
	      myCalc.pushMinus();
	       
	      newDisplayValue = myCalc.pushNumbers(7);
	      updateDisplay(newDisplayValue);
	      
	      newDisplayValue = myCalc.pushEquals();
	      updateDisplay(newDisplayValue);
	      
	} // Closing for main

	public static void updateDisplay(int value) {
      System.out.println(value);

	} // closing for updateDisplay
} // closing for CalculatorApp