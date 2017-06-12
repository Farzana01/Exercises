package Maps;

import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class StudentRecordsWithMap {

	public static void main(String[] args) {
//		Student harvey = new Student ("23A52", "Harvey Dent");
//		Student jessica = new Student ("68Z29", "Jessica Jones");
//		Student jj = new Student ("57W85", "Jonah Jameson");
		
		Map<String, String> students = new HashMap<String, String>();
		
		students.put("68Z29", "Jessica Jones");
		System.out.println("hashcode for 68Z29 is " + "68Z29".hashCode());
		System.out.println(students);		 
				
		students.put("23A52", "Harvey Dent");
		System.out.println("hashcode for 23A52 is " + "23A52".hashCode());
		System.out.println(students);
		
		String studentName = students.get("23A52");
		System.out.println("I found student" + studentName);
			
		// common map methods
		
		
		//collection views
		System.out.println("Student names (map values) are " + students.values());
		System.out.println("Student ids (map values) are+ students.keySet()");
		//use entrySet(), when you need both key and value
		System.out.println("Student entries (key/value pairs) are" + students.entrySet());	
			
		
		System.out.println("Iterating over entries:");
		for (Entry<String, String> entry: students.entrySet()) {
			String key = entry.getKey(); // student id
			String value = entry.getValue(); // student value
			System.out.println("Key is " + key + " , value is " +value);
		}
		
	// sorting a list (sidebar)
		
		System.out.println("Sorting a list");
		List<String> listOfClasses = new ArrayList<String>();
		listOfClasses.add("Philosophy");
		listOfClasses.add("Creative Writing");
		System.out.println(listOfClasses);
		Collections.sort(listOfClasses);
		System.out.println(listOfClasses);
		
	
		if(students.containsKey("23A52")) { // Harvey Dent's id
			System.out.println("Yes, 23A52");
			
		}
		if(students.containsKey("68Z29")) { // Jessica Jones's id
			System.out.println("Yes, 23A52 is a valid student id");
		}
		if(students.containsKey("1234")) { // bad one
			System.out.println("Found the key");// doesnt print
		}
	
		// is this a valid student id?
		if(students.containsValue ("Harvey Dent")) {
			System.out.println("Founf Harvey");
		}
		
		// do we have any students
		if(!students.isEmpty()); { 
		    System.out.println("We have students");
		    
		}    
			
		// sorry, Harvey. You are DC
		students.remove("23A52"); // his ID is the key
		    System.out.println(students);
		
		
		// how many students are there?
		    System.out.println("There are " +students.size() + " students.");
		
			}
		
		
			
		}

	



