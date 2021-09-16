package extraCalisma06;

public class Soru13 {

	public static void main(String[] args) {
		// carpim tablosu olustur
		
		String baslik="CARPIM TABLOSU";
		int sayi1=2;
		int sayi2=1;
		int sonuc;
	
		System.out.println(baslik +" " + sayi1 +"'ler");
		
		do {
			
			sonuc=sayi1*sayi2;
			System.out.println(sayi2 + ".satir" + sayi1 +"x" + sayi2 + "=" +sonuc);
			sayi2++;
			
		}while(sayi2<=9);

	}

}
