package extraCalismaMap;

import java.util.HashMap;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map1=new HashMap<>();
		
		map1.put(101, "Asli, Can, Java");
		map1.put( 102,"Kerem, Akturk, Lambda");
		map1.put(103, "Erkan, Kaya, C#");
				
		System.out.println(map1); // {101=Asli, Can, Java, 102=Kerem, Akturk, Lambda, 103=Erkan, Kaya, C#}
		System.out.println(map1.size()); // 3
		
		map1.containsKey(110);
		System.out.println(map1.containsKey(110)); // false
		
		map1.putIfAbsent(104, "Selim, Yar, java"); // varsa ekleme yoksa ekle 
		
		System.out.println(map1); // {101=Asli, Can, Java, 102=Kerem, Akturk, Lambda, 103=Erkan, Kaya, C#, 104=Selim, Yar, java}
		
		map1.putIfAbsent(102, "Sinan, San, Lambda");
		
		System.out.println(map1);// {101=Asli, Can, Java, 102=Kerem, Akturk, Lambda, 103=Erkan, Kaya, C#, 104=Selim, Yar, java}
		
		map1.put(101, "Aysel, Cal, C#");
		
		System.out.println(map1);// {101=Aysel, Cal, C#, 102=Kerem, Akturk, Lambda, 103=Erkan, Kaya, C#, 104=Selim, Yar, java}
		
		System.out.println(map1.entrySet()); // [101=Aysel, Cal, C#, 102=Kerem, Akturk, Lambda, 103=Erkan, Kaya, C#, 104=Selim, Yar, java]
		
		System.out.println(map1.size());	// 	4
		
		map1.compute(104, (key,value)-> "Mahir,Bas,Java"); // {101=Aysel, Cal, C#, 102=Kerem, Akturk, Lambda, 103=Erkan, Kaya, C#, 104=Mahir,Bas,Java}
		System.out.println(map1);
		
		map1.computeIfPresent(106, (key,value)-> "Kaya, Bal, Lambda");
		System.out.println(map1); // {101=Aysel, Cal, C#, 102=Kaya, Bal, Lambda, 103=Erkan, Kaya, C#, 104=Mahir,Bas,Java}
		
		

	}

}
