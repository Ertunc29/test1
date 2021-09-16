package extraCalisma06;

public class Soru11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// iki deger tanimlayin. birinci degeri 10'a esit veya kucuk olmak ve diger degerin cift olmasi sartiyla 
		// 0'dan 20 ye kadar olan sayilari yazdirin
		
		int a=0;
		int b=0;
		
		while (a<=10 && b%2==0) {
			
			System.out.print(b+ " ");
			a++;
			b+=2;
		}
	}

}
