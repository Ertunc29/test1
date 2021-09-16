package wxtraCalismaCollectionsSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet01 {

	public static void main(String[] args) {
		
		
		Set<String> set1= new HashSet<>();
		
		set1.add("S");
		set1.add("A");
		set1.add("B");
		set1.add("M");
		set1.add("T");
		set1.add("C");
		set1.add("S");
		
		System.out.println(set1); // [A, B, C, S, T, M]
		                          // S tekrar eklenince [A, B, S, C, T, M]
		
	/*	
		set1.add("A");
		
		System.out.println(set1.hashCode()); // 65
		set1.add("B");
		System.out.println(set1.hashCode()); // 131
		set1.add("C");
		System.out.println(set1.hashCode()); // 198
		set1.add("D");
		System.out.println(set1.hashCode()); // 266
		set1.add("Si");
		System.out.println(set1.hashCode()); // 2944
	*/	
		Set<String> set2= new HashSet<>();
		
		set2.add("A");
		set2.add("B");
		set2.add("K");
		set2.add("F");
		
		System.out.println(set2); // [A, B, F, K]
		set1.contains("A"); // A
		System.out.println(set1.contains("A")); // true
		
		System.out.println(set1.containsAll(set2)); // false
		
		//set1.remove("A");
		System.out.println(set1);
		
		//set1.removeAll(set2); // ortak elemanlari sil farkli olanlari tut
		System.out.println(set1); // [S, C, T, M]
		
		set1.retainAll(set2);
		
		System.out.println(set1); // [] // ortak elemanlari tut farkli elemanlari sil 
		System.out.println(set2); // [A, B, F, K]
	}

}
