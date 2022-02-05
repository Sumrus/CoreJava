package Collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack1 = new Stack<Integer>();
		
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		
		System.out.println(stack1);
		
		stack1.pop();
		stack1.push(35);
		
		System.out.println(stack1);
		

	}

}
