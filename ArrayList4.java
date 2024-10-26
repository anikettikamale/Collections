package collection.listclasses;
import java.util.ArrayList;
public class ArrayList4 {
public static void main(String[] args) {
Emp e1=new Emp(12345,"akash");
Stud s1=new Stud(101,"pooja");
Integer i=100;
ArrayList al1=new ArrayList();
al1.add(e1);al1.add(s1);al1.add(i);

for(Object oo:al1)
{if(oo instanceof Emp)
	{
		Emp ee=(Emp)oo;
		System.out.println(ee.empId+ee.empName);}
	else if(oo instanceof Stud)
	{
		Stud ss=(Stud)oo;
		System.out.println(ss.studId+" "+ss.studName);}
	else if(oo instanceof Integer)
	{
		Integer ii=(Integer)oo;
		System.out.println(ii);
	}}}}
