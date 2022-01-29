package test;

import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter age");
		
		int age = scanner.nextInt();
		
		if(age>=18) {
			System.out.println("eligibal for voting");
		}else if(age==17) {
			System.out.println("You will be eligibal next year");
		}
		
		else {
			System.out.println("Not eligibale");
		}
		
		scanner.close();
		
	}

}
