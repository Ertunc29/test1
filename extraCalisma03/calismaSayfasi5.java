package extraCalisma03;

public class calismaSayfasi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		// Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” String’ini 
		// “Java ogrenmek cok guzel.” sekline getirin.
		
		
		//  //d rakamlari degistir
		
		
		String cumle=" Java ogrenmek123 Cok guzel@ ";
		System.out.println(cumle.trim());// basinda ve sonundaki bosluklar yok oldu
		System.out.println(cumle.replaceAll("\\d", ""));// rakamlar yok oldu
		System.out.println(cumle.replace("@", ".")); // @ karakterini "." ile degistiridik
		
		System.out.println(cumle.trim().replace("@", ".").replaceAll("\\d", ""));
		
	}

}
