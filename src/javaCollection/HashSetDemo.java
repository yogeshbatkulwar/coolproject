  package javaCollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
	// HashSet hs=new HashSet(100); //initial capacity 100
	//HashSet hs=new HashSet(100,(float)0.90);
	//HashSet <Integer> hs=new HashSet<Integer>();
		
	HashSet hs=new HashSet();//default capacity is 16 Load factorr 0.75
	
	//Add objects/elements into HashSet
	
	hs.add(100);
	hs.add("welcome");
	hs.add(16.4);
	hs.add('A');
	hs.add(true);
	hs.add(null);
	
	System.out.println(hs);
	
	//remove()
	hs.remove(16.4);
	System.out.println("After removing element:"+hs);
	
	//contains()
	System.out.println(hs.contains("welcome"));
	System.out.println(hs.contains("xyz"));
	
	//isEmpty
	System.out.println(hs.isEmpty());
	
	//reading objects/elements from hashset using for each loop
	
	/*for(Object e:hs)
	{
		System.out.println(e);
	}
	*/
	
	Iterator it=hs.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	

	}

}
