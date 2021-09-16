package extraCalismaMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map04 {

	public static void main(String[] args) {
		
		
		Map<Integer, Character> chr= new HashMap<Integer, Character>();
		
		for (int i =20; i <30 ; i++) {
			
			chr.put(i, (char) i);
			
			System.out.print(chr);
			
		}
		
		Set<Integer> ks=chr.keySet();
		
		Iterator<Integer> i=ks.iterator();
		
		while(i.hasNext()) {
			
			Integer key=i.next();
			//System.out.print(key+" ");
			//System.out.print(chr.get(key));
		}

	}

}
