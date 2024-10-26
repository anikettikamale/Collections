package collection.listclasses;
import java.util.LinkedHashSet;
public class LinkedHashSet1 {
	public static void main(String[] args) {
	LinkedHashSet lhs1=new LinkedHashSet();
	lhs1.add('A');
	lhs1.add('B');
	lhs1.add('C');
	lhs1.add('D');
	System.out.println(lhs1);
	lhs1.add(null);
	lhs1.add('D');
	System.out.println(lhs1); // no duplicate +null accept+insertion order maintain 
	}
}








