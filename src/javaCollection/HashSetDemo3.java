package javaCollection;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		// union ,Intersection,  difference
		
		HashSet <Integer> set1=new HashSet<Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println("Hashset 1:"+set1);
		
		HashSet <Integer> set2=new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		System.out.println("HashSet 2:"+set2);
		
		//union
		//set1.addAll(set2);
		//System.out.println("union :"+set1);
		
		//intersection
		//set1.retainAll(set2);
		//System.out.println("Intersection:"+set1);
		
		//difference
		//set1.removeAll(set2);
	//	System.out.println("Difference:"+set1);
		
		//subset
		System.out.println(set1.containsAll(set2));//true
		set1.containsAll(set2);
		System.out.println(set1);
	}

}
