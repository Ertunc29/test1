package extraCalisma02;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// soru 3 :girilen sicaklik bilgisine gore hava durumunu degerlendiren kodu yaziniz
		// -50 ile 0 arasi " cok soguk"
		//  0 ile 10 arasi "ilik"
		//  10 ile 20 arasi "sicak"
		// diger durumlarda ise "cok sicak yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen sicaklik degerini giriniz");
		int sicaklik=scan.nextInt();
		
		if(sicaklik > -50 && sicaklik < 0) {
			System.out.println("cok soguk");
			
		}else if(sicaklik >0 && sicaklik<10) {
			System.out.println("ilik");
			
		}else if(sicaklik>10 && sicaklik <20 ) {
			System.out.println("sicak");
			
		}else {
			System.out.println("cok sicak");
		}

	}

}
