package ArrayLists;

import java.util.ArrayList;

public class BooleanLoop {

	public static void main(String[] args) {
		
//Create a list that contains the following boolean values: true, false, false, true, false. 
// Loop through your list. Based on the value of each element, print a message:
  // true: �Better bring an umbrella�
	//false: �No rain today, enjoy the sun!�		
		
		
		ArrayList<Boolean> weatherList = new ArrayList<Boolean>();
		weatherList.add(true);
		weatherList.add(false);
		weatherList.add(false);
		weatherList.add(true);
		weatherList.add(false);
		System.out.println(weatherList);

	
		for (Boolean check : weatherList) {
		
			if 	(check.booleanValue())	{	 
	
			System.out.println("Better bring an umbrella !"); 
					
		}   else {
			
			System.out.println("No rain today, enjoy the sun!");
			
		}
	}
	
}	
	
}
