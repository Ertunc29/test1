package extraCalismaCollections;

import java.util.LinkedList;

public class LinkedList03 {

	public static void main(String[] args) {
		
		
LinkedList<String> li1=new LinkedList<>();
		
		li1.add("A");
		li1.add("B");
		li1.add("C");
		li1.add("X");
		li1.add("Y");
		li1.add("W");
		
		System.out.println(li1);
		
		li1.remove(); // index veya karakter belirtmezsek ilk buldugu elemani siler
		
		System.out.println(li1);
		
		li1.remove("X");
		
		System.out.println(li1); // [B, C, Y, W]
		
		System.out.println(li1.remove(3)); // W
		System.out.println(li1); // [B, C, Y]
		
		li1.clear();
		
		System.out.println(li1); // []
		
		
		
		

	}

}
