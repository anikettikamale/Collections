package collection.listclasses;

import java.util.LinkedHashSet;

public class LinkedHashSet2 {

	public static void main(String[] args) {
		LinkedHashSet lhs1=new LinkedHashSet();
		lhs1.add("cyber");
		lhs1.add("success");
		System.out.println(lhs1);
		LinkedHashSet lhs2=new LinkedHashSet(lhs1);
		lhs2.add(true);
		lhs2.add(false);
		System.out.println(lhs2);
		LinkedHashSet lhs3=new LinkedHashSet(lhs2);		
   lhs3.add(100);
   lhs3.add(200);
   System.out.println(lhs3);
	}

}
