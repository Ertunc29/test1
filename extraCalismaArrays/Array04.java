package extraCalismaArrays;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5,6};
		int toplam=0;
		for (int i=0; i<arr.length;i++) {
			
		toplam+=arr[i];
		System.out.println(toplam);
		}
		
		
		
		
		int arr2[]= {3,5,7,9,11};
		
		arr2=ArraySirala(arr2); //[3, 5, 7, 9, 11]
		
		arrayTerstenSirala(arr2);
		
		
		
		

	}

	             private static int[] arrayTerstenSirala(int[] arr2) {
		            
	            	 
	            	 int[] temp=new int[arr2.length]; 
	            	 
	            	 for(int i=0; i< temp.length; i++) {
	            		 
	            		 temp[i]=arr2[arr2.length-1-i];
	            		 
	            		
	            	 }
	            	
	            	 System.out.println(Arrays.toString(temp));
	            	 return temp;
		 
	}

				private static int[] ArraySirala(int[] arr2) {
	 	
		        Arrays.sort(arr2);
		        System.out.println(Arrays.toString(arr2));
		        
		        return arr2;
	            	 
	            	 
	            	 
	            	 
	            	 
	            	 
	}

}
