package extraCalisma04;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// soru : kullanicidan kac sayi toplamak istedigini sorun 
		// kullanici 2,3veya4 deger girerse kullanicidan bu sayilari girmesini isteyin 
		// ve sayilari toplayin. kullanici 4'ten fazla sayi girerse 
		// "cok sayi girdiniz toplayamam yazdirin"
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen toplamak istediginiz sayi adedini giriniz");
		int sayiAdedi=scan.nextInt();
		
		if (sayiAdedi<2) {
			System.out.println("Lutfen en az iki tamsayi giriniz");
			
		}else if(sayiAdedi==2) {
			ikiSayiTopla();
			
		}else if(sayiAdedi==3) {
			ucSayiTopla();
			
		}else if(sayiAdedi==4) {
			dortSayiTopla();
			
		}else {
			System.out.println("cok fazla sayi girdiniz ben toplayamam");
		}

	}

	private static void dortSayiTopla() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dort tam sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		int sayi4=scan.nextInt();
		System.out.println(sayi1+sayi2+sayi3+sayi4);
		
	}

	private static void ucSayiTopla() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen uc tam sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		System.out.println(sayi1+sayi2+sayi3);
		
	}

	private static void ikiSayiTopla() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki tam sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		System.out.println(sayi1+sayi2);
		
	}

}
