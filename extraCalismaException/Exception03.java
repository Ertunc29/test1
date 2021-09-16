package extraCalismaException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exception03 {

	
	
	public static void main(String[] args) {
		
		
	  try {
		FileInputStream fis= new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\ExtraCalismalar\\src\\extraCalismaException\\FILE");
		
		int k=0;
		
		
			while((k=fis.read())!=-1) {
				System.out.print((char)k);
				
				
			}
		
			fis.close();
			
			
		
		
	} catch (IOException e) {
		
	
		
		e.printStackTrace();
	
	}
	  
	  System.out.println("java");
		
	}

}
