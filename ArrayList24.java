package collection.listclasses;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList24 {

	public static void main(String[] args) {
		Emp e1=new Emp(202,"pkash");
		Emp e2=new Emp(303,"giji");
		Emp e3=new Emp(404,"qayur");
		Emp e4=new Emp(505,"aahul");
		
		ArrayList<Emp> a1=new ArrayList<>();
		
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		a1.add(e4);
		Collections.sort(a1,new EmpName()); // put id or name
		for(Emp ee:a1)
		{
			System.out.println(ee.empId+"_"+ee.empName);
		}
		
		
		
		
	}

}
