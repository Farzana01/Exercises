package Employees;

public abstract class Employee {
	String employeeType;// full time or part time
	String employmentType; // hourly or salaried
	String employeeName;
	int employeeId;
	double employeeRate;
	int employeeHours;
	double annualPay;
    int hourlyRate;
    
    
	public abstract String getEmployeeType();

	public Employee(int Id, String type, String name, double rate, String mentType) {
		employeeId = Id;
		employeeType = type;
		employmentType = mentType;
	}

	public double getEmployeeRate(int Id, String type, double rate) {
		this.employeeId = Id;

		if (employmentType == "Hourly") {
			employeeRate = 15.25;
		} else {
			employmentType = "Salaried";
			employeeRate = 25.25; // Salary rate
		}
		return rate;
	}

	public String getEmployeeName(int Id, String type, String name) {
		employeeId = Id;
		employeeType = type;
		employeeName = name;
		return name;
	}

	public int getHours(int Id, String type, String name, int hours) {
		employeeId = Id;
		employeeType = type;
		employeeName = name;
		employeeHours = hours;
		return hours;

	}

	public double geAnnualPay(double rate, int hours) {
      if (hours>40)
    	         return rate * 40 + rate * 1.5 *(hours - 40);
      else
		         annualPay = rate * hours * 52;
		
				 return annualPay;
		
	}

}