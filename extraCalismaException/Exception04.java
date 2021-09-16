package extraCalismaException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception04 {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\ExtraCalismalar\\src\\extraCalismaException\\File");
			
			int k=0;
			
			
				while((k=fis.read())!=-1) {
					System.out.print((char)k);
				}
			// 1 den fazla hata varken sadece IOException kullanirsak
				// bu durumda hatanin turununun ne oldugunu bilemeyiz
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
