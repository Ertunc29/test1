package extraCalisma02;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Soru 6: Bu firma 2 adet servis paketi sunuyor ve herhangi bir paketi alabilmek
		için müþterinin bütçesinin en az 1500 TL olmasý gerekiyor. Müþterinin bütçesi 1500 ile 2500 TL
		arasýnda ise A pakedini, 2500 TL ve daha fazla ise hem daha düþük tutarda olan A paketini 
		hem de bir üst paket olan B paketini alabiliyor. diger durumlarda ise butce yetersiz sonucunu veren kodu yaziniz 
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen butcenizi giriniz");
		int butce=scan.nextInt();
		
		if (butce>=1500) {
			if (butce>=1500 && butce <2500) {
				System.out.println("A paketi");
				
			} else if (butce>=2500) {
				System.out.println("A paketi veya B paketi ");
				
			}
			
		}else {
			System.out.println("Butceniz yetersiz ");
		}

	}

}
