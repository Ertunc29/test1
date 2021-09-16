package extraCalisma04;

public class Soru03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int x = 5;
	      int y = 7;
	 
	        System.out.println("Metot'a girmeden önce :"+"x ="+x+" y ="+y);
	 
	        deneme(5,7);
	        
	        System.out.println("Metot'tan çýkýnca :"+"x ="+x+" y ="+y);
	 
	 
	    }
	    public static void deneme(int x,int y){
	 
	        System.out.println("Metot'un içi iþlemlerden önce :"+"x ="+x+" y ="+y);
	        x += 5;
	        y +=15;
	        System.out.println("Metot'un içi iþlemlerden sonra :"+"x ="+x+" y ="+y);
	        
	       

	}

}
