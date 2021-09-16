package extraCalisma05;

import java.util.Scanner;

public class Soru13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("carpmak icin bir sayi giriniz");
		int sayi=scan.nextInt();
		
		for(int i=1;i<=sayi;i++) {
			
			System.out.println(sayi+" * "+i+" = "+sayi*i);
		}

	}

}
