package collection.listclasses;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		System.out.println(v);
		Vector v2=new Vector(v);
		v2.add('x');
		v2.add('x');
		System.out.println(v2);
		Vector v3=new Vector();
		v3.addAll(v2);
		v3.add("cyber");
		v3.add("success");
		System.out.println(v3);

	}

}
