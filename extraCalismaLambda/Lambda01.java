package extraCalismaLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

	public static void main(String[] args) {
		
		
		List<Integer> l=new ArrayList<>(Arrays.asList(2,5,8,7,11,12,4,5,6,2,15));
		
		for (Integer each : l) {
			
			System.out.print(each+" "); // java ile 
			}
		
		System.out.println();
		
		l.stream().sorted().forEach(t-> System.out.print(t+" ")); // lambda ile yanyana yazdirma   2 2 4 5 5 6 7 8 11 12 15
		
		System.out.println();
		
		l.stream().sorted().forEach(System.out::print);
		
		System.out.println();
		
		l.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+" ")); // lambda ile cift sayilari yazdir  2 8 12 4 6 2
		System.out.println();
		
		l.stream().sorted(Comparator.reverseOrder()).filter(t-> t%2==1)
		.forEach(t-> System.out.print(t+" ")); // lambda ile tek sayi yazdir  15 11 7 5 5
		System.out.println();
		
		l.stream().distinct().sorted().forEach(t-> System.out.print(t+" ")); // lambda ile tekrarsiz siralama  2 4 5 6 7 8 11 12 15 
		System.out.println();
		
		l.stream().filter(t-> t>5).map(t-> t*t).forEach(t-> System.out.print(t+" ")); // 5 ten buyuk olanlarin karelerini yazdirma 64 49 121 144 36 225 
		System.out.println();
		
		int sonuc=l.stream().reduce(0,Math::addExact); // elamanlarin toplami 77
		System.out.println(sonuc);
		
		System.out.println();
		
		int sonuc1=l.stream().reduce(1,Math::multiplyExact); // elemanlar carpimi 266112000
		System.out.println(sonuc1);
		
		
		
		
		
		
		
		
	}

}
