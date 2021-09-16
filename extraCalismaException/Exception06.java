package extraCalismaException;

import java.util.ArrayList;
import java.util.List;

public class Exception06 {

	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5};
		
		System.out.println(arr[1]);
		System.out.println(arr[4]);
	 //  System.out.println(arr[7]); // ArrayIndexOutOfBoundsException
		
		List<String> list=new ArrayList<>();
		
		list.add("hasan");
		list.add("selim");
		list.add("mercan");
		
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(8));
		

	}

}
