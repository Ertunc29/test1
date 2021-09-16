package extraCalisma01;

import java.util.Scanner;

public class soru06_Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Soru 6: Kullanicidan JDK yazdirmak icin uc kelime isteyin ve JDK yazdiran kodu yaziniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen J, D ve K harfleriyle baslayan uc kelime giriniz");
		
		char kelime1=scan.next().toUpperCase().charAt(2);
		char kelime2=scan.next().toUpperCase().charAt(3);
		char kelime3=scan.next().toUpperCase().charAt(1);
		
		
		System.out.println((kelime1)+""+(kelime2)+""+(kelime3));

	}

}
