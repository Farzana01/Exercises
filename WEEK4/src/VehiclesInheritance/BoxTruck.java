package VehiclesInheritance;

public class BoxTruck extends Vehicle {
public BoxTruck() {
	super (55,30,10,0.4);//int rate, int fuel, int mpg, double refuelingTimeInHours
}
public String getVehicleType() {
	return ("Just a box truck.Not the truck you are looking for.");
}


}