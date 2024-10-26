package collection.listclasses;
import java.util.ArrayList;
public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1=new ArrayList();
System.out.println(a1); //toString-->collections
a1.add(100); //int ->integer-?toString
a1.add(200.5f); //Float--> toString->
a1.add('x'); // char->character-->toString
a1.add("cyber");
a1.add(true);
System.out.println(a1);
Integer i=250;
System.out.println(i.toString());
	}

}
