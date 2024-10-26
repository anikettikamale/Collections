package collection.listclasses;
import java.util.Enumeration;
import java.util.Vector;
public class Enumeration1 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(100);
		v1.add(200);
		v1.add(300);
		v1.add(400);
		v1.add(500);
		System.out.println(v1);
		Enumeration e=v1.elements(); // for legaccy classes
		while(e.hasMoreElements())
		{
		Integer i=(Integer)e.nextElement();
		System.out.println(i);
		}
	}
}
