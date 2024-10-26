package collection.listclasses;
import java.util.ArrayList;
public class ArrayList1 {
public static void  main(String args[])
{
	ArrayList a1=new ArrayList();
	a1.add(100);
	a1.add(200);
	System.out.println(a1);
	a1.add("cyber");
	a1.add('x');
	System.out.println(a1);
	a1.add(null);
	a1.add(100);
	a1.add('x');
	System.out.println(a1);

	// concept is duplicate allow 
}
}
