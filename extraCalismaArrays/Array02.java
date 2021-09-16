package extraCalismaArrays;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[5];
		
		System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]
		
		// arr[5]=5;
		
		arr[2]=1;
		
		System.out.println(Arrays.toString(arr)); // [0, 0, 1, 0, 0]
		
		arr=new int[6];
		
		System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0]

	}

}
