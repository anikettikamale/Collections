package collection.listclasses;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet3 {

	public static void main(String[] args) {
	
		LinkedHashSet<String> lhs1=new LinkedHashSet<String>();
		lhs1.add("cyber");
		lhs1.add("success");
		lhs1.add("training");
		lhs1.add("institute");
		Iterator<String> i=lhs1.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
		
		
	}

}
