package extraCalismaException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception10 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\ExtraCalismalar\\src\\extraCalismaException\\FILE");
		
		int k=0;
		
		
		while((k=fis.read())!=-1) {
			System.out.print((char)k);
		}

	}

}
