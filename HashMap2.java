package collection.listclasses;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap hm1=new HashMap();
		hm1.put(11,"A");
		hm1.put(22,"B");
		hm1.put(33,"C");
System.out.println(hm1);
Set s1=hm1.keySet();
System.out.println(s1);
Collection c1=hm1.values();
System.out.println(c1);
	}
}
