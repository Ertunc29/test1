package extraCalismaInheritance;

public class Memur extends Personel {
	
	public int maas;

	
	
	public Memur() {
		super();
		System.out.println("child parametresiz cons. calisti");
	}



	public Memur(int maas) {
		super("ayse",5000);
		System.out.println("child parametreli cons. calisti");
	}



	public static void main(String[] args) {
		
		
		
		Memur obj1=new Memur(5000); 
		

	}

	

}
