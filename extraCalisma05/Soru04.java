package extraCalisma05;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		
		// 100 den kucuk 3 ve 5 in kati olan sayilari yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 100'dem kucuk bir tam sayi giriniz");
		int sayi=scan.nextInt();
	  
		
		if (sayi<100 && sayi>=0) {
			
		
	    for (int i=0;i<=sayi ;i++) {
	    	
	    	if(i%3==0 && i%5==0) {
	    		
	    		System.out.print(i+" ");
	    		
	    		
	    	}
	    }
		}else {
			System.out.println("Girdiginiz sayi istenilen aralikta degil");
		}
		
			
	}

}
