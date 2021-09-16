package extraCalismaArrays;

import java.util.Arrays;

public class Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java, candir";
		
	    str.split(",");
	    
	    System.out.println(Arrays.toString(str.split(",")));
	    
	    String bolunmusKelimeArray[]=str.split(",");
	    
	    System.out.println(bolunmusKelimeArray[1]);
	    
	    String bolunmusKelimeArray1[]=str.split("a");
	    
	    System.out.println(Arrays.toString(bolunmusKelimeArray1));
	    
	    String bolunmusKelimeArray2[]=str.split("");
	    
	    System.out.println(Arrays.toString(bolunmusKelimeArray2));
	    
	    String cumle="Java ogren mutlu yasa";
	    
	    //kelime sayisini bulma
	    
	    String cumleArrayi[]=cumle.split(" ");
	    
	    System.out.println("cumlede ki kelime sayisi : "+ cumleArrayi.length);
	    
	    // harf sayisini bulme
	    
	    String cumle1=cumle.replaceAll("\\W", "");
	    System.out.println(cumle1);
        System.out.println(cumle1.length());
	    
	    String harfArrayi[]=cumle1.split("");
	    System.out.println(Arrays.toString(harfArrayi).length());
	    

	}

}
