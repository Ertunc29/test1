package extraCalismaIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Iterator06 {

	public static void main(String[] args) {
		
		
		 ArrayList<Integer> sayi=new ArrayList<>();
			
			sayi.add(2);
			sayi.add(13);
			sayi.add(56);
			sayi.add(23);
			sayi.add(45);
			sayi.add(16);
			sayi.add(40);
			sayi.add(20);
			
			Collections.sort(sayi);
			
			System.out.println(sayi);
			
			ListIterator li2=sayi.listIterator(2);
			
			while(li2.hasNext()) {
				
				System.out.print(li2.next()+" ");
			}


	}

}
