package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reverse String
		//reversal of Array
		//reversal of number
		
		String str1 = "Clean India Green India";
		String reverse = "";
		
		for(int index=str1.length()-1;index>=0;index--) {
			
			reverse = reverse + str1.charAt(index);
		}
		System.out.println(reverse);
		
		// Number of vovles 
		
		int result =0;
		for(int index=0;index<str1.length();index++) {
			
			if(str1.charAt(index)== 'a' || str1.charAt(index)=='e' || str1.charAt(index)=='i' || str1.charAt(index)=='o'|| str1.charAt(index)=='u');
			result++;
			
		}
		
		//reversal of array
		
		int[] array1 = {20,30,40,50,60};
		
		
		for(int index=array1.length-1;index>=0;index--) {
			System.out.println(array1[index]);
		}
		
		//reversal of number
		
		int num = 234568;
		
		int rev = 0;
		
		while(num>0) {
		
		int remainder = num%10;
		rev = rev*10 + remainder;
		num = num/10;
		
		}
		
		System.out.println(rev);

	}

}
