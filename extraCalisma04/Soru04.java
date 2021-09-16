package extraCalisma04;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// bir isim girin son 2 karakterini alin ve 3 kopya ile yeni bir String olusturun
		
	     
		sonIki(null);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir isim giriniz");
		String isim=scan.next();
		
		
		
		
	}

	        private static void sonIki(String isim) {
	        	
	        	
	        	
	           int i=isim.length();
	           
	           String isim1=isim.substring(i-2,i);
	           
	           System.out.println(isim1+isim1+isim1);
		
		
	}

}
