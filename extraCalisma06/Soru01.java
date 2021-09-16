package extraCalisma06;

public class Soru01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Soru 1 ) While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz.
		
		/*int sayi=1;
		int sonuc=0;
		
		while(!(sonuc>=13)) {
			
			sonuc=2*sayi+1;
			
			sayi++;
			System.out.print(sonuc+" ");
			
		}
		*/
		
		System.out.println();
		
		int sayi1=3;
		
		while(sayi1<=13) {
			if(sayi1%2==1) {
				System.out.print(sayi1+" ");
			}
			sayi1++;
		}
		
		System.out.println();
		int sayi=1;
		int sonuc=0;
		
		do {
			
	    sonuc=2*sayi+1;
		sayi++;
		System.out.print(sonuc+" ");
			
		}while(!(sonuc>=13));
		

	}

}
