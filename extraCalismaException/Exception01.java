package extraCalismaException;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		
		Exception01 exp=new Exception01();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen tamsayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		try {
		System.out.println(sayi1/sayi2);
		
		}catch (ArithmeticException e) {
			System.out.println("0'a bolemezsin");
			
			e.printStackTrace();
			
			System.out.println(e.getMessage());
			
			
			
		}
		
		
		System.out.println("kod calisti");
	}
}
