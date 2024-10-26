package collection.listclasses;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(100);
		v.add(200.5);
		v.add("cyber");
		v.add('x');
		v.add(true);
		System.out.println(v);
		v.add(null);
		v.add("cyber");
		System.out.println(v);	
	}

}
