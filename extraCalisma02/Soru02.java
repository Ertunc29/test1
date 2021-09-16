package extraCalisma02;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  soru 2:kullanicidan kullanici adi ve sifresini isteyin. verilen bilgiler dogru ise "Lutfen kullanici adinizi giriniz"
		// yanlis ise "Kullanici adi veya sifre yanlis" yazdirin.
		
		Scanner scan=new Scanner(System.in);
		String username="Javaogreniyorum" , password="Java1234";
		
		System.out.println("Lutfen kullanici adinizi giriniz");
	    String kullanici_adi=scan.next();
	    
	    
	    System.out.println("Lutfen sifrenizi giriniz");
	    String sifre=scan.next();
	    
	    
	    if (username.equals(kullanici_adi) && password.equals(sifre)) {
	    	System.out.println("Basarili sekilde giris yaptiniz");
	    	
	    }else {
	    	System.out.println("Kullanici adi veya sifre hatali");
	    	
	    }
	    
	    
	}

}
