package Employees;

public class EmployeeApp {

	public static void main(String[] args) {

		Employee dev = new Developer();
		employeesInCompany(dev);
		System.out.println();

		Employee mang = new Manager();
		employeesInCompany(mang);
		System.out.println();

		Employee jan = new Janitor();
		employeesInCompany(jan);
		System.out.println();

		Employee hr = new HumanResource();
		employeesInCompany(hr);
		System.out.println();

	}    

	public static void employeesInCompany(Employee e) {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

}
