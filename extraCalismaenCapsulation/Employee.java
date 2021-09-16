package extraCalismaenCapsulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* TODO
Burada iki adet class vardýr. Biri Main diðeri ise Employees,
Employees(Çalýþanlar) class'ýnda;
Bu variable'larý oluþturunuz;
private String name,
private int salary,
private String dob (date of birth) (Doðum tarihi)
getter ve setter oluþturunuz.
Main class'ýn içinde; kullanicidan name dob ve slary bilgilerini alip
Eðer employee 18 yaþýnda büyükse, Welcome to our company Fernando your salary is 80000. yazdýrýnýz.
Eðer Fernando 18 yaþýndan küçükse, come back when you are 18 years old. yazdýrýnýz.
Eðer Fernando 18 yaþýndaysa,  we can have inter with you after that you can have a 80000 salary yazdýrýnýz.
Örnek:
Name is Fernando
dob is 11/23/2000
Salary is 80000
todo  ageCalculator isminde bir method oluþturunuz. Þuanki tarih - doðum yýlý = employee age
*/

public class Employee {
	
	
	private String isim;
	private int maas;
	private String dTarihi;
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	public String getdTarihi() {
		return dTarihi;
	}
	public void setdTarihi(String dTarihi) {
		this.dTarihi = dTarihi;
	}
	
	public int yasHesapla(String dTarihi) {
		

	    String strDate=dTarihi;
	    
	    LocalDate bugun=LocalDate.now();
	    DateTimeFormatter format=DateTimeFormatter.ofPattern("MM/dd/yyyy");
	    
	    
	    LocalDate dTarih=LocalDate.parse(strDate,format); // kullanicinin String girdigi MM/dd/yyyy 
	    
	    int age=bugun.getYear()-dTarih.getYear();
		return age;
		
	}

}
