package javaCollection;

import java.util.HashMap;
import java.util.Map;

public class ABC {

	public static void main(String[] args) {
	
	HashMap <Integer,String> map=new HashMap <Integer,String>();
	
	map.put(1, "A");
	map.put(2, "B");
	map.put(3, "C");
	map.put(4, "D");
	map.put(5, "E");
	map.put(6, "F");
	map.put(7, "G");
	map.put(8, "H");
	map.put(9, "I");
	map.put(10, "J");
	map.put(11, "K");
	map.put(12, "L");
	map.put(13, "M");
	map.put(14, "N");
	map.put(15, "O");
	map.put(16, "P");
	map.put(17, "Q");
	map.put(18, "R");
	map.put(19, "S");
	map.put(20, "T");
	map.put(21, "U");
	map.put(22, "V");
	map.put(23, "W");
	map.put(24, "X");
	map.put(25, "Y");
	map.put(26, "Z");
	
	Integer test = 14616612;// ADFAL
	String a=test.toString();
	
	for (int i = 0; i < a.length(); i++) {
		char h = a.charAt(i);
		int key = h - '0';
		if (i > 0 && a.charAt(i - 1) == a.charAt(i)) {
			String newKey = String.valueOf(a.charAt(i));
			if ((a.length() > (i + 1)) && Integer.parseInt(newKey.concat(String.valueOf(a.charAt(i + 1)))) < 26) {
				key = Integer.parseInt(newKey.concat(String.valueOf(a.charAt(i + 1))));
				i++;
			}
		}
		if (i == a.length()) {
			break;
		}
		System.out.print(map.get(key));
	}
}
	
	
	
	
	
		
		
		
		
		

		
		
		
		
	}

