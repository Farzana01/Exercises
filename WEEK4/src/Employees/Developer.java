package Employees;

public class Developer extends Employee {
public Developer () {
	super(000,"Fulltime", "Peony", 25.25, "Salaried" ); //int Id, String type, String name, double rate, String mentType
}
public String getEmployeeType() {
	return ("I am a developer.");
}
}
