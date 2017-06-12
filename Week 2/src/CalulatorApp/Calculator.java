package CalulatorApp;

public class Calculator {
 
	int currentNumber;
	int previousNumber;
	char operation;
	
	int pushNumbers(int number) {
		previousNumber = currentNumber;
		currentNumber = number;
		return currentNumber;
	
 } // closing for pushNumbers 
	 
	void pushAdd() {
         
		operation = '+';
		
  }// closing for pushAdd
	
    int pushEquals() {
    
    	if (operation == '+') {
    		currentNumber = currentNumber + previousNumber;
    	} // closing if loop	
    	else {
    	 currentNumber = previousNumber - currentNumber;	
    		
    	} //closing for else	
    	
    	return currentNumber;
    	
   } // closing for pushEquals
    
    void pushMinus() {
    	 
    	operation = '-';
    	
    } // closing for pushMinus	
    
 } // closing for class Calculator

