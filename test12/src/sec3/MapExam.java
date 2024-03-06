package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.TreeMap;

public class MapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, String> map2 = new Hashtable<>();
		Map<Integer, String> map3 = new TreeMap<>();
		Properties map4 = new Properties();
		
		map1.put("kim", 90);
		map1.put("ㅣㄷㄷ", 33);
		map1.put("fda", 70);
		
		System.out.println(map1);
		System.out.println("fda:"+map1.get("fda"));
		if(map1.containsKey("fda")) {
			System.out.println("fda:"+map1.get("fda"));
		}
		if(map1.containsValue(100)) {
			System.out.println("만점자가 존재합니다");
		} else System.out.println("만점자없음");
		
		map2.put("김","1코스");
		map2.put("이","2코스");
		map2.put("박","3코스");
		map2.put("최","4코스");
		map2.put("권","5코스");
		System.out.println(map2);
		
		Iterator<String> keys = map2.keySet().iterator(); //맵의 키모음(keySet)이 하나의 요소로 분리됨.
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key + map2.get(key));
		}
		
		for(Entry<String, Integer> entry : map1.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " " + value);
		}
		
		for (String key:map1.keySet()) {
			System.out.println(key + " " + map1.get(key));
		}

		map2.remove("김");
		System.out.println(map2);
		map2.clear();
		System.out.println(map2);

		
		String[] names = {"000","111","222","333","444","555","666","777","888","999"};
		for(int i=0; i<=9; i++) {
			map3.put(i,names[i]);
		}
		
		System.out.println("인원수 : "+map3.size());
		for(Integer i : map3.keySet()) {
			int key = i;
			String value = map3.get(key);
			System.out.println(key + " " + value);
		}
		
		map4.setProperty("name", "최태영");
		map4.setProperty("age", "26");
		map4.setProperty("height", "171");
		map4.setProperty("kor", "100");
		map4.setProperty("math", "90");
		map4.setProperty("eng", "80");
		System.out.println(map4);
		System.out.println(map4.getProperty("name"));
	}

}
