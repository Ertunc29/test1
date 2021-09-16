package extraCalisma06;

public class Soru02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Soru 2 ) For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam 
		// bolunebilen sayilari yazdirin. 
		
	   /*	for (int sayi=100; sayi<=999;sayi++) {
			if(sayi%15==0 && sayi%20==0 && sayi%90==0) {
				System.out.print(sayi+" ");
			}
			
			*/
		
		  // int sayi=100;
		   
//		     while(sayi<1000) {
//			   
//			   if(sayi%15==0 && sayi%20==0 && sayi%90==0) {
//				   
//				   System.out.print(sayi+" ");
//				   
//			   }
//			   sayi++;
//		   } 
		    
		   
		   System.out.println();
		   
		   int sayi=100;
		   
		    do {
		    	 if(sayi%15==0 && sayi%20==0 && sayi%90==0) {
					   
					   System.out.print(sayi+" ");
		    	
		    }
		    	 sayi++;
		
	}while(sayi<1000);
		    
	}
}
