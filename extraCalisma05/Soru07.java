package extraCalisma05;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
		
		/* asagidaki sekli yazdiran kodu yaziniz
		 
		  *
		  * *
		  * * *
		  * * * *
		  * * * * *
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir rakam giriniz");
        int rakam=scan.nextInt();
        
    
       for(int satirNo=1;satirNo<=rakam;satirNo++) {
    	   
    	   for(int i=1; i<=satirNo;i++) {
    		   System.out.print("* ");
    		   
    		   
    		   
    	   }
    	   System.out.println();
       }
        
		
		
	}

}
