package extraCalismaenCapsulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* TODO
Burada iki adet class vard�r. Biri Main di�eri ise Employees,
Employees(�al��anlar) class'�nda;
Bu variable'lar� olu�turunuz;
private String name,
private int salary,
private String dob (date of birth) (Do�um tarihi)
getter ve setter olu�turunuz.
Main class'�n i�inde; kullanicidan name dob ve slary bilgilerini alip
E�er employee 18 ya��nda b�y�kse, Welcome to our company Fernando your salary is 80000. yazd�r�n�z.
E�er Fernando 18 ya��ndan k���kse, come back when you are 18 years old. yazd�r�n�z.
E�er Fernando 18 ya��ndaysa,  we can have inter with you after that you can have a 80000 salary yazd�r�n�z.
�rnek:
Name is Fernando
dob is 11/23/2000
Salary is 80000
todo  ageCalculator isminde bir method olu�turunuz. �uanki tarih - do�um y�l� = employee age
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
