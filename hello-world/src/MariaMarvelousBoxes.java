
public class MariaMarvelousBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Maria has some boxes, She buys seven more.
		
		int boxesPurchased = 7;
		
		
		//A week later half of all her boxes were destroyed in fire.
		//there are now only 22 boxes left.
		//with how many boxes did she start with?
		
		int boxesAfterFire = 22;
		int boxesBeforeFire = 2 * boxesAfterFire;
		int boxesBeforeBuying = boxesBeforeFire - boxesPurchased;
		System.out.println("She had " + boxesBeforeBuying + " boxes before buying boxes ");
	}

}
