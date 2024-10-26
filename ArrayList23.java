package collection.listclasses;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList23 {
	public static void main(String[] args) {
	Emp1 e1=new Emp1(200,"akash");
	Emp1 e2=new Emp1(208,"mayur");
	Emp1 e3=new Emp1(206,"nikit");
	Emp1 e4=new Emp1(201,"pasha");
	
ArrayList<Emp1> a1=new ArrayList<Emp1>(); // Emp is a custom class 
a1.add(e1);
a1.add(e2);
a1.add(e3);
a1.add(e4);

System.out.println("before sorting");
for(Emp1 ee:a1)
{
	System.out.println(ee.empId+"_"+ee.empName);
}



Collections.sort(a1);	
System.out.println("after sorting");
for(Emp1 ee:a1)
{
	System.out.println(ee.empId+"-"+ee.empName);
}	
	}  // sorted by id 
}
