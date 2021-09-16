package extraCalismaCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedList01 {

	public static void main(String[] args) {
		
		
		List<String> list= new ArrayList<>();
		
		list.add("A");
		list.add("B");
		
		// Queue<String> list1= new LinkedList<>();
		
		
		
		
		LinkedList<String> li1=new LinkedList<>();
		
		li1.add("A");
		li1.add("B");
		li1.add("C");
		
		System.out.println(li1); //  [A, B, C]
		
		li1.add("Z");
		li1.add("K");
		
		System.out.println(li1);
		
		li1.add(1, "T");
		
		System.out.println(li1); // [A, T, B, C, Z, K]
		
		li1.addAll(list);
		
		System.out.println(li1); // [A, T, B, C, Z, K, A, B]
		
		li1.addFirst("A");
		
		System.out.println(li1); // [A, A, T, B, C, Z, K, A, B]
		
		
		

	}

}
