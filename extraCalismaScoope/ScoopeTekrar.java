package extraCalismaScoope;

public class ScoopeTekrar {
	
	
	int sayi;
	String isim="Ali";
	static int sayi1;
	static boolean javaScript;
	static char harf;
	
	// main method disinda olusturulan variable'lara class level variable denir

	public static void main(String[] args) {
		
		
		System.out.println("main method icinde sayi :"+ sayi1);
		System.out.println("main method icinde javaScript :"+ javaScript);
		System.out.println("main method icinde harf :"+ harf);
		
		
		Kalamari();
		
		// Safari();

	}


	private  void Safari() {
		
		
		System.out.println("method1 calisti");
		sayi=10;
		System.out.println(sayi);
	}


	private static  void Kalamari() {
		System.out.println("method2 calisti");
		sayi1=5;
		System.out.println("sayi1'in method2 de degeri : "+ sayi1);
		
		
	}

}
