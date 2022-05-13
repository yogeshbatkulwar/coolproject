package javaCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList al_dub=new ArrayList();
		al_dub.addAll(al);
		System.out.println(al_dub);
		
		al_dub.removeAll(al);
		System.out.println("After removing :"+al_dub);
		
		//sort -- collectons.sort()

		System.out.println("Element in the array list:"+al);
		
		Collections.sort(al);
		
		System.out.println("Element in the array list after sorting:"+al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Element in the array list sorting in reverse order"+al);
		
		//Shuffling -Collections.shuffle()
		Collections.shuffle(al);
		System.out.println("Element in the array list after Shuffling:"+al);
		
		
		
	}

}
