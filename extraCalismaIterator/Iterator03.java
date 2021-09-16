package extraCalismaIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator03 {

	public static void main(String[] args) {
		
		ArrayList<String> calisan=new ArrayList<>();
		
		calisan.add("ahmet");
		calisan.add("ebru");
		calisan.add("sahin");
		calisan.add("seval");
		calisan.add("sinan");
		
		ListIterator<String> it2=calisan.listIterator();
		
		while(it2.hasNext()) {
			
	          System.out.println(it2.next());
			}
		
		System.out.println();
		while(it2.hasPrevious()) {
			
			System.out.println(it2.previous());
		}
		

	}

}
