package collection.listclasses;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
HashSet hs1=new HashSet();
hs1.add(100);
hs1.add(200.5f);
hs1.add('x');    //no duplicate +null  inserion accept+insertion order not maintain 
hs1.add("cyber");
System.out.println(hs1);
hs1.add(null);
hs1.add("cyber");
System.out.println(hs1);




	}

}
