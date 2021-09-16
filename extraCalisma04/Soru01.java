package extraCalisma04;

public class Soru01 {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		toplama(7,8); // 15
		// cikarma(0, 0);
		// carpma(0,0);
		

		System.out.println("toplama islemi sonucu :"+ toplama(0,6)); //6
		
		// System.out.println("cikarma islemi sonucu :"+ cikarma(10,8));
		
		//System.out.println("carpma islemi sonucu :" + carpma(7,3));

	}
	
	
	

	private static int toplama(int sayi1, int sayi2) {
		
		// TODO Auto-generated method stub
		System.out.println("method calisti");
		int sonuc=sayi1 +sayi2;
		
		System.out.println(sonuc);
		
		return sonuc;
	}



	private static int carpma(int sayi1, int sayi2) {
		// TODO Auto-generated method stub
		
		int sonuc=sayi1*sayi2;
		return sonuc;
	}


	private static int cikarma(int sayi1, int sayi2) {
		
		int sonuc=sayi1-sayi2;
		return sonuc;
		
	}

	
}
