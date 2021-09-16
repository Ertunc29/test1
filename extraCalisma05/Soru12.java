package extraCalisma05;

import java.util.Scanner;

public class Soru12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Bir Sayý Girin:");
	 
	        int sayi = scan.nextInt();
	        int toplam = 0;
	 
	        for(int i = 1; i <= sayi; ++i)
	        {
	            toplam += i;
	        }
	 
	        System.out.println("Sayýlarýn Toplamý = " + toplam);

	}

}
