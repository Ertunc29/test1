package extraCalisma02;

import java.util.Scanner;

public class Soru12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// soru 4:iki tam sayi isteyin ve bu degerleri karsilastiran kodu yazdirin. ilk sayi buyukse "Karadeniz"
				//  ikinci sayi buyukse "Akdeniz" diger durumlar icin "Marmara" yazdirin.
				
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki tamsayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		System.out.println(sayi1>sayi2 ? "Karadeniz" :  sayi1<sayi2 ? "Akdeniz" : "Marmara");
				 
				

	}

}
