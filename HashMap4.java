package collection.listclasses;
import java.util.HashMap;
public class HashMap4 {
public static void main(String[] args) {	    
HashMap hm1=new HashMap();
hm1.put(11,'x');
hm1.put(22,'y');
hm1.put("cyber", true);
System.out.println(hm1);
HashMap hm2=new HashMap(hm1);
hm2.put(99,"A");
hm2.put(88,"B");
HashMap hm3=new HashMap();
hm3.putAll(hm2);
hm2.put(77,true);
hm2.put(66,false);
System.out.println(hm3);
	}
}








