package Arrays;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String source = "this, that, the other";
		String[] elements = source.split(", ");

		System.out.println(elements[0]); // prints "this"
		System.out.println(elements[1]); // prints "that"
		System.out.println(elements[2]); // prints "the other"
		
		System.out.println("Splitting on \'t\'.");
		String[] splitOnT = source.split("t");
				
		System.out.println("Numbrt of Elements" +splitOnT.length);
		
		for(int index = 0; index < splitOnT.length; index++) {
		System.out.println("Element at index " +index + ": |" +splitOnT[index] +"|");
	}

}
}
