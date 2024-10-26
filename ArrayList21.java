package collection.listclasses;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList21 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("mducation");
		a1.add("cyber");
		a1.add("pune");
		a1.add("institute");
		System.out.println(a1);
		Collections.sort(a1); // internally invoked compareTo method 
        System.out.println(a1);
	}

}
