package VehiclesWithInterface;

public class BoxTruck extends Vehicle implements GasPowered {
public BoxTruck() {
	super (55,30,10,0.4);
}
public String getVehicleType() {
	return ("Just a box truck. Not the truck you are looking for.");
}


}
