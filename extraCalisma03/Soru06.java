package extraCalisma03;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	  /*  Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki 
		  kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		- Girilen kelime cumlede kullanilmamis.
		- Girilen kelime cumlede 1 kere kullanilmis.
		- Girilen kelime cumlede 1’den fazla kullanilmis.
		
		*/
		
		
		
	/*	Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen bir kelime giriniz");
		String kelime=scan.next().toLowerCase();
		
		if(cumle.indexOf(kelime)==-1) {
			System.out.println("kelime cumlede kullanilmamis");
			
		}else if(cumle.indexOf(kelime)==cumle.lastIndexOf(kelime)) {
			System.out.println("kelime cumlede birkez kullanilmis");
			
		}else {
			System.out.println("Kelime cumlede birden fazla kullanilmis");
			
		}
		
		*/
		
		
		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		System.out.println("lutfen bir kelime giriniz");
		String kelime=scan.next().toLowerCase();
		
	
		if(cumle.indexOf(kelime)==-1) {
			System.out.println("girdiginiz kelime cumlede kullanilmamis");
			
		}else if (cumle.indexOf(kelime)==cumle.lastIndexOf(kelime)) {
			System.out.println("kelime bir kez kullanilmis");
		}else {
			System.out.println("kelime cumlede birden fazla kullanilmis");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
