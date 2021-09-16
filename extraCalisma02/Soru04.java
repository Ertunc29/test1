package extraCalisma02;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// soru 4:iki tam sayi isteyin ve bu degerleri karsilastiran kodu yazdirin. ilk sayi buyukse "Karadeniz"
		//  ikinci sayi buyukse "Akdeniz" diger durumlar icin "Marmara" yazdirin.
		  
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki tamsayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		if (sayi1>sayi2) {
			System.out.println("Karadeniz");
			
		}else if (sayi1<sayi2) {
			System.out.println("Akdeniz");
			
		} else {
			System.out.println("Marmara");
		}
		
		System.out.println(sayi1>sayi2 ? "karadeniz" : (sayi1<sayi2 ? "akdeniz" : "marmara"));
	}

}
