package Encapsulation;

public class ClassInADifferentPackage {

	public void methodThatCallsMethod() {
		
		PublicClass target = new PublicClass();
		
		target.publicMethod();
		// can't call this because this is not a subclass
		
		target.protectedMethod();
		// can't call this because we are in a different package
		
		target.defaultMethod();
		// 
		
        target.privateMethod();
        //
	}

}
