package collection.listclasses;

import java.util.Vector;

public class Vector4 {

	public static void main(String[] args) {
		Vector v1=new Vector(7,4);
		v1.add(10);v1.add(20);v1.add(30);
		System.out.println(v1.capacity());
		System.out.println(v1.size());    //7+4=11 and 11+4=15
		
		v1.add(10);v1.add(20);v1.add(10);
		v1.add(10);v1.add(20);v1.add(10);
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		
		v1.add(10);v1.add(20);v1.add(30);v1.add(30);	
	    System.out.println(v1.capacity());
	    System.out.println(v1.size());
}
}



