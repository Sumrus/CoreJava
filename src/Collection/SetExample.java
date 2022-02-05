package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs1 = new HashSet<String>();
		
		hs1.add("1");
		hs1.add("2");
		hs1.add("3");
		hs1.add(null);
		
		System.out.println(hs1);
		
		
		LinkedHashSet<String> lhs1 = new LinkedHashSet<String>();
		
		lhs1.add("1");
		lhs1.add("2");
		lhs1.add("3");
		lhs1.add(null);
		
		System.out.println(lhs1);
		
		TreeSet<String> set3 = new TreeSet<String>();
		
		set3.add("Rick");
		set3.add("Raj");
		set3.add("Mira");
		set3.add("Reena");
		// set3.add(null); we can not add null value to tree set
		
		System.out.println(set3);
		
		
		String str1 = "Clean World Green World"; // problem statement
		
		
		
	}

}
