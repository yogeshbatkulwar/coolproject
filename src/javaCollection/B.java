package javaCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class B 
{
	
	public int solution(int[] arr) 
	{
        int smallestInt = 1;

        if (arr.length == 0) return smallestInt;

        Arrays.sort(arr);

        if (arr[0] > 1) return smallestInt;
        if (arr[arr.length - 1] <= 0) return smallestInt;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == smallestInt)
            {
                smallestInt++;
            }
        }

        return smallestInt;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
B obj=new B();
obj.solution(null);
	}
}
