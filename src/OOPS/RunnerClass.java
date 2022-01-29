package OOPS;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Employee emp1 = new Employee();
		emp1.Name = "Sam";
		emp1.EmployeeId = 2222;
		emp1.Salary = 3000;

		Employee emp2 = new Employee();
		emp2.Name = "Raj";
		emp2.EmployeeId = 222112;
		emp2.Salary = 2500; */
		//above code this before creating the constructor
		
		//below code is after creating the constructor
		//Employee emp1 = new Employee("Sam", 2222, 3000);
		//Employee emp2 = new Employee("Raj", 222112, 4000);
		
		//emp1.PrintName();
		//emp2.PrintName();
		
		Employee emp3 = new Employee("Rahul",456785);
		
		Employee.ChangeCompanyName();
		
		emp3.PrintName();
		
		Person per1 = new Person();
		
		
		
		
		
		childClass child2 = new childClass("Sumit",30,"Engineer");
		
		child2.display();
		child2.Print();
		
		MethodOverloadingExample obj = new MethodOverloadingExample();
		obj.sum(4, 5);
		obj.sum(4, 5, 10);
		
		EncapsulationExample encap = new EncapsulationExample();
		encap.setName("Sumit");
		System.out.println(encap.getName());
		
	}

}
