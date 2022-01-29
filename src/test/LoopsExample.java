package test;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//While loop
		
		int num = 1;
		
		while(num<=10) {
			
			if(num==5) {
				num = num + 1;
				continue;
			}
				System.out.println("number = " + num);
				num = num + 1;
			
		}
		
	//For loop
		
		for(int count=1;count<=10;count++) {
			if(count==5) {
				continue;
			}
			System.out.println("for loop " + count);
		}
		
	//Arrays with loop
		
		int[] array1 = {20,30,40,50,60};
		
		for(int index=0;index<array1.length;index++) {
			System.out.println("The value inside array is = " + array1[index]);
		}
		//another way for above problem
		
		for(int value:array1) {
			System.out.println("Value is = " +value );
			
		}

	}

}
