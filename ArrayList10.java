package collection.listclasses;
import java.util.ArrayList;
public class ArrayList10 {
	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		System.out.println(al1);
		ArrayList al2=new ArrayList(al1);
		al2.add("A");
		al2.add("B");
		al2.add("C");
		System.out.println(al2);
		System.out.println(al2.containsAll(al1));
		Integer i=20;
		al2.remove(i);
		System.out.println(al2.containsAll(al1));
 // because 20 removed here 
	}

}
