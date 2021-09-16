package extraCalisma04;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		
		int sayi=1234;
		int tersi=0;
		
		
		while(sayi!=0) {
			int basamak=sayi%10;
			tersi=tersi*10+basamak;
			sayi/=10;
			
		}

		System.out.println("Sayinin tersi :"+ tersi);
 

	}
}

