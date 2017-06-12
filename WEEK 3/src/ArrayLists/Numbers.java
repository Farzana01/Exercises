package ArrayLists;

import java.util.ArrayList;

public class Numbers {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(42);
		numbers.add(23);
		numbers.add(89);
		 System.out.println(numbers);
	// to remove 23, we can assign it to an Integer (object) so that 
	//	it uses the remove(Object) method instead of the remove(int) method	
	//	the below is the same as Integer asInteger = new Integer(23);
	// java boxes this primitive for us (autoboxing).
		Integer asInteger = 23;
				numbers.remove(asInteger);
                System.out.println(numbers);
                
     // we can also find the index of a value, then remove that index
                int index = numbers.indexOf(42);
                numbers.remove(index);
                System.out.println(numbers);
                
                
                ArrayList<Integer> answers = new ArrayList<Integer>();
                int ultimateAnswer = 42;
                answers.add(ultimateAnswer);
                answers.add(86);

                System.out.println("The answers are: " + answers);

                Integer asIntegerObject = ultimateAnswer;
                System.out.println("The ultimate answer is " + asIntegerObject);
		
		
	}

}