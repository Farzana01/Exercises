package VehiclesWithInterface;

public class VehiclesApp {

	public static void main(String[] args) {
	//constructor
//		Vehicle v = new Vehicle(70, 10,23, 0.75 );
/*		
		System.out.println("My vehicle's current range is " + v.currentRange());
		System.out.println("I have enough gas for " + v.travelTimeRemaining() + "hours");
		System.out.println("In 3 hours, I travelled " + v.travelFor(3));
		System.out.println("In 6 hours, I travelled " + v.travelFor(6));
*/
		Vehicle van = new DeliveryVan();
		deliverStuffWith(van);
		
		System.out.println();
		
		Vehicle truck = new BoxTruck();
		deliverStuffWith(truck);
		
		System.out.println();
		
		Vehicle bicycle = new Bicycle();
		deliverStuffWith(bicycle);
	}
	public static void deliverStuffWith(Vehicle v) {
		System.out.println("My vehicle's current range is " + v.currentRange());
		System.out.println("My vehicle's current range is " + v.currentRange());
		System.out.println("I have enough gas for " + v.travelTimeRemaining() + "hours");
		System.out.println("In 3 hours, I travelled " + v.travelFor(3));
		System.out.println("In 6 hours, I travelled " + v.travelFor(6));
	}

}
