package extraCalisma06;

import java.util.Scanner;

public class Soru14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Soru 6 ) Kullanicidan toplamak icin sayi isteyin ve toplam 500’e ulasincaya kadar  
		// istemeyi devam ettirin. Toplam 500’e ulastiginda veya gectiginde toplami ve kac sayi 
		//girildigini yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen sayi giriniz");
		int sayi;
		int toplam=0;
		int sayac=0;
		
		do {
			
			sayi=scan.nextInt();
			toplam+=sayi;
			sayi++;
			sayac++;
		}while(toplam<500);
		
		
		System.out.println("girdiginiz "+ sayac + " tane sayinin toplami :" + toplam);
		


	}

}
