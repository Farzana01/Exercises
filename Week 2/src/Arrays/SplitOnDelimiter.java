package Arrays;

public class SplitOnDelimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//we're using basic split
		
		String groceryList = "eggs-milk,wheat bread,spring mix-coffee";
		
		//the regex we need is :,|-|?");
	String[] items = groceryList.split("[,-?] ?");
	
//		String[] items = groceryList.split(",|-|\\"); 
				
				
		System.out.println("Items:");
		for (String item: items) {
			 System.out.println("|" +item+ "|");
		}
		
		items = groceryList.split("[,-?*");
		
		System.out.println("Items allowing multiple spaces:");
		
		for (String item: items) {
			System.out.println("|" +item+ "|");
			
			
		}
	}

}
