package collection.listclasses;

import java.util.LinkedList;

public class LinkedList2 {
public static void main(String args[])
{
	LinkedList l2=new LinkedList();
	l2.add(100);
	l2.add(200);
	System.out.println(l2);
LinkedList l3=new LinkedList(l2);
l3.add('x');
l3.add('y');
l3.add('z');
System.out.println(l3);
LinkedList l4=new LinkedList();
l4.addAll(l3);
l4.add("abc");
l4.add("xyz");
System.out.println(l4);
}
}
