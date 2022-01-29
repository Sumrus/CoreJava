package test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter number");
		
		int number = scanner.nextInt();
		
		boolean flag = true;
		
		for(int index=2;index<number/2;index++) {
			
			int temp = number%index;
			if(temp == 0) {
				flag = false;
				break;
				
			}
			
		}
		if(flag==true) {
			System.out.println("The number is prime");
		}else {
			System.out.println("The number is not a Prime number");
		}
		scanner.close();

	}

}
