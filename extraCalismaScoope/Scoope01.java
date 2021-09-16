package extraCalismaScoope;

public class Scoope01 {
	// 1.main method'un disinda olusturulan variable'lara class level variable denir
	
    int sayi1;
	int sayi2=10;
	
	String str1;
	String str2="java";
	
	// 3.static olmayan cariable'lar static alanlardan ulasilamaz
	
	static boolean anladinMi;
	//2. static olarak tanimlanan variable'lar  class icinde heryerden kullanilabilir. 
	// static olsun veya olmasmin her method'dan ulasabiliriz ve kullanabiliriz.
	static boolean biliyorMusun=true;
	static char harf;
	static String str;
	
	//4. calss level'da olusturulan variable'lar class static olsun veya olmasin deger
	// atamadan da kullanilabilir. eger biz deger atamazsak Java Class level'daki variable'lara
	// default degerler atar.
	// sayisal degerler icin=0; boolean=false; String=null; char;' '
	
	// class level variable\lar iki sekilde olabilir.
	//1. static olarak tanimlanmis olabilir/ static olarak tanimlanmis variable'lara heryerden ulasilabilir.
	

	public static void main(String[] args) {
		
		for (int i=0; i<10;i++) {
			System.out.print(i+" ");
			
			String isim="Hasan";
		}
		
	 // 	System.out.println(isim);
		
        //    System.out.println(i); // scoope disinda i'yi kullanamayiz
       //   i=10;
		
		
		int sayi;
		 // sayi++;
		
		// System.out.println(sayi);
		
		
	  //	method1(); // method1 cagiramayiz cunku main method static fakat method1 static degil
		
		method2();
		
	 System.out.println("main method icinde anladinMi'nin degeri :"+ anladinMi);
	 
	 System.out.println("main method icinde harf'in degeri : " + harf);
	 
	 System.out.println("main method icinde str'in degeri : " + str);
	 
	// System.out.println(str1);
		
	}
    
	   public void method1() {
		   
		   
		   System.out.println("method1 calisti");
		   sayi1=20;
		  System.out.println(anladinMi);
		   System.out.println(str1);
	   }
	   
	   
	   public static void method2() {
		   
		   System.out.println("method2 calisti");
		   System.out.println(biliyorMusun);
		   
		   
	   }
	   
	
	
}
