package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class Stretch {

	public static void main(String[] args) {


// (Stretch: create a method so that you don�t need to duplicate this work.)

// Create a list with the following numbers: 1, 23, 9, 77, 922, 6, 32, 63, 14, 5		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(1);
		numberList.add(23);
		numberList.add(9);
		numberList.add(77);
		numberList.add(922);
		numberList.add(6);
		numberList.add(32);
		numberList.add(63);
		numberList.add(14);
		numberList.add(5);
				
	 System.out.println("The numbers in the numberslist are " +numberList);
	
// determine whether each of the following values is an element in the list: 23, 77, 15		
	 ArrayList<Integer> myList = new ArrayList<Integer>();
		 myList.add(23);
		 myList.add(77);
		 myList.add(15);
		 
      System.out.println("The numbers in my list are " +myList);
		
      int[] matches = new int[numberList.size()];

      int i = 0;
      for (Integer s : numberList)
          matches[i++] = myList.contains(s) ? 1 : 0;

      System.out.println(Arrays.toString(matches));
  
      
  //    remove the following elements: 27, 922, 32, 6
	ArrayList<Integer> remList = new ArrayList<Integer>();
		  remList.add(27);
		  remList.add(922);
		  remList.add(32);
		  remList.add(6);
		
		  System.out.println("The numbers to be removed from the list are " +remList);
			  
		  numberList.remove(Integer.valueOf(922)); 
		  numberList.remove(Integer.valueOf(32)); 
		  numberList.remove(Integer.valueOf(6)); 
		  
	
// Again determine whether each of the following values is an element in the 
// list: 23, 77, 15 		  
		  
	      System.out.println("The numbers left in my list now are " +numberList);
	      System.out.println("The numbers to be compared are " +myList);
	      
	      

	     
	     
	}
	      
	      
	      
}





	

		 
		          
		        
		

		            
		        
		        
		
	    
	    