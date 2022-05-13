package javaCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"Dog","Cat","Elephant"};
		
		for(String value:arr)
		{
			System.out.println(value);
		}
		 
		//convert array to arraylist
		
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);

	}

}
