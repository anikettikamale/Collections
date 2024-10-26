package collection.listclasses;
import java.util.TreeSet;
public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet ts1=new TreeSet();
		ts1.add(200);
		ts1.add(50); //no duplicate +null not accept+insertion order not  maintain 
		ts1.add(250);
		ts1.add(100);
		System.out.println(ts1);
		TreeSet ts2=new TreeSet(ts1);
		ts2.add(550);
		ts2.add(null);
		System.out.println(ts2);
	}
}









