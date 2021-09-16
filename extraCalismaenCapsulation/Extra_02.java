package extraCalismaenCapsulation;

public class Extra_02 {

	public static void main(String[] args) {
		
		Extra_01 obj1=new Extra_01();
		
		obj1.sayi=20;
		System.out.println(obj1.sayi);
		
		Extra_01 obj2=new Extra_01();
		
		System.out.println(obj2.sayi);
		
		obj1.setOkulIsmi("Mehmet Koleji");
		
		System.out.println(obj1.getOkulIsmi());
		
		obj1.setHesapNo(456789);
		
		// System.out.println(obj1.setHesapNo(hesapNo));
		System.out.println(obj2.getOkulIsmi());


	}

}
