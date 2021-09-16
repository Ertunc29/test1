package extraCalismaInheritance;

public class Ogrenci extends OgrenciIsleri {

	public static void main(String[] args) {
		
		
		Ogrenci ogr1=new Ogrenci();
		
		ogr1.isim="Asim";
		ogr1.soyisim="Sabit";
		ogr1.okulNo=12345;
		ogr1.not=notHesaplama(vize1, vize2);
		ogr1.aktifMi=true;
		ogr1.gectiMi=gectiMi(gectiMi);
		
        System.out.println(ogr1.isim + " "+ ogr1.soyisim + " "+ ogr1.okulNo+ " "+ ogr1.not+ " "+ ogr1.aktifMi + " "+ ogr1.gectiMi);
	}

}
