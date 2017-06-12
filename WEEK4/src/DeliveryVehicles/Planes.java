package DeliveryVehicles;

public class Planes extends Vehicle {
  
	public int getNumberOfSeats()
	  {
	    return 335;
	  }
	 
	  public int getNumberOfWheels()
	  {
	    return 6;
	  }
	 
	  
	  public String getVehicleType()
	  {
	    return "Airplane";
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