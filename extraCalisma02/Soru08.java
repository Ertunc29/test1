package extraCalisma02;

import java.util.Scanner;

public class Soru08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		// soru 8 : Sectiginiz 5 farkli il plakasini yazin ve plakaya ait ilin ismini veren kodu switch case ile yazdirin.
		
		 Scanner scan = new Scanner(System.in);

	        System.out.print("12-17-21-22-23 plakalarýndan birini yaz: ");
	        int plaka = scan.nextInt();

	      switch (plaka) {
	      
	      case 12 :
	    	  System.out.println("Bingol");
	    	  break;
	    	  
	      case 17 :
	    	  System.out.println("Canakkale");
	    	  break;
	    	  
	      case 21 :
	    	  System.out.println("Diyarbakir");
	    	  break;
	    	  
	      case 22 : 
	    	  System.out.println("Edirne");
	    	  break;
	    	  
	      case 23 :
	    	  System.out.println("Elazig");
	    	  break;
	    	  
	    	  default:
	    		  System.out.println("Gecersiz plaka kodu");
	    	  
	    	  
	    
	      }

	}

}
