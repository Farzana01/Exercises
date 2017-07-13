package ExerciseProblems;

import java.util.Arrays;
public class ArraySort {

	
	    public static void main(String[] args) {
	        int values[] = {2,6,10,4,8};
	        Arrays.sort(values);
	        System.out.println("Min value : "+values[0]);
	        System.out.println("Max value : "+values[values.length-1]);
	    }
	}