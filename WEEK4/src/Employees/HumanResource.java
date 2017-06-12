package Employees;

public class HumanResource extends Employee {
public HumanResource () {
	super(000,"Fulltime", "Suzy", 25.25, "Salaried" ); //int Id, String type, String name, double rate, String mentType
}
public String getEmployeeType() {
	return ("I am HR.");
}
}