package collection.listclasses;

import java.util.Stack;

public class Stack3 {

	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.push(100);
		s1.push(200);
		s1.push(300);
		s1.push(400);
		System.out.println(s1);
		System.out.println(s1.pop());   // it will extract it 
		System.out.println(s1);
	}

}
