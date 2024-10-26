package collection.listclasses;

import java.util.ArrayList;

public class ArrayList20 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(150);
		a1.add(250);
		a1.add(350);
		a1.add(450);
		Integer[] aa=a1.toArray(new Integer[a1.size()]); // collection to array
		for(Integer l1:aa)
		{
			System.out.println(l1);
		}
	}

}
