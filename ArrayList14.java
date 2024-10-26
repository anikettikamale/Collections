package collection.listclasses;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList14 {
public static void main(String args[])
{
	 ArrayList al1=new ArrayList();
	  al1.add("cyber");
	  al1.add("success");
	  al1.add("traning");
	 al1.add("Institute");
	 System.out.println(al1);
	 Iterator i=al1.iterator();
	 while(i.hasNext())
	 {
		 String ss=(String)i.next();
		 System.out.println(ss);
	 }
	 
}
}
