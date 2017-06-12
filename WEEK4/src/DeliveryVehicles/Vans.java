package DeliveryVehicles;

public class Vans extends Vehicle {
	
	
	public int getNumberOfSeats()
	  {
	    return 7;
	  }
	 
	  public int getNumberOfWheels()
	  {
	    return 4;
	  }
	 
	  
	  public String getVehicleType()
	  {
	    return "Vans";
	  }
	 
	  public Integer getNumberOfDoors()
	  {
	    return 6;
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