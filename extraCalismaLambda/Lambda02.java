package extraCalismaLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
	
	

	public static void main(String[] args) {
		
		
   Arrays.asList("Ayhan","Selma","Lale","Mustafa","Sinan","Seymen").stream()
    .forEach(t-> System.out.print(t+" ")); // Ayhan Selma Lale Mustafa Sinan Seymen 
   
   System.out.println();
   
    List<String> l=new ArrayList<>(Arrays.asList("Ayhan","Selma","Lale","Mustafa","Sinan","Seymen"));
    
    l.stream().filter(t-> "Ayhan".equals(t)).forEach(t->System.out.println(t)); // Ayhan varsa yazdir Ayhan
    System.out.println();
    
   List<String> list=l.stream().filter(t-> !"Ayhan".equals(t)).collect(Collectors.toList());
   System.out.println(list); // Ayhan disindakileri list olarak yazdir [Selma, Lale, Mustafa, Sinan, Seymen]
   
   System.out.println();
   
   l.stream().filter(t-> t.startsWith("S")).limit(2).forEach(t-> System.out.print(t+" ")); // S ile baslayan iki isim yazdir Selma Sinan 
   
   System.out.println();
   
   l.stream().skip(3).forEach(t-> System.out.print(t+" ")); // ilk uc elemani atla Mustafa Sinan Seymen 
   
   System.out.println();
   
   l.stream().limit(3).forEach(t-> System.out.print(t+" ")); // ilk uc elemani yazdir  Ayhan Selma Lale 
   
   

	}

}
