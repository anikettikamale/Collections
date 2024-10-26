package collection.listclasses;
import java.util.Stack;
public class Stack4 {
	public static void main(String args[])
	{
		Stack s1=new Stack();
		s1.push(100);
		s1.push(200); // it will tel the diatance from top 
		s1.push(300);
		s1.push(400);
		System.out.println(s1);
		System.out.println(s1.empty());
		System.out.println(s1.search(300));
		System.out.println(s1.search(100));
	}	
}
