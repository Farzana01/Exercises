package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreOneValue {

	public static void main(String[] args) {
		
		
		String[] animal = new String[2];
		animal[0]= "peony";
		animal[1]="farzana";
		//System.out.println(animal[0]);
		
		
		for (int i = 0; i < animal.length; i++){
			System.out.println(animal[i]);
		}
		
		Map<String, String> dog = new HashMap<String, String>();
		
		dog.put("bob", animal[0]);
		dog.put("rock", animal[1]);
		dog.replace("bob", animal[0], "Try out something different");
		dog.isEmpty();
		System.out.println(dog.size());
		System.out.println(dog.get("bob"));
		System.out.println(dog.get("rock"));
		System.out.println(animal[0]);
		System.out.println(dog.isEmpty());
		System.out.println(dog.get("bob"));
  }

}
