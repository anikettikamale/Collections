package collection.listclasses;

import java.util.ArrayList;

public class ArrayList12 {

	public static void main(String[] args) {
	  ArrayList al1=new ArrayList();
	  al1.add(new Emp(909,"kavya"));
	  for(Object o1:al1)
	  {
		  Emp e1=(Emp)o1;  
	  System.out.println(e1.empId+"_"+e1.empName);
	  }
	  Object o2=al1.get(0);
	  Emp e2=(Emp)o2;
	  System.out.println(e2.empId+"_"+e2.empName);
	}

}
