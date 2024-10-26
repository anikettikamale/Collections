package collection.listclasses;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet3 {

	public static void main(String[] args) {
	
	HashSet<Redbus> hs1=new HashSet<Redbus>();
	hs1.add(new Redbus(111,"pune"));
	hs1.add(new Redbus(222,"banglore"));
	hs1.add(new Redbus(333,"amravati"));
	hs1.add(new Redbus(444,"hydrabad"));
		Iterator<Redbus> i=hs1.iterator();
		while(i.hasNext())
		{
			Redbus rb=i.next();
		System.out.println(rb.ticketId+"_"+rb.ticketLoc);
		}
		
		
		
	}

}
