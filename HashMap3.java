package collection.listclasses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap3 {
		public static void main(String[] args) {
			HashMap hm1=new HashMap();
			hm1.put(11,"cyber");
			hm1.put(22,"success");
			hm1.put(33,"training");
			hm1.put(44,"institute");
	System.out.println(hm1);
	Set s1=hm1.entrySet();
	Iterator i=s1.iterator();
	while(i.hasNext())
	{
		Map.Entry me1=(Map.Entry)i.next();
		System.out.println(me1.getKey()+"_"+me1.getValue());
	}

	}

}
