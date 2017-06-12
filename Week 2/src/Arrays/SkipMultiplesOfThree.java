package Arrays;

public class SkipMultiplesOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		for(int count = 1; count <= 10; count++) {
			  if(count % 3 == 0) { // it's a multiple of three
			  //  continue;
			  break;
			  	  
			  }
			  
			  System.out.println("Count is " + count);
			} // end of for loop
		
		System.out.println("I am tired of counting.");
	}

}
