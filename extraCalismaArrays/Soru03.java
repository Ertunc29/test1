package extraCalismaArrays;

public class Soru03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,11,12,13,14,15,16};
		int ciftToplam=0;
		int tekToplam=0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				ciftToplam+=arr[i];
			}else {
				tekToplam+=arr[i];
			}
		}
		System.out.println("cift dizilerin toplami :"+ ciftToplam);
		System.out.println("tek dizilerin toplami :"+ tekToplam);
	}

}
