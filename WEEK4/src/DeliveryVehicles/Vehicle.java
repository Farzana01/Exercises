package DeliveryVehicles;

      public class Vehicle {
// attributes of the vehicle      
	  public double speed;
      public int numberOfWheels;
      public int numberOfPassengers;
      public String makeOfVehicle;
	  public String modelOfVehicle;
	  public String vehicleType;
	  
    	  
	  public double getDistTravelled(double speed, double time) {
		   
		  
		  double distance =   speed * time;
		   return distance;
	   
	  }
	  
	  public double getTimeTravelled(double distance, double speed)
	  {
	  
		  double time = distance/speed;
		    
		  return time;
	  }
	  
	  public int getNumberOfSeats() {
		
    	  return numberOfPassengers ;
      }
      
      public int getNumberOfWheels(){
    	  
    	  return  numberOfWheels;
    	  
      }
       
      public String getVehicleType()
	  {
	    return this.vehicleType;
	  }
      public double getSpeed() {
    	    	  
		return speed;
	}
      public String getMakeOfVehicle() {
    	  
    	  return makeOfVehicle;
      }
      
      public String getModelOfVehicle() {
    	  
    	  return modelOfVehicle;
      }
      
      }     
