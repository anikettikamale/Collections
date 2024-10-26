package collection.listclasses;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList17 {

	public static void main(String[] args) {
		ArrayList<Swiggy> m1=new ArrayList<Swiggy>();
		m1.add(new Swiggy(111,"chai"));
		m1.add(new Swiggy(112,"coffee"));
		m1.add(new Swiggy(113,"poha"));
		m1.add(new Swiggy(114,"khichdi"));
		Iterator<Swiggy> is=m1.iterator();
		while(is.hasNext())
		{
			Swiggy s=is.next();
			System.out.println(s.menuId+"_"+s.menuName);
			if(s.menuName.equals("poha")) {
				is.remove();
			}
		}
		System.out.println("---------------");
		for(Swiggy ss:m1)
		{
			System.out.println(ss.menuId+"_"+ss.menuName);
		}
	}

}
