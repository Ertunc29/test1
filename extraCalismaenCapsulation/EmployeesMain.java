package extraCalismaenCapsulation;

import java.util.Scanner;

public class EmployeesMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen isminizi giriniz");
		String isim=scan.next();
		System.out.println("lutfen dogum tarihini giriniz");
		int dTarihi=scan.nextInt();
		System.out.println("lutfen maas talebinizi giriniz");
		int maas=scan.nextInt();
		
		Employee calisan=new Employee();
		
		calisan.setIsim(isim);
		calisan.setMaas(dTarihi);
		calisan.setdTarihi(isim);
		
		int calisanYas=calisan.yasHesapla(isim);
		
		if(calisanYas>18) {
			
			System.out.println("welcome to our company "+ isim+ " your salary is :"+ maas);
		}else if (calisanYas<18) {
			System.out.println("come bask when you are 18 years old");
		}else if(calisanYas==18) {
			System.out.println("we can have inter with you that you can have a");
		}
		
		
		

	}

}
