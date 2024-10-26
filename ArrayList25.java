package collection.listclasses;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList25 {

	public static void main(String[] args) {
		Amazon p1=new Amazon(202,"mobile");
		Amazon p2=new Amazon(101,"ddfed");
		Amazon p3=new Amazon(303,"efeef");
		Amazon p4=new Amazon(404,"frwerf");
ArrayList<Amazon> a1=new ArrayList<Amazon>();
      a1.add(p1);
      a1.add(p2);
      a1.add(p3);
      a1.add(p4);
      System.out.println("before sorting");
      for(Amazon aa:a1)
      {
    	  System.out.println(aa.amazonProdId+"_"+aa.amazonProdName);
 
      }
Collections.sort(a1);;
System.out.println("after sorting");
for(Amazon aa:a1)
{
	System.out.println(aa.amazonProdId+"_"+aa.amazonProdName);
}
	}

}
