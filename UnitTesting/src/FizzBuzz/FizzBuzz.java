package FizzBuzz;

public class FizzBuzz {
       int count = 0 ;
       public String say() {
    	   return say (1);
       }
/*public String say (int times) {
	count += times;
	if (count == 3) {
		return "Fizz";
	}
		return "" + count;
	}
	*/ //this is correct 
/*public String say(int times) {
	count += times;
	if (count % 3 == 0) {
		return "Fizz";
	}
*/ //this is correct 


public String say (int times) {
	count += times;
	
	if (count % 3 == 0 && count % 5 == 0);
       return "FizzBuzz";   
}
//	if (count == 15) {
	//	return"FizzBuzz";
//	}
	
	if (count % 3== 0) {
		return "Fizz";
	}
	if (count %5 == 0) {
		return "Buzz";
	}
      return "" + count;
}

 private boolean isBuzz() {
	 return count %5 == 0;
 }


