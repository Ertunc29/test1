package extraCalisma01;

import java.util.Scanner;

public class soru01_Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Soru 1: Kullanicidan iki tam sayi isteyin ve iki kare farki ozdesligini olusturan programi yazdirin
		// iki kare farki ozdesligi= (a*a)-(b*b)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki tam sayi giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
        int ikiKareFarki=sayi1*sayi1-sayi2*sayi2; // 1.yontem
		
		System.out.println("sonuc :"+ ikiKareFarki);
		
		
		System.out.println(" sonuc :"+ (sayi1*sayi1-sayi2*sayi2));// 2. yontem

	}

}
