package Maps;

public class Student {
// instance variables. you have to make it public if the class is not in the same package
	 public String id;
	 public String name;
	
	 public Student() {
		 
	 }
	 
	 public Student(String idParam, String nameParam) {
	     this.id = idParam;
	     this.name = nameParam;
	    System.out.println("This is " + this); 
	     
	     
	 }
	 
	 public String toString(){
		return "Student with id: " +id + " , name:" +name;
		
	}
	
	
	
	
	 
}
