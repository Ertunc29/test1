package extraCalismaArrays;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		
		// Örnek: Java’da dizideki çift ve tek öðeler nasýl bulunur?
				
			Scanner scan=new Scanner(System.in);
			
			int arr[]=new int[5];
			
		System.out.println("Lutfen 5 sayi giriniz");
		
		for(int i=0;i<5;i++) {
			
			arr[i]=scan.nextInt();
			
			
			
		}
		 
		for(int i=0; i<5;i++) {
			
			if (arr[i]%2==0) {
				
				System.out.print(+ arr[i]+" ");
			
			}
			
			
		}
		System.out.println();
		
		for(int i=0; i<5;i++) {
			
			if(arr[i]%2!=0) {
				System.out.print(+arr[i]+" ");
				
			}
			
		}



	}

}
