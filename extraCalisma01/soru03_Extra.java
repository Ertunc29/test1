package extraCalisma01;

import java.util.Scanner;

public class soru03_Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// SOru 3: kullanicidan bir eskenar ucgenin kenar uzunluklarini isteyin ve 
		// ucgenin cevre uzunlugunu hesaplayan kodu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen eskenar ucgenin bir kenar uzunlugunu giriniz");
		double kenar=scan.nextDouble();
		
		double ucgenCevre=kenar*3;
		
		System.out.println("ucgenin cevresi:" +ucgenCevre);
		
		System.out.println("ucgenin cevresi:"+ kenar*3);

	}

}
