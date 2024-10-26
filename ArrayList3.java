package collection.listclasses;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
     Emp e1=new Emp(101,"cyber");
     Emp e2=new Emp(202,"success");
     Emp e3=new Emp(303,"training");
     ArrayList al1=new ArrayList();
     al1.add(e1);
     al1.add(e2);
     al1.add(e3);
     System.out.println(al1);
     for(Object oo:al1)
     {
    	 Emp ee=(Emp)oo;  // downcasting 
    	 System.out.println(ee.empId+" "+ee.empName);
     }
	}

}
