package javaCollection;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> evenNumber=new HashSet<Integer>();
		
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		
		System.out.println(evenNumber);
		
		HashSet <Integer> numbers=new HashSet<Integer>();
		numbers.addAll(evenNumber);
		numbers.add(10);
		System.out.println("New HashSet:"+numbers) ;
		
		//removeAll()
		
		numbers.removeAll(evenNumber);
		System.out.println(numbers);

	}

}
