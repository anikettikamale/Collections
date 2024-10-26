package collection.listclasses;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap hm1=new HashMap();
		hm1.put(11, "A");
		hm1.put(22, "B");
		hm1.put(33, "C");
		hm1.put(44, "D");
		System.out.println(hm1);
		hm1.put(null,"D");
		System.out.println(hm1);
    hm1.put(null, "E");
    System.out.println(hm1);
    hm1.put(55,null);
    hm1.put(66,null);
    hm1.put(77,null);
    System.out.println(hm1);		
	}
}
