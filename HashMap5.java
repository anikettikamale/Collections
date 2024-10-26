package collection.listclasses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap5 {

	public static void main(String[] args) {
		
		
HashMap<Stud,Skill> hm1=new HashMap<Stud,Skill>();
hm1.put(new Stud(101,"Rahul"),new Skill(1,"java"));
hm1.put(new Stud(202,"Akansha"),new Skill(2,"testing"));
hm1.put(new Stud(303,"Mehul"),new Skill(3,"python"));
		    Set s1=hm1.entrySet();
		    Iterator i=s1.iterator();
		    while(i.hasNext())
		    {
		    	Entry me1=(Map.Entry)i.next();
		    Stud ss=(Stud)me1.getKey();
		    System.out.println(ss.studId+"_"+ss.studName+" ");
		    Skill sk=(Skill)me1.getValue();
		    System.out.println(sk.skillId+" "+sk.skillName);
		    
		    
		    
		    
		    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
