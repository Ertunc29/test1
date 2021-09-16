package extraCalisma04;

public class Soru02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		toplama(0, 0);
		toplama(0, 0);
		toplama2(8.5, 3);
		
		        int tamSayi = toplama(5, 6);
		        System.out.println("5 + 6 = " + tamSayi);
		 
		        double kusurluSayi = toplama(5.5, 6.5);
		        System.out.println("5.5 + 6.5 = " + kusurluSayi);
		    }

	

	private static void toplama2(double i, int j) {
		// TODO Auto-generated method stub
		
		System.out.println(i+j);
		
	}



	public static int toplama(int sayi1,int sayi2) {
		 int sonuc = sayi1 + sayi2;
	        return sonuc;
		
	}

	public static double toplama(double sayi1, double sayi2) {
		double sonuc = sayi1 + sayi2;
        return sonuc;
		
	}

}
