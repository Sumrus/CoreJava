package test;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1 = {20,30,40};
		
		System.out.println("The total number of value are " + num1.length);
		
		System.out.println("The Value at 3rd postion is " + num1[2]);
		
		String name = "Clean India Green India";
		
		String[] arrWords = name.split(" ");
		
		System.out.println("Value at 3rd positions is " + arrWords[2]);
		System.out.println("Value at 3rd positions is " + arrWords.length);
		

	}

}
