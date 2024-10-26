package collection.listclasses;
import java.util.ArrayList;
public class ArrayList5 {
	public static void main(String[] args) {
	ArrayList al1=new ArrayList();
	al1.add(100);
	al1.add("cyber");
	al1.add(true);
	System.out.println(al1);
	ArrayList<Integer> al2=new ArrayList<Integer>();
	//al2.add("cyber"); // string type 
	al2.add(200);
	al2.add(300);
	System.out.println(al2);
	}
}
