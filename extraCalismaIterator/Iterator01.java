package extraCalismaIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		System.out.println(list);
		
		for (int i = 0; i < list.size()-1; i++) {
			
			System.out.println(list.get(i)+ " + ");
			
		}
		System.out.println();
		System.out.println(list);
		
		
		for (String each : list) {
			
			each+="K";
			
			System.out.print(each+ " ");
			
		}
		System.out.println();
		System.out.println(list);
		
		
		Iterator it1=list.iterator();
		
		while(it1.hasNext()) {
			
			it1.next();
			it1.remove();
		}
		
		System.out.println(list);

	}

}
