package collection.listclasses;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap4 {

	public static void main(String[] args) {
		TreeMap tm1=new TreeMap();
		tm1.put(222, "p");
		tm1.put(111, "r");
		tm1.put(444, "q");
		tm1.put(333, "s");
		tm1.put(555, "t");
		System.out.println(tm1);
		SortedMap sm1=tm1.headMap(333);
		System.out.println(sm1);
		SortedMap sm2=tm1.tailMap(333);
		System.out.println(sm2);
		

	}

}
