package extraCalismaArrays;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Örnek: Java’da dizi öðelerini tersine çevirme
		
		int i, j, temp;
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
 
        System.out.print("5 Sayý Girin :");
 
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
 
        j = 5 - 1;
        for (i = 0; i < j; i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
       
        System.out.print("\nTerse Çevrilmiþ Dizi :");
        for (i = 0; i < 5; i++) {
            System.out.print(" " + arr[i]);
        }
	}

}
