package extraCalismaIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class Iterator04 {

	public static void main(String[] args) {
		
		// 2,13,56,23,45,16,40  20 ile 40 arasinda ki sayilari yazdir 
		
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
		
		
		
		ListIterator li2=sayi.listIterator();
		
		while(li2.hasNext()) {
			
			/*if(li2.nextIndex()<20 || li2.nextIndex()>40) {
				
				li2.remove();
			}*/
			
			int temp=(int) li2.next();
			
			if(temp<20 || temp>40) {
				
				li2.remove();
			}
		}
		
		System.out.println(sayi);
		

	}

}
