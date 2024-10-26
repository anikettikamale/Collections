package collection.listclasses;

import java.util.HashSet;

public class HashSet2 {
public static void main(String args[])
{
	HashSet hs1=new HashSet();
	hs1.add(100);
	hs1.add(200);
	System.out.println(hs1);
	HashSet hs2=new HashSet(hs1);
	hs2.add('x');
	hs2.add('y');
	System.out.println(hs2);
	HashSet hs3=new HashSet();
	hs3.addAll(hs2);
	hs3.add(true);
	hs3.add(false);
	System.out.println(hs3);
}
}
