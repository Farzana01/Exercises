package DeliveryVehicles;

public class VehicleTesting {
	
	public static void main(String[] args){
	
		
		
		Vehicle myBicycles = new Bicycles();
        System.out.println("My " + myBicycles.getVehicleType() + " has " + myBicycles.getNumberOfSeats() + " seats.");
        System.out.println("My " + myBicycles.getVehicleType() + " has " + myBicycles.getNumberOfWheels() + " wheels.");
        System.out.println("My " + myBicycles.getVehicleType() + " can travel for " + myBicycles.getTimeTravelled(25,4) + " hours.");
        System.out.println("My " + myBicycles.getVehicleType() + " can travel " + myBicycles.getDistTravelled(30,6) + " miles.");
        
        Vehicle myPlanes = new Planes();
        System.out.println("My " + myPlanes.getVehicleType() + " has " + myPlanes.getNumberOfSeats() + " seats.");
        System.out.println("My " + myPlanes.getVehicleType() + " has " + myPlanes.getNumberOfWheels() + " wheels.");
        System.out.println("My " + myPlanes.getVehicleType() + " can travel for " + myPlanes.getTimeTravelled(450, 5) + " hours.");
        System.out.println("My " + myPlanes.getVehicleType() + " can travel " + myPlanes.getDistTravelled(450, 50) + " miles.");
        
        Vehicle myVans = new Vans();
        System.out.println("My " + myVans.getVehicleType() + " has " + myVans.getNumberOfSeats() + " seats.");
        System.out.println("My " + myVans.getVehicleType() + " has " + myVans.getNumberOfWheels() + " wheels.");
        System.out.println("My " + myVans.getVehicleType() + " can travel for " + myVans.getTimeTravelled(65,5) + " hours.");
        System.out.println("My " + myVans.getVehicleType() + " can travel " + myVans.getDistTravelled(65, 5) + " miles.");
        



		

}
}