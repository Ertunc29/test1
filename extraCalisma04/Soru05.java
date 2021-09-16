package extraCalisma04;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// soru : kullanicidan bir sayi isteyin ve bu sayinin tek mi cifti mi oldugunu yazdirin
		// soru : negatif mi pozitif mi oldugunu yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		//tekMiCiftMi(sayi);
       pozitifMiNegatifMi(sayi);
       // basamakYazdir(sayi);
	}

	private static void basamakYazdir(int sayi) {
		
		
	}

	private static void pozitifMiNegatifMi(int sayi) {
		
		if(sayi>0) {
			System.out.println("girdiginiz sayi pozitif");
		}else if(sayi<0) {
			System.out.println("girdiginiz sayi negatif");
		}else {
			System.out.println("girdiginiz sayi 0");
		}
		
	}

	private static void tekMiCiftMi(int sayi) {
		
		if(sayi%2==0) {
			System.out.println("girdiginiz sayi cift sayidir");
		
	}else {
		System.out.println("girdiginiz sayi tek sayidir");
	}

	}

}
