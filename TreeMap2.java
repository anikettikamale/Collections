package collection.listclasses;

import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		TreeMap tm1=new TreeMap();
		tm1.put(202,'z');
		tm1.put(101,'x');
		tm1.put(303,'y');
		System.out.println(tm1);
		
		TreeMap tm2=new TreeMap(tm1);
		tm2.put(222, 'A');
		tm2.put(111, 'B');
		tm2.put(333, 'C');
		System.out.println(tm2);
	}
}
