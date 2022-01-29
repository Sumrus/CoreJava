package OOPS;

public class childClass extends Person {
	
	String Profession;
	
	public childClass() {
		
	}
	
	public childClass(String Name, int Age, String Profession) {
		
		super(Name,Age);
		this.Profession = Profession;
	}
	
	public void Print() {
		
	System.out.println("Inside Child");
		
	}

}
