package OOPS;

public class Employee {
	
	public String Name;
	public int EmployeeId;
	public static int Salary;
	public static String CompanyName;

	public Employee(String Name, int EmployeeId, int Salary) {
		
		this.Name = Name;
		this.EmployeeId = EmployeeId;
		Employee.Salary = Salary;
		
	}
	
	public Employee(String Name, int EmployeeId) {
		
		this.Name = Name;
		this.EmployeeId = EmployeeId;
		
	}
	public void PrintName() {
		System.out.println("Name = " + this.Name);
	}
	
	public void PrintSalary() {
		
		System.out.println("Salary of employee is " + Employee.Salary);
	}
	
	public static void ChangeCompanyName() {
		
		Employee.CompanyName = "Infosys Technology";
	}

}
