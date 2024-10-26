package collection.listclasses;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList15 {

	public static void main(String[] args) {
		 ArrayList<String> al1=new ArrayList<String>();
		  al1.add("cyber");
		  al1.add("success");
		  al1.add("traning");
		 al1.add("Institute");
		 System.out.println(al1);
		 Iterator <String> i=al1.iterator();
		 while(i.hasNext()) // check elements present 
		 {
			 System.out.println(i.next()); // extract the element
			  
		 }

	}

}
