package extraCalismaArrays;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		short arr[]=new short[5];
		
		System.out.println(arr); // non-primitive data turudur. dolaysiyla arr'yi direkt yazdirmak istersek arr'nin referans bilgisini verir. 
		
		int arr1[]=new int[4];
		
		arr1[1]=4;
		
		System.out.println(arr1);
		
		// soru elemanlari ali, veli, ayse , fatma olan array olustur
		
		String isimler[]=new String[4];
		
		//1. yontem
		isimler[0]="Ayse";
		isimler[1]="Ali";
		isimler[2]="Veli";
		isimler[3]="Fatma";
		
		// 2.yontem 
		
		String isimler1[]= {"Ayse","Ali","Veli","Fatma"};
		
		isimler[1]="Hasan";
		
		
		System.out.println(isimler.length);
		System.out.println(isimler[3]);
		System.out.println(isimler[1]);
	
		
		// 1.yol loop kullanma
		
		for(int i=0;i<isimler1.length;i++) {
			System.out.print(isimler1[i] +" ");
			
		}
		System.out.println();
		
		// 2. yol Arrays classindan yardim alma
		
		System.out.println(Arrays.toString(isimler));
		System.out.println(Arrays.toString(isimler1));
	}

}
