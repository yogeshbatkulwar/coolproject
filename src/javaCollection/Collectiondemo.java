package javaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collectiondemo {

	public static void main(String[] args) {
		//declare ArrayList
		//ArrayList <Integer> al=new ArrayList<Integer>();
		//ArrayList <String> al =new ArrayList<String>();  
	//List al=new ArrayList();
		ArrayList al=new ArrayList();
		
		//Add new elements to the arraylist
		
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		
		//size()
		System.out.println("Number of elements in array list"+al.size());;
		//remove
		
		al.remove(1);//here 1 is index
		//al.remove("welcome");//here welcome is element
		System.out.println("After removing element from array list:"+al);
		
		//insert a new element
		//add(index,object)
		al.add(2,"Python");
		
		//retirive specific element
		System.out.println(al.get(2));//Python here 2 is index of element/object
		
		//change element/replace
		al.set(2, "C#");
		System.out.println("After replacing element:"+al);
		
		//search- contains() -returns true/false
		System.out.println(al.contains("C#"));//true
		System.out.println(al.contains("c++"));
		
		//isEmpty
		
		System.out.println(al.isEmpty());
		
		
		//read data by
		//1)for loop
		/*for(int i=0; i<al.size(); i++)
		{
		System.out.print(al.get(i));
		}*/
		
		//for each/enhance for loop
		/*for(Object e:al)
		{
			System.out.println(e);
		}*/
		
		//iterator use
		
		System.out.println("Reading elements using iterator");
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
		 System.out.println(it.next());
		}
		
	}

}
