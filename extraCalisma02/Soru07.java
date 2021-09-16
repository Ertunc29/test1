package extraCalisma02;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// soru 7 :kullanicidan iki tamsayi isteyin ve  toplama, cikarma, carpma ve bolme islemlerinden birisini
		// secerek islem yaptiran kodu yaziniz. 
		
		Scanner scan=new Scanner(System.in);
		int sayi1, sayi2, secim, sonuc;
		System.out.println("1-Toplama" + "\n2-Cikarma" + "\n3-Carpma" + "\n4-Bolme");
		System.out.println("Lutfen isleminizi secin");
		secim=scan.nextInt();
		
		if(secim==1 || secim==2 || secim==3 || secim==4) {
			
		System.out.println("Lutfen iki tam sayi giriniz");
		sayi1=scan.nextInt();
		sayi2=scan.nextInt();
		
		if(secim==1) {
			sonuc=sayi1+sayi2;
			System.out.println("toplama isleminin sonucu :"+ sonuc);
			
		}else if (secim==2) {
			sonuc=sayi1-sayi2;
			System.out.println("cikarma isleminin sonucu :"+ sonuc);
			
		}else if(secim==3) {
			sonuc=sayi1*sayi2;
			System.out.println("carpma isleminin sonucu :"+ sonuc);
			
		}else if (secim==4) {
			sonuc=sayi1/sayi2;
			System.out.println("bolme isleminin sonucu :"+ sonuc);
			
		}
		
		}else {
			System.out.println("Lutfen gecerli bir secim kodu giriniz");
		}
		
	}

}
