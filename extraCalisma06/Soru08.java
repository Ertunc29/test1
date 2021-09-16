package extraCalisma06;

import java.util.Scanner;

public class Soru08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Girilen sayýnýn kaç basamaklý olduðunu bulan program.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		
		int basamak=0;
		
		while (sayi!=0) {
			
			sayi/=10;
			basamak++;
			
		}
		System.out.println("girdiginiz sayi " + basamak + " basamaklidir");
		
		
		
		
	}

}
