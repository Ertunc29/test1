package extraCalisma05;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		
		// bir kelimeyi tersten yazdiran kodu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir String giriniz");
		String str=scan.nextLine();
		
		
		for (int i=0;i<str.length();i++) {
			
			System.out.print(str.substring(str.length()-1-i,str.length()-i));
		}
		System.out.println();
			
		for (int i=str.length();i>0;i--) {
			
			System.out.print(str.charAt(i-1));
		}
		
		
	}

}
