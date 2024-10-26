package collection.listclasses;

import java.util.ArrayList;

public class ArrayList9 {
public static void main(String args[])
{
	ArrayList al1=new ArrayList();
	al1.add(100);
	al1.add(200);
	System.out.println(al1);
	
	ArrayList al2=new ArrayList(al1);
	al2.add("A");
	al2.add("B");
	System.out.println(al2);
	
	ArrayList al3=new ArrayList();
	al3.addAll(al1); //collection inside collection
	al3.add(true);
	al3.add(false);
	System.out.println(al3);
}
}
