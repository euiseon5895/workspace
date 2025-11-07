package ch15.sec02.exam01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		String[] city = {"서울","부산","제주","서울","부산","부산","제주","서울","부산","부산","제주","서울","부산","제주","서울","부산","제주"};
		
		for (String c : city) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
	
		Set<String> keySet=map.keySet();
		System.out.println(keySet);
		
		Iterator<String> keIter = keySet.iterator();
		while(keIter.hasNext()) {
			
			String k = keIter.next();
			Integer n = map.get(k);
			System.out.println(k+":"+n);
		}
		Map<String,Integer> map2 = new HashMap<>();
		map2.put("가", 1);
		map2.put("나", 2);
		map2.put("다", 3);
		map2.put("라", 4);
		map2.put("마", 5);
		
		
		for (String key : map2.keySet()) {
			System.out.println(key+" "+map2.get(key));
		}
		
		
		
		
	}
}
