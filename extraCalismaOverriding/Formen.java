package extraCalismaOverriding;

public class Formen extends Isci {
	
	public String sorOLdBolum="Bakim";
	public String isim="Fatih";

	public static void main(String[] args) {
		
		
		Formen fr1=new Formen();
		
		// fr1.isim="Hakan";
		fr1.maas=5000;
		
		
		System.out.println(fr1.isim+" "+ fr1.sorOLdBolum+ " " + fr1.maas);
		
		
		Isci fr2=new Formen();
		
		fr2.isim="Latif";
		fr2.bolum="Sivaci";
		
		System.out.println(fr2.isim+ " "+fr2.bolum);

	}

}
