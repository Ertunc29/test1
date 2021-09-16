package extraCalismaException;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen tamsayi giriniz");
		
		
		int count=1;
		
		while(count<=100) {
			int sayi1=scan.nextInt();
			int sayi2=scan.nextInt();
			
			System.out.println("islem no :"+ count);
			
			
			try {
				System.out.println(sayi1/sayi2);
			}catch(ArithmeticException e) {
				System.out.println("0'a bolemezsin");
			}
			count++;
		}

	}

}
