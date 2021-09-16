package extraCalisma05;

import java.util.Scanner;





public class Soru06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir String giriniz");
		String kelime=scan.nextLine();
		String terstenKelime="";
		
		for(int i=0;i<kelime.length();i++) {
			
			terstenKelime+=kelime.substring(kelime.length()-1-i,kelime.length()-i); // +'ya dikkat
			
			
			
			
		}
		System.out.println(terstenKelime);
		

	}
	

}
