package extraCalismaLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda03 {

	public static void main(String[] args) {
		
		
		List<Integer> l=new ArrayList<>(Arrays.asList(2,5,8,7,11,12,4,5,6,2,15));
		
		ciftSayiKare(l);
		System.out.println();
		tekSayiKupBuyuktenKucuge(l);
		System.out.println();
		ciftKareToplami(l);
		System.out.println();
		tekSayiCarpim(l);
		
	}

	private static void tekSayiCarpim(List<Integer> l) {
		
		System.out.println(l.stream().filter(Methods::tekMi).reduce(1,Math::multiplyExact));  // 28875
		
	}

	private static void ciftKareToplami(List<Integer> l) {
		
		int sonuc=l.stream().filter(Methods::ciftMi).map(Methods::kareAl).reduce(0,Math::addExact);
		 
		System.out.println(sonuc);
		
		// System.out.println(l.stream().filter(Methods::ciftMi).map(Methods::kareAl).reduce(0,Math::addExact));
	}

	private static void tekSayiKupBuyuktenKucuge(List<Integer> l) {
		
		l.stream().sorted(Comparator.reverseOrder()).filter(Methods::tekMi).map(Methods::kupAl).forEach(Methods::yazdir); // 3375 1331 343 125 125
		
	}

	private static void ciftSayiKare(List<Integer> l) {
		
		l.stream().filter(Methods::ciftMi).map(Methods::kareAl).forEach(Methods::yazdir); // cift sayi kareleri 4 64 144 16 36 4 
		
	}

}
