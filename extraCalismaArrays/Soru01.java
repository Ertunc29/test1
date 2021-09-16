package extraCalismaArrays;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Örnek: Bu programda, Java’daki dizi öðelerinin toplamýný nasýl bulacaðýnýzý yazin
		
		
		int arr[]=new int[5];
		
		int toplam=0;
		
		Scanner scan=new Scanner(System.in);
		
		 System.out.println("Lutfen 5 sayi giriniz");
		 
		 for (int i=0; i<5;i++) {
			 
			 arr[i]=scan.nextInt();
			 
		 }
		 
    for (int j=0;j<5;j++) {
    	
    	toplam+=arr[j];
    	
    }
    System.out.println(toplam);
	}

}
