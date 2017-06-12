package VehiclesWithInterface;

public class DeliveryVan extends Vehicle implements GasPowered {
	private double refuelingTimeInHours;
	public DeliveryVan() { // default constructor
      super(60,17,15,0.25);
	}
      @Override
      public String getVehicleType() {
		return "Shiny battered van with dark wondows.";
		
}
      public abstract double travelFor(double hours);
      
      public int currentRange() {
    	  return currentFuelLevel * milesPerGallon;
      }
      
      
      @Override
      public double travelTimeRemaining() {
      	//(double) value causes the value to be treated like a double 
      // 	return 1.0 * currentRange () / rateOfTravelPerHour; // multiply by 1.0 to get the fractional numbers
          return (double) currentRange()/ rateOfTravelPerHour;
      }
      
      public double travelFor(double hours) {
  		if( hours >= travelTimeBeforeRefueling()) {
  			return (hours - refuelingTimeInHours) * rateOfTravelPerHour;
  					}
  	        return hours  * rateOfTravelPerHour;
  	}
  	
}     
      

