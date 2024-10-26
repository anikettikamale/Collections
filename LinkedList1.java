package collection.listclasses;

import java.util.LinkedList;

public class LinkedList1 {
public static void main(String args[])
{
	LinkedList l1=new LinkedList();
	l1.add(100);
	l1.add(200.5f);
	l1.add('x');
	l1.add("cyber");
	System.out.println(l1);
	l1.add(null);   //allow duplicate +null accept+insertion order maintain 
	l1.add("cyber");
	System.out.println(l1);
}	
}
