package extraCalismaArrays;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�rnek: Java�da dizi ��elerini tersine �evirme
		
		int i, j, temp;
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
 
        System.out.print("5 Say� Girin :");
 
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
       
        System.out.print("\nTerse �evrilmi� Dizi :");
        for (i = 0; i < 5; i++) {
            System.out.print(" " + arr[i]);
        }
	}

}
