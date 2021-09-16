package extraCalisma06;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// While döngüsü ile girilen sayýdan 0’a kadar olan sayýlarýn toplamýný hesaplayan program.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
	    int sayi=scan.nextInt();
	    int toplam=0;
	    
	      while (sayi>=0) {
		  
		  toplam+=sayi;
		  
		  sayi--;
		  
		  
	  }
	 
	      System.out.print(toplam+" ");
	  
	    
	
	}

}
