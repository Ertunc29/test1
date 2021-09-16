package wxtraCalismaCollectionsSet;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	

	public static void main(String[] args) {
		
		
		Queue<String> q1=new PriorityQueue<>();
		
		
		
		q1.add("A");
	    q1.add("B");
	    q1.add("T");
	    q1.add("V");
	    q1.add("C");
	    q1.add("D");
	    
	    System.out.println(q1); // [A, B, D, V, C, T]
	    
	    
	    Queue<String> q2=new LinkedList<>();
	    
	    q2.add("A");
	    q2.add("B");
	    q2.add("T");
	    q2.add("V");
	    q2.add("C");
	    q2.add("D");
	    
	    System.out.println(q2); // [A, B, T, V, C, D]
	    
	  //  q1.clear();
	   //System.out.println(q1); // System.out.println();
	    
	   // q1.element(); // eger eleman yoksa exception dondurur
	    //System.out.println(q1);
	    
	    
	   // System.out.println(q1.peek()); // ilk elemani silmeden bize dondurur
	   // System.out.println(q1);
	    
	    
	   // System.out.println(q1.poll()); // A
	  // System.out.println(q1); // [B, C, D, V, T]
	    
	   q1.offer("X"); // Eleman ekliyor
	   q1.offer("J");
	   System.out.println(q1);
	   
	  
	    
		
		

	}

}
