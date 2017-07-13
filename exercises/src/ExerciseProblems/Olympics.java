package ExerciseProblems;

import java.util.ArrayList;
/*
Rio de Janeiro will host the summer Olympics in 2016.

*/
import java.util.HashMap;

public class Olympics {
	public static void main(String[] args) {
		ArrayList<String> olympicSports = new ArrayList<String>();
		olympicSports.add("Archery");
		olympicSports.add("Diving");
		olympicSports.add("Boxing");
		olympicSports.add("Cricket");

		System.out.println("There are " + olympicSports.size() + " Olympics sports in this list." + "They are: ");

		for (String sport : olympicSports) {
			System.out.println(sport);

		}

		HashMap<String, Integer> hostCities = new HashMap<String, Integer>();
		hostCities.put("Beijing", 2008);
		hostCities.put("London", 2012);
		hostCities.put("Rio de Janeiro", 2016);

		for (String city : hostCities.keySet()) {

			if (hostCities.get(city) < 2016) {
				System.out.println(city + " hosted the summer Olympics in " + hostCities.get(city) + ".");

			} else {
				System.out.println(city + " will host the summer Olympics in " + hostCities.get(city) + ".");
			}

		}

	}

}
 