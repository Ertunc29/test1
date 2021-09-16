package extraCalisma03;

import java.util.Scanner;

public class Soru09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kullanicidan 4 harfli bir kelime isteyin. kelime "a" harfi iceriyorsa kelimenin uzunlugunu
		// kelime "e" iceriyorsa kelimeyi buyuk harfle yazdirin
		// diger durumlarda ise kelimeyi tersten yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Lutfen bir kelime giriniz");
		
		
		String kelime=scan.next();
		
		if(kelime.length()==4) {
		
		
		if(kelime.contains("a")) {
			 
			  System.out.println(kelime.length());
			  
			
		}else if (kelime.contains("e")) {
			System.out.println(kelime.toUpperCase());
			
		}else {
			
			System.out.println(kelime.substring(3,4) +kelime.substring(2,3) +kelime.substring(1,2) + kelime.substring(0,1));
		}
		
		}else {
			System.out.println("Lutfen 4 harfli bir kelime giriniz");
		}
	}

}
