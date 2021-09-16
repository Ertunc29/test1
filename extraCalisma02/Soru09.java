package extraCalisma02;

import java.util.Scanner;

public class Soru09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Soru 8 : Banka hesabinda 1000 tl olan bir kisinin ATM den islem yapmasini saglayan kodu switch case ile yazdirin.
		// 1-Para Cekme, 2-Para Yatirma, 3-Bakiye Sorgulama 4-Kart Iade islem seceneklerini kullanin.
		
		
        Scanner scan = new Scanner(System.in);
        
        int bakiye = 1000;
        int islem,tutar;
        
        System.out.println("Bakiyeniz = " + bakiye);
        System.out.println("\n**** İŞLEMLER ****");
        
        System.out.println("1. Para Çekme");
        System.out.println("2. Para Yatırma");
        System.out.println("3. Bakiye Sorgulama");
        System.out.println("4. Kart İade");
        
        System.out.print("İsleminizi seçiniz: ");
        islem = scan.nextInt();
        
     switch (islem) {
      
     case 1:
    	 System.out.println("bakiyeniz :"+ bakiye);
    	 System.out.println("Lutfen cekmek istediginiz tutari giriniz");
    	 tutar=scan.nextInt();
    	 
    	 if (tutar>1000) {
    		 System.out.println("Yetersiz bakiye");
    	 }else {
    		 bakiye-=tutar;
    		 System.out.println("yeni bakiyeniz :"+ bakiye);
    	 }
    	 break;
    	 
     case 2: 
    	 System.out.println("bakiyeniz :"+ bakiye);
    	 tutar=scan.nextInt();
    	 bakiye+=tutar;
    	 System.out.println("yeni bakiyeniz :"+ bakiye);
    	 break;
    	 
     case 3:
    	 System.out.println("bakiyeniz :"+ bakiye);
    	 break;
    	 
     case 4:
    	 System.out.println("Lutfen kartinizi almayi unutmayiniz");
    	 break;
    	 default:
    		 System.out.println("Lutfen egcerli bir islem seciniz");
    	 
    
     }
	}

}
