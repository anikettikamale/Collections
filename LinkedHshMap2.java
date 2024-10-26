package collection.listclasses;

import java.util.LinkedHashMap;

public class LinkedHshMap2 {

	public static void main(String[] args) {
LinkedHashMap hm1=new LinkedHashMap();
hm1.put(100,"cyber");
hm1.put(100,"success");
System.out.println(hm1);

hm1.put(10, 'x');
hm1.put(20,'x');
System.out.println(hm1);

hm1.put(null, 'y');
System.out.println(hm1);

hm1.put(null, 'z');
System.out.println(hm1);
	}

}

// key multiple null possible 