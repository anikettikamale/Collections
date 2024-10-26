package collection.listclasses;
import java.util.ArrayList;
public class ArrayList7 {
public static void main(String args[])
{
ArrayList a1=new ArrayList();
a1.add(100);
a1.add(200);
a1.add("tech");
a1.add('x');
a1.add(true);
System.out.println(a1);
a1.remove(0);
System.out.println(a1);
Integer i=200;
a1.remove(i);
System.out.println(a1);
}
}
