package extraCalisma02;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// soru 5: kullanicidan 3 sayi isteyin ve sayilardan en kucuk olani ekrana yazdiran kodu yaziniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen uc tam sayi giriniz");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int enKucukSayi;
		
		if (a<b) {
			if(a<c) {
				enKucukSayi=a;
				System.out.println("en kucuk sayi :" + enKucukSayi);
				
			}else if (b<c) {
				enKucukSayi=b;
				System.out.println("en kucuk sayi :" + enKucukSayi);
				
		}
			
		}
		
		else {
			
		    enKucukSayi=c;
			System.out.println("en kucuk sayi :" + enKucukSayi);
			
		}
			
	}

}
