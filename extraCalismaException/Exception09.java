package extraCalismaException;

import java.util.Scanner;

public class Exception09 {

	public static void main(String[] args) {
	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		
		
		try {
			
		
		if(yas>=0) {
			System.out.println("girdiginiz yas :"+ yas);
			
		}else {
			
			throw new IllegalArgumentException();
		}
		}catch(IllegalArgumentException e) {
			
			System.out.println("kod calismaya devam etsin");
		}
	}

}
