package extraCalismaOverriding;

public class Isci extends Personel {
	
	public String bolum="Boya Atolyesi";
	public int maas=3000;
	public String mesai;
	
	
	
	public void mesai() {
		
		System.out.println("isciler gunluk 8 saat calisir");
		
	}
	
	
	
	public double maasHesapla() {
		return 30*8*15;
		
		// eger data type primitive veya void olursa overriden method ve overriding method type'lari ayni olmali 
		//eger data tipi non- primitive ise IS-A durumu gecerlidir. 
		
	}
	
	
	public int maasHesapla(int gunSayisi) {
		return gunSayisi*8*15;
	}
	
	public int maasHesapla(int gunSayisi, int gunlukCalismaSaati) {
		
		return 15*gunSayisi*gunlukCalismaSaati;
		
	}
	
	public int maasHesapla(int gunSayisi, int gunlukCalismaSaati, int saatUcreti) {
		
		return 15*gunSayisi*gunlukCalismaSaati*saatUcreti;
	}

}
