package extraCalismaOverriding;

public class Deneme2 extends Deneme1 {

	public static void main(String[] args) {
		
		
		
		Deneme2 dnm=new Deneme2();
		
		dnm.mesai();
	
	}
     
	

	public void mesai() {
		System.out.printf("gecici isciler");
		
		super.mesai();
}
}
