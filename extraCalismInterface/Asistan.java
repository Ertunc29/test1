package extraCalismInterface;

public class Asistan extends Akademisyen {
	
	
	
	public static void main(String[] args) {
		
		Asistan obj1=new Asistan();
		
		
		obj1.maasHesapla(30, 8, 30);// akademisyen
		obj1.maasHesapla(30, 8, 25); // asistan
		
		System.out.println(obj1.maasHesapla(30, 8, 25));
		
		System.out.println(obj1.maasHesapla(30, 8, 30));
	
	

	}
	
	public void yuksekLisans() {
		
		
	}

	@Override
	public void giris() {
		
		
	}

	@Override
	public void cikis() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void yemek() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void derseGiris() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void isim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void soyIsim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void id() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int maasHesapla(int ucret, int gun, int calismaSaati) {
		
		return super.maasHesapla(ucret, gun, calismaSaati);
	}

	





	
	


}
