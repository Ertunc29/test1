package extraCalisma02;

import java.util.Scanner;

public class Soru10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* soru 10: AKCAABAT HAT KODU : 61A
		            YOMRA HAT KODU    : 61B
		            MACKA HAT KODU    : 61C
		            OF HAT KODU       : 61D
		            SURMENE HAT KODU  : 61E
		            
		     yukarida kodlari verilen ilcelerin hat numarasini kullaniciya bulduran programi switch case ile yazdirin.
		*/
		
         Scanner scan=new Scanner(System.in);
		
		System.out.println("HAT NUMRASINI BULMAK �STED���N�Z HATTIN ADINI G�R�N�Z:");
		String hatAd�=scan.next().toUpperCase();
		
		
		switch (hatAd�) {
		
		case "AKCAABAT":
			System.out.println("HAT NUMARASI 61A");
			break;
		case "YOMRA":
			System.out.println("HAT NUMARASI 61B");
			break;
		case "MACKA":
			System.out.println("HAT NUMARASI 61C");
			break;
		case "OF":
			System.out.println("HAT NUMARASI 61D");
			break;
		case "SURMENE":
			System.out.println("HAT NUMARASI 61E");
			break;
		default:
			System.out.println("LUTFEN GECERLI BIR HAT NUMARASI YAZINIZ");
			
			
		}
		

	}

}
