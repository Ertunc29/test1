package extraCalisma03;

import java.util.Scanner;

public class soruuu {

	public static void main(String[] args) {
		 
		
		 // kullanici bir sayi girmesini isteyin. sayi 100 den buyukse; 100 ve 150 arasi icin hello ,
		// 150 den buyukse hi yazdirin. 100 den kucukse ne haber yazdirin. diger durumlar icin offf yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		if (sayi>100) {
			
			if(sayi>=100 && sayi <=150) {
				System.out.println("hello");
				
			}else if(sayi>150) {
				System.out.println("hi");
			}
		}else {
			System.out.println("offfff");
			
			
		}

	}

}
