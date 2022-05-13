package javaCollection;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		
		l.add("Dog");
		l.add("Cat");
		l.add("Elephant");
		
		System.out.println(l);
	
		
		l.addFirst("Tiger");
		
		System.out.println("After adding first element"+l);
		
		l.addLast("horse");
		
		System.out.println("After add last element"+l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println("After removing first and last elements:"+l);
		
		
		
		
		
		

	}

}
