package javaCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		// declrae Linked List
		
		//LinkedList l=new LinkedList();
		//LinkedList <Integer> l=new LinkedList<Integer>();
		
		//LinkedList <String> l=new LinkedList<String>();
		
		LinkedList l=new LinkedList();
		
		//Add elements into linked list
		
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		
		System.out.println(l);
		
		//size
		System.out.println(l.size());
		
		//remove
		l.remove(3);
		System.out.println("After removing, new list:"+l);
		
		//Insert/adding element in the middle of the linked list
		//l.add(index,object)
		
		l.add(3, "java");
		System.out.println("After inserting element"+l);
		
		// retriving value/object
		System.out.println(l.get(3));//java
		
		//replace the value
		
		l.set(5,"X");
		System.out.println("After changing the value"+l);
		
		//contains
		System.out.println(l.contains("java"));//true
		
		//isEmpty()
		System.out.println(l.isEmpty());//false
		
		
		//read the data
		
		//for   loop
		
		/*for(int i=0; i<l.size(); i++)
		{
			System.out.println(l.get(i)); 
		}*/
		
		//for each loop
		
		for(Object e:l)
		{
			System.out.println(e);
		}
		
		//iterator
		
		Iterator it=l.iterator();
		
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
		
		
		

	}

}
