package extraCalismaIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {

	public static void main(String[] args) {
		
		
      List<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		System.out.println(list);
		
		ListIterator li1=list.listIterator();
		
		while(li1.hasNext()) {
			
			li1.set(li1.next()+"B");
			
		
		}
		System.out.println(list);
		
		
		

	}

}
