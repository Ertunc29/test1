package extraCalisma01;

import java.util.Scanner;

public class flag_Calismasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen ay ismini giriniz");
		
		String ayIsmi=scan.next().toLowerCase();
		
		//flag kullanimi
		int i=0;
		
		if(ayIsmi.equals("Ocak") || ayIsmi.equals("Mart") || ayIsmi.equals("Mayis") || ayIsmi.equals("Agustos") || 
				ayIsmi.equals("Ekim") || ayIsmi.equals("Aralik")){
			
			System.out.println("girdiginiz ay 31 gun");
			 i++;
					
				}
				
		   
	 if (ayIsmi.equals("nisan") || ayIsmi.equals("haziran") || ayIsmi.equals("temmuz") || ayIsmi.equals("eylul") || 
			ayIsmi.equals("kasim")) {
		 
		 System.out.println("girdiginiz ay 30 gun");
		 i++;
		 
		 }
	 
	 if(ayIsmi.equals("subat")) {
		 
		System.out.println("girdiginiz ay 28 gun");
		i++;
		
	 }
	 
	 if (i==0) {
		 System.out.println("gecerli ay ismi giriniz");
	 }
		
	}

}
