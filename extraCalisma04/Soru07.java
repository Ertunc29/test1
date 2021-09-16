package extraCalisma04;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti 
          numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak 
          sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde 
          duzelten 2 method yazin, ve programda kullanabilmek icin duzenlenmis hallerini 
          geri dondurun
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim=scan.next();
		System.out.println("lutfen soyisminizi giriniz");
		String soyIsim=scan.next();
		System.out.println("Lutfen kart numaranizi giriniz");
		String kkNo=scan.next();
		
		isim=isimDuzenleme(isim);
        soyIsim=soyisimDuzenleme(soyIsim);
	    kkNo=kkNoDuzenleme(kkNo);
	    
	    System.out.println(isim + " "+ soyIsim + "\n" +kkNo);
		
	}

	private static String kkNoDuzenleme(String kkNo) {
		
		kkNo=kkNo.substring(0,4) + " " + kkNo.substring(4,8)+ " " + kkNo.substring(8,12)+ " " + kkNo.substring(12);
		return kkNo;
	}

	private static String soyisimDuzenleme(String soyIsim) {
		
		soyIsim=soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1).toLowerCase();
		return soyIsim;
	}

	private static String isimDuzenleme(String isim) {
		
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
		return isim;
	}

}
