package Arrays;

public class changingArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []array = {42,86,23};
		
		System.out.println(array[1]);
		
		array = new int [5];
		
		System.out.println("after: " +array[1]);
		System.out.println("my array as a string " +array);
		
	}

}
