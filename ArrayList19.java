package collection.listclasses;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayList19 {
	public static void main(String args[])
	{
		String[] s1= {"cyber","success","training"};
		
		List listColl=Arrays.asList(s1);
		
		ArrayList<String> a1=new ArrayList<String>(listColl);
		
		System.out.println(a1);
		
		for(String ss:a1) {
			System.out.println(ss);
		}
	}	
}
 