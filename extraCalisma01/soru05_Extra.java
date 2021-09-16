package extraCalisma01;

import java.util.Scanner;

public class soru05_Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Soru 5: Kullanicidan evinin kenar uzunluklarini alin ve evin hacmini hesaplayan
		// kodu yazdirin. hacim=genislik.uzunluk.yukseklik 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen evinizin genisligini giriniz");
		double genislik=scan.nextDouble();
		
		System.out.println("Lutfen evinizin uzunlugunu giriniz");
		double uzunluk=scan.nextDouble();
		
		System.out.println("Lutfen evinizin yuksekligini giriniz");
        double yukseklik=scan.nextDouble();
        
        System.out.println("evinizin hacmi :"+ genislik*uzunluk*yukseklik + " metre kup");
	}

}
