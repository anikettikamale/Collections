package collection.listclasses;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {
public static void main(String args[])
{
	ArrayList al1=new ArrayList(); // iterator for list classes only like Arraylist 
	al1.add('x');
	al1.add('y');
	al1.add('z');
	System.out.println(al1);
	ListIterator li=al1.listIterator();
	while(li.hasNext()) // check
	{
	Character c=(Character)li.next();  // extract
	System.out.println(c);
	}
}
}
