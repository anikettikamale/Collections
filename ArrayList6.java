package collection.listclasses;

import java.util.ArrayList;

public class ArrayList6 {
public static void main(String args[])
{
 ArrayList<Swiggy> order=new ArrayList<Swiggy>();
 order.add(new Swiggy(111,"burger"));
 order.add(new Swiggy(333,"pasta"));
 order.add(new Swiggy(222,"pizza"));
 for(Object o:order) //for each loop
 {
	 Swiggy ss=(Swiggy)o; //downcasting
	 System.out.println(ss.menuId+" "+ss.menuName);
 }
}
}
