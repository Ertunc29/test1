package extraCalisma06;

public class Soru12 {

	public static void main(String[] args) {
		
		// 0 dan 13 e kadar olan cift sayilarin toplami nedir
		
		int i=0;
		int toplam=0;
		
		do {
			if(i%2==0) {
				toplam+=i;
			}
			i++;
		}while(i<=13);
		System.out.println("13'e kadar olan cift sayilarin toplami :"+ toplam);
	}

}
