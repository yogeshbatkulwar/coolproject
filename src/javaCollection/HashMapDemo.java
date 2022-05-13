package javaCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <Integer,String> m=new HashMap<Integer,String>();
		
		//HashMap m=new HashMap();
		
		m.put(101,"john");
		m.put(102,"David");
		m.put(103,"Scott");
		m.put(104,"mary");
		m.put(105,"Tye");
		m.put(106,"x");
		m.put(107,"john");
		
		System.out.println(m);
		
		System.out.println(m.get(105));//Tye
		
		m.remove(106);// remove pair from hashmap
		System.out.println(m);
		
		System.out.println(m.containsKey(101));
		System.out.println(m.containsKey(106));
		
		 System.out.println(m.containsValue("Mary"));//true
		 System.out.println(m.containsValue("y"));//f
		 
		 System.out.println(m.isEmpty());//false
		 
		 
		 System.out.println(m.keySet());//return all the keys as set
		 
		 /*for(Object i:m.keySet())
		 {
			 System.out.println(i);
		 }*/
		 System.out.println(m.values());//return all the values as collection
		 
		/* for(Object l:m.values())
		 {
			 System.out.println(l);
		 }*/
		// System.out.println(m.entrySet());//return all the entries as set
		 
		/* for(Object e:m.keySet())
		 {
			 System.out.println(e+"  "+m.get(e));
		 }
		   */
		 //Entry method
		 
		 for(Map.Entry entry:m.entrySet())
		 {
			 System.out.println(entry.getKey()+ "  "+entry.getValue());
		 }
		 
		 
		 //Iterator
		System.out.println("--------------------"); 
		 Set s=m.entrySet();
		 Iterator itr=s.iterator();
		 
		 while(itr.hasNext())
		 {
			 Map.Entry entry=(Entry) itr.next();
			 System.out.println(entry.getKey()+"  "+entry.getValue());
			 
		 }
		 
		 
		
	}

	private static String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

}
