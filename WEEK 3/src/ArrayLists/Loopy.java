package ArrayLists;

import java.util.ArrayList;

public class Loopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> giantWords = new ArrayList<String>();
		giantWords.add("fee");
		giantWords.add("fie");
		giantWords.add("foe");
		System.out.println(giantWords);
		
		for (String word: giantWords) {
			System.out.println(word + "! ");
		}
		
		System.out.println();
		
		

	}

}
