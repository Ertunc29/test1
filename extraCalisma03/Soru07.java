package extraCalisma03;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Kullan�c�dan bir ad yazmas�n� isteyin,

       ad�n�n uzunlu�u 3 olmal�d�r.

       Ard�ndan, ad�n ayn� karakterlere sahip olup olmad���n� kontrol edin.

       Dize ayn� karakterlere sahipse

       Yazd�r �Dize �ift karakterler i�eriyor�
       Ba�ka

       Yazd�r �Dizenin benzersiz karakterleri var�

       L�tfen ��l� kullan�n.


       Giri� :

        ala

       ��kt�:

       Dize yinelenen karakterler i�eriyor
		 
		 
		
		
      
		
		
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
