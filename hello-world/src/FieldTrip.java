
public class FieldTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//number of students who went field trip =331
		
		int totNumOfStu = 331;
		
// number of students travelled by car
		
		int numTravCar = 7 ;
		
// number of students travelled by bus
		
		int stuTravBus = totNumOfStu - numTravCar;
		
// number of students in each of the 6 buses
		
		int stuInBus = stuTravBus / 6 ;
		System.out.println(stuInBus);
	}

}
