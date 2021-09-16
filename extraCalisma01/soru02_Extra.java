package extraCalisma01;

import java.util.Scanner;

public class soru02_Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Soru 2: Kullanicidan ismini ve soyismini ve telefon numarasini alarak yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		String isim=scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz");
		String soyisim=scan.next();
		
		System.out.println("Lutfen telefon numaranizi giriniz");
		String telNo=scan.next();
		
		System.out.println("isim-soyisim :" + isim + " " + soyisim + "\nTel numarasi :"+ telNo);
		

	}

}
