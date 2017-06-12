package Arrays;

public class indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String source = "foo";
	
	int firstIndexOfO = source.indexOf('o');
	
	System.out.println("The first index of \'o\' is " +firstIndexOfO);
	
	int nextIndexOfO = source.indexOf ('o', firstIndexOfO +1);
	
	System.out.println("The next index of \'o\' is " + nextIndexOfO);
	}

}
