package extraCalisma05;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		
		// faktoriyel hesabi yapan kodu yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir pozitif tam sayi giriniz");
		int sayi=scan.nextInt();
		int faktoriyel=1;
		
		for(int i=1; i<=sayi; i++) {
			faktoriyel=faktoriyel*i;
			
			
		}
		System.out.println("faktoriyel sonuc : "+ faktoriyel);
		
	}
}
