package collection.listclasses;

import java.util.ArrayList;

public class ArrayList13 {

	public static void main(String[] args) {
		 ArrayList <Emp> al1=new ArrayList<Emp>();
		  al1.add(new Emp(909,"Nitin"));
		  for(Emp e:al1)
		  {
		  System.out.println(e.empId+"_"+e.empName);
		  }
		  Emp e2=al1.get(0);
		  System.out.println(e2.empId+"_"+e2.empName);

	}

}
