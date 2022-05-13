package javaCollection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		// Hashtable t=new hashtable();//capacity is 11 load factor
		//Hashtable t=new (initial capacity); //create hashtable object with some capacity
		
		//Hashtable t=new Hashtable(initial capacity,fill ratio/load factor);
		
		Hashtable <Integer,String> t=new Hashtable<Integer,String>();
		
		t.put(101,"john");
		t.put(102, "David");
		t.put(103, "Smith");
		//t.put(null,"x");//NullpointerException
		//t.put(104,null);///NullpointerException
		
		System.out.println(t);
		
		System.out.println(t.get(103));
		
		t.remove(103);
		System.out.println(t);
		
		System.out.println(t.containsKey(101));
		System.out.println(t.containsKey(105));
		
		System.out.println(t.containsValue("David"));
		System.out.println(t.containsValue("y"));
		
		System.out.println(t.isEmpty());
  		
		System.out.println(t.keySet());
		System.out.println(t.values());

		
		/*for(int k:t.keySet())
		{
			System.out.println(k+"   "+t.get(k));
		}*/
		
		//Entry specific method
		
		for(Map.Entry entry:t.entrySet())
		{
			
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		//iterator
		
		Set s=t.entrySet();
		
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry entry=(Entry) it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		
	}

}
