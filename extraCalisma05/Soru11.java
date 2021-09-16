package extraCalisma05;

import java.util.Scanner;

public class Soru11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir metin giriniz"); 
		
		  String metin =scan.nextLine();
		  
	       char karakter =scan.next().charAt(0);
	        int tane = 0;
	 
	        for(int i = 0; i < metin.length(); i++) {
	            if(karakter == metin.charAt(i)) {
	                tane++;
	            }
	        }
	 
	        System.out.println( karakter + " yazý içinde  " + tane +" tanedir");

	}

}
