package extraCalisma06;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// While döngüsü ile sayýnýn faktöriyelini hesaplama programý.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int faktoriyel=1; 
		int sayi=scan.nextInt();
		
//	   while(sayi>=1) {
//		   faktoriyel*=sayi;
//		   
//		   sayi--;
//		   
//		   
//	   }
//	   System.out.println("faktoriyel sonuc :" + faktoriyel);
		
		
		do {
			
			faktoriyel*=sayi;
			sayi--;
		}while(sayi>=1);
		System.out.println("faktoriyel sonuc :" + faktoriyel);
	}
}
