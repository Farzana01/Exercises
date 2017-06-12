package Encapsulation;

public class PublicClass {
	
	public void publicMethod() {
		
		protected void protectedMethod() {}
			
//	default (package) visibility
			
			void defaultMethod(){}
				
	private void privateMethod() {}
		
  public void methodThatCallsMethods(){
	
   publicMethod();
   protectedMethod();
   defaultMethod();
   privateMethod();

}
	

}	// closing for class
	
	
	
	

