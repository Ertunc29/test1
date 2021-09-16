package extraCalismaException;

import java.util.Scanner;

public class Ehliyet {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		
		int yas=scan.nextInt();
		
		 
		if(yas<0) {
			
			throw new IllegalArgumentException();
			
		}else if(yas<18) {
			
			throw new IllegalArgumentException();
			
		}else {
			
			System.out.println("ehliyet alabilirsin");
		}

	}

}
