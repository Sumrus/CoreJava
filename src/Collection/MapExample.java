package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		
		map1.put(1, "Tinu");
		map1.put(2, "Kalu");
		map1.put(3, "Ranu");
		
		System.out.println(map1);
		
		map1.put(2, "Try");
		
		System.out.println(map1);
		
		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>();
		
		map2.put(1, "Tinu");
		map2.put(2, "Kalu");
		map2.put(3, "Ranu");
		
		System.out.println(map2);
		
		map2.put(2, "Try");
		
		System.out.println(map2);
		
		TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
		
		map3.put(1, "Tinu");
		map3.put(2, "Kalu");
		map3.put(3, "Ranu");
		
		System.out.println(map3);
		
		map3.put(2, "Try");
		
		System.out.println(map3);

	}

}
