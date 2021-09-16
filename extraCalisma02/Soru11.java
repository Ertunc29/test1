package extraCalisma02;

import java.util.Scanner;

public class Soru11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Soru 1: Gecme notunun 50 oldugu bir okulda ogrencinin gecti-kaldi
				// bilgisini veren kodu ternary yontemi ile yaziniz.
				
				 Scanner scan = new Scanner(System.in);
				 System.out.println("Lutfen notunuzu giriniz");
				 int not=scan.nextInt();
				 
				 System.out.println(not>=50 ?  "basariyla gectiniz " : "Maalesef kaldiniz");

	}

}
