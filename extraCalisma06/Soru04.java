package extraCalisma06;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// While d�ng�s�yle girilen say�dan 1�e kadar, iki�er yazd�ran program.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		while(sayi>=1) {
			
			System.out.print(sayi+" ");
			
			sayi-=2;
		}
			
		
	}

}
