package extraCalisma06;

import java.util.Random;
import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// soru : 0 ile 100 arasinda bir sayiyi tahmin etme
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=0;
		int tahmin=-1;
		
		while(sayi!=tahmin) {
			
			System.out.println("lutfen tahmininizi giriniz");
			tahmin=scan.nextInt();
			
			if(tahmin==sayi) {
				System.out.println("dogru tahmin ettiniz");
			}else if(tahmin>sayi) {
				System.out.println("Lutfen tahmininizi azaltiniz");
			}
			
		}
		
		
		

	}

}
