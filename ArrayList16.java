package collection.listclasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList16 {

	public static void main(String[] args) {
		 ArrayList<String> al1=new ArrayList<String>();
		  al1.add("cyber");
		  al1.add("success");
		  al1.add("traning");
		 al1.add("Institute");
		 System.out.println(al1);
		 
		 ListIterator<String> li=al1.listIterator();  // only for list classes 
		 while(li.hasNext())// iterating in the forward direction
		 {
			 System.out.println(li.next());
					 }
while(li.hasPrevious()) // iterating in the backward direction.
{
	System.out.println(li.previous());  
}
	}

}
