package extraCalisma03;

import java.util.Scanner;

public class Soru08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// kullanicidan bir cumle isteyin eger cumle "a" ile basliyorsa cumleyi bosluksuz yazdirin
		// eger cumle "m" ile bitiyorsa "**** ***** *****" seklinde yazdirin.
		// diger durumlarda ise "123cumle" olacak sekilde yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		
		if(cumle.startsWith("a")) {
			System.out.println(cumle.replaceAll("\\s", ""));
			
		}else if(cumle.endsWith("m")) {
			System.out.println(cumle.replaceAll("\\S", "*"));
			
		}else {
			System.out.println(cumle.replaceFirst("", "123"));
		}

	}

}
