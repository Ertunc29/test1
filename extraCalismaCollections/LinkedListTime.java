package extraCalismaCollections;

import java.util.LinkedList;

public class LinkedListTime {

	public static void main(String[] args) {
		
		
         LinkedList<String> li1=new LinkedList<>();
		
         System.out.println(System.currentTimeMillis());
         
         for (int i = 0; i < 10000; i++) {
        	 
        	 li1.add("A"+i);
     		li1.add("B"+i);
     		li1.add("C"+i);
			
		}
         System.out.println(System.currentTimeMillis());
         
         System.out.println("==========================================");
         LinkedList<Object> li2=new LinkedList<>();
         
         System.out.println(System.currentTimeMillis());
         
         for (int i = 0; i < 10000; i++) {
        	 
        	 li2.add("A"+i);
      		li2.add(25+i);
      		li2.add('C'+i);
			
		}
         System.out.println(System.currentTimeMillis());
 		

	}

}
