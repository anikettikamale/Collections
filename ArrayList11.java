package collection.listclasses;

import java.util.ArrayList;

public class ArrayList11 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add("X");
		al1.add("Y");
		al1.add("Z");
		System.out.println(al1);
		ArrayList al2=new ArrayList(al1);
		al2.addAll(al1);
		al2.add("A");
		al2.add("B");
		al2.add("C");
		System.out.println(al2.containsAll(al1));
		al2.removeAll(al1);
		System.out.println(al2); // remove al1 and print all al2 
		al2.retainAll(al1);
		System.out.println(al2); 
	}

}
