package extraCalismaArrays;

import java.util.Arrays;

public class Array06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cumle="Hasan kelkiti cok seviyor ama diyarbakiri da seviyor";
		
		String bolunmusCumle[]=cumle.split(" ");
		
		System.out.println(Arrays.toString(bolunmusCumle));
		
		System.out.println("cumlede ki kelime sayisi : "+ bolunmusCumle.length);
		
		String cumle1=cumle.replaceAll("\\W", "");
		
		System.out.println(cumle1);
		
		String harfSayisi[]=cumle1.split("");
		
		System.out.println(harfSayisi.length);

	}

}
