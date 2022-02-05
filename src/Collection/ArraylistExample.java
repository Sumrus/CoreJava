package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arraylist1 = new ArrayList<>();
		
		arraylist1.add("Nikhil");
		arraylist1.add("Dash");
		arraylist1.add("Raj");
		arraylist1.add("Manish");
		arraylist1.add("Rest");
		
		System.out.println("The siaze of array is " + arraylist1.size());
		
		arraylist1.remove(0);
		System.out.println("The size of array is " + arraylist1.size());
		System.out.println(arraylist1);
		
		for(int index=0; index<arraylist1.size(); index++) {
			
			System.out.println(arraylist1.get(index));
		}
		
		for(String name: arraylist1) {
			System.out.println(name);
		}
		
		Iterator<String> itr = arraylist1.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		//Sorting arrys
		
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		
		Collections.reverse(arraylist1);
		System.out.println(arraylist1);
		
	}

}
