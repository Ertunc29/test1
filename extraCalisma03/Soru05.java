package extraCalisma03;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//  Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup 
		//  olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.next();
		
		System.out.println("Lutfen bir harf giriniz");
		char harf=scan.next().charAt(0);
		
		if (cumle.indexOf(harf)==-1) {
			 System.out.println("maalesef harf yok");
			
			
		}else {
			System.out.println("evet harf var");
		}
		
	}

}
