package extraCalismaOverriding;

public class GeciciIsci extends Isci {

	public static void main(String[] args) {
		
		GeciciIsci gI1=new GeciciIsci();
		
		
		
	}
	
	public double maasHesapla() {
		return 30*8*10;
	}

	@Override
	public void mesai() {
		super.mesai();
		System.out.println("gecici isciler haftada 20 saat calisir");
		
	}

}
