package extraCalisma05;

public class Soru10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 48;
		int n2 = 160;
		int ebob=1; 
		int ekok;
		 
	  for(int i=1; i<=n1 && i<=n2;i++) {
		  
		  if(n1%i==0 && n2%i==0) {
			  ebob=i;
		  }
		  
		 
		 
		 
	  }
	  ekok=(n1*n2)/ebob;
	  
	  System.out.println("48 ve 160 sayilarinin Ebob'u :"+ ebob);
		 System.out.println("48 ve 160 sayilarinin Ekok'u :"+ekok);

	}

}
