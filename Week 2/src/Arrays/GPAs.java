package Arrays;

public class GPAs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       
       	float[] gpaS = new float[5];
         gpaS[0] = (float) 2.2;
         gpaS[1] = (float) 3.5;
         gpaS[2] = (float) 4.0;
         gpaS[3] = (float) 3.2;
         gpaS[4] = (float) 3.8;
       
         int z = 0;
         int y = 1;
         int x = 1;
         
         while (z < gpaS.length) {
        	      	 
        	 System.out.println("GPA of student # "+ y + " is " + gpaS[z]); 
        	 
        	 z = z + 1;
        	 y = y + 1;
        	 
         }
         
         for (int i = 0; i<gpaS.length; i++) {
        	 
        	 System.out.println("GPA of student # "+ x + " is " + gpaS[i]); 
        	  x = x + 1;
        	 
         }
                
          
    }

}
