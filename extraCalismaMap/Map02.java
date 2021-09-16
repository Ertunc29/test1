package extraCalismaMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map02 {

	public static void main(String[] args) {
		
		
		String kelime="Hellooo";
		
		Map<String,Integer> map1= harfSayisiBul(kelime);
		
		System.out.println(map1); // {e=1, H=1, l=2, o=3}
						

	}

	private static Map<String, Integer> harfSayisiBul(String kelime) {
		
		String harfler[]=kelime.split("");
		System.out.println(Arrays.toString(harfler)); // [H, e, l, l, o, o, o]
		
		HashMap<String, Integer> hs=new HashMap<>();
		
		for (String each : harfler) {
			
			if(!hs.containsKey(each)) {
				
				hs.put(each,1);
				
			}else {
				
				hs.put(each, hs.get(each)+1);
			}
			
			
			
		}
		
		return hs;
	}

}
