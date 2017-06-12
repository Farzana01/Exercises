package Employees;

public class Manager extends Employee {
public Manager () {
	super(000,"Fulltime", "Tommy", 25.25, "Salaried" ); //int Id, String type, String name, double rate, String mentType
}
public String getEmployeeType() {
	return ("I am the manager.");
}
}