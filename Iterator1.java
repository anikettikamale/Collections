package collection.listclasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Iterator1 {
public static void main(String args[])
{
	ArrayList v1=new ArrayList();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		v1.add("D");
		v1.add("E");
		// iterate over elements of a collection
		System.out.println(v1);
		Iterator i=v1.iterator();
		//.iterator() method returns an Iterator object that allows 
		//you to traverse the elements 
		//of the ArrayList in a sequential manner.
		while(i.hasNext())
		{
			String s=(String)i.next();
			System.out.println(s);
}
}}
