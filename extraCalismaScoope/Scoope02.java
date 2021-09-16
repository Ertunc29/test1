package extraCalismaScoope;

public class Scoope02 {
	
	// 7. eger birden fazla local'de ( yani method'da ) kullanacaginiz variable varsa 
	// bunu class level'da olusturmalisiniz. 
	// 8. variable'in static olup olmamasina nasil karar veririz? 
	// bu sorunun cevabi variable'in kullanilacagi local'lerle ilgili 
	// kullanilacak local static ise o zaman variable'i static yapmak zorundayiz
	
	// local variable'lari deger atamadan olusturabiliriz ama kullanamayiz
	
	int sayiClass=9;
	static int sayiClassStatic=5;

	public static void main(String[] args) {
		
		
		// 5.class level'da olmayan tum variable'lara local variable diyoruz
		// 6. local variable lar static olarak tanimlanamaz
		 int sayiMain=10;
		 
		 sayiClassStatic++;
		// System.out.println(sayiClass);
		 
		 System.out.println(sayiClassStatic);
		 
		 

	}
	
	    public void method1() {
		// System.out.println(sayiMain);
	    	
	    	System.out.println(sayiClass);
	    	
	    	System.out.println(sayiClassStatic);
	}
	
	    public static void method2(String sayiClassStatic) {
	    
	    	System.out.println(sayiClassStatic);
		    
	}

}
