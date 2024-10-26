package collection.listclasses;
import java.util.Vector;
public class Vector3 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(10);
		v1.add(20);
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		v1.add(10);v1.add(20);v1.add(10);v1.add(20);
		v1.add(10);v1.add(20);v1.add(10);v1.add(20);
		v1.add(10);v1.add(20);
		System.out.println(v1.capacity());
		System.out.println(v1.size());    // if capacity limits exceeds then it doubles......
		}}
