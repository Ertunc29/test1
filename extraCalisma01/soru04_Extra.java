package extraCalisma01;

import java.util.Scanner;

public class soru04_Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Soru 4: Kullanicidan kullandigi arabanin hizini ve gittigi yolun uzunlugunu isteyin.
		// Yol=Hiz.Zaman formulunu kullanarak mesafeyi ne kadar zamanda aldigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen yolun uzunlugunu giriniz");
		int yol=scan.nextInt();
		
		System.out.println("Lutfen hizinizi giriniz");
		int hiz=scan.nextInt();
		
		 int zaman=yol/hiz;
		 
		 System.out.println("zaman :"+ zaman + " saat");
		 
	}

}
