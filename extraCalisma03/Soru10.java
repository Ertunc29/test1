package extraCalisma03;

import java.util.Scanner;

public class Soru10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kullanicidan bir isim isteyin ve son 2 harfinin 3 kopyasindan olusan yeni bir string yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime=scan.next();
		
		int i=kelime.length();
		
		String kelime1=kelime.substring(i-2,i);
		System.out.println("String :"+ kelime1+kelime1+kelime1);
		System.out.println("String :"+ kelime1.concat(kelime1.concat(kelime1)));
			 
			
		

	}

}
