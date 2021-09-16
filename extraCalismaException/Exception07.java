package extraCalismaException;

public class Exception07 {

	public static void main(String[] args) {
		
		
		int sayi=10;
		
		String str="4567";
		
		System.out.println(str+10);
		
		int strSayi=Integer.parseInt(str);
		
		System.out.println(strSayi+10);
		
		String str1="12ab45";
		
		System.out.println(str1+10);
		
	//	int strSayi1=Integer.parseInt(str1); // NumberFormatException
		
		
		Object sayi2=25;
		
		String sayiStr3=(String) sayi2;
		
		System.out.println(sayiStr3); // ClassCastException

	}

}
