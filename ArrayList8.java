package collection.listclasses;
import java.util.ArrayList;
public class ArrayList8 {
public static void main(String[] args) {
ArrayList a1=new ArrayList();
a1.add("cyber");a1.add("100");
a1.add('x');a1.add(true);
System.out.println(a1);
a1.add(1,500.5f);
System.out.println(a1);
System.out.println(a1.contains("cyber"));
System.out.println(a1.contains("success"));
System.out.println(a1.isEmpty());
a1.clear(); 
System.out.println(a1.isEmpty());

}
}