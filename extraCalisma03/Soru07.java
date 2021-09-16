package extraCalisma03;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Kullanýcýdan bir ad yazmasýný isteyin,

       adýnýn uzunluðu 3 olmalýdýr.

       Ardýndan, adýn ayný karakterlere sahip olup olmadýðýný kontrol edin.

       Dize ayný karakterlere sahipse

       Yazdýr “Dize çift karakterler içeriyor”
       Baþka

       Yazdýr “Dizenin benzersiz karakterleri var”

       Lütfen üçlü kullanýn.


       Giriþ :

        ala

       Çýktý:

       Dize yinelenen karakterler içeriyor
		 
		 
		
		
      
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen uc harflik bir isim giriniz");
		String isim=scan.next();
	
		
		
		if(isim.substring(0,1)==isim.substring(1,2)|| isim.substring(1,2)==isim.substring(2,3)
				|| isim.substring(0,1)==isim.substring(2,3)) {
			
			System.out.println("Dizenin yinelenen karakterleri var");
			
			}else {
				System.out.println("Dizenin benzersiz karakterleri var");
				
			}
			
			*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen uc harflik bir isim giriniz");
		String isim=scan.next();
		
		if(isim.substring(0,1).equals(isim.substring(1, 2)) || isim.substring(0, 1).equals(isim.substring(2, 3)) ||
				isim.substring(1,2).equals(isim.substring(2, 3))) {
			System.out.println("benzer harfler var");
			
		}else {
			System.out.println("benzersiz harfler var");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
