package collection.listclasses;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap5 {
		public static void main(String[] args) {
			TreeMap tm1=new TreeMap();
			tm1.put(222, "p");
			tm1.put(111, "r");
			tm1.put(444, "q");
			tm1.put(333, "s");
			tm1.put(555, "t");
			
			SortedMap sm1=tm1.headMap(333);
			TreeMap tm2=new TreeMap(sm1);
			System.out.println(tm2);
			
			SortedMap sm2=tm1.tailMap(333);
			TreeMap tm3=new TreeMap(sm2);
			System.out.println(tm3);
			
	}

}




