package extraCalisma03;

public class Soru01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” String’ini “Java
	    // ogrenmek cok guzel.” sekline getirin.
		
		String cumle="Java ogrenmek123 Cok guzel@";
		
		
		System.out.println(cumle.replaceAll("\\d", ""));
		System.out.println(cumle.replace("@", "."));

	}

}
