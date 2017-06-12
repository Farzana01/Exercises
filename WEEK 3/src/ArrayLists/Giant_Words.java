package ArrayLists;

import java.util.ArrayList;

public class Giant_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> giantWords = new ArrayList<String>();
		giantWords.add("fee");
		giantWords.add("fie");
		giantWords.add("foe");
		System.out.println(giantWords);
		System.out.println("my list has " + giantWords.size() + " elements");

		giantWords.add("fum");
		System.out.println(giantWords);
		System.out.println("my list has " + giantWords.size() + " elements");
		
		
	}

}
