package DeliveryVehicles;

public class Bicycles extends Vehicle {

  
	public int getNumberOfSeats()
	  {
	    return 1 ;
	  }
	 
	  public int getNumberOfWheels()
	  {
	    return 2;
	  }
	 
	  
	  public String getVehicleType()
	  {
	    return "Bicycles";
	  }
	 
	  public double getDistTravelled(double speed, double time) {
		   
		  
		  double distance =   speed * time;
		   return distance;
	   
	  }
	  
	  public double getTimeTravelled(double distance, double speed)
	  {
	  
		  double time = distance/speed;
		    
		  return time;
	  }
	}