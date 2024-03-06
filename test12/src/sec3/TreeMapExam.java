package sec3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map0 = new TreeMap<>();
		TreeMap map1 = new TreeMap<Integer, String>();
		TreeMap<Integer, String> map2 = new TreeMap<>();
		TreeMap<Integer, String> map3 = new TreeMap<>(map0);
		TreeMap<Integer, String> map4 = new TreeMap<>() {{
			
		}};
		map2.put(1, "겨겨겨"); //요소(Entry)추가 
		map2.put(2, "갸갸갸");
		map2.put(3, "교교교");
		map2.put(4, "기기기");
		System.out.println("첫출력");
		System.out.println(map2);
		for(Integer i : map2.keySet()) {
			System.out.println(i + " " + map2.get(i));
		}
		System.out.println(map2.firstEntry());
		System.out.println(map2.firstKey());
		System.out.println(map2.lastEntry());
		System.out.println(map2.lastKey());
//		//key가 4인 요소를 제거
//		System.out.println("key가 4인 요소 제거");
//		map2.remove(4);
//		System.out.println(map2);
//		for(Integer i : map2.keySet()) {
//			System.out.println(i + " " + map2.get(i));
//		}
//		//Treemap비우기
//		System.out.println("TreeMap 비우기 ");
//		map2.clear();
//		//treemap 순회하여 출력
//		System.out.println(map2);
//		for(Integer i : map2.keySet()) {
//			System.out.println(i + " " + map2.get(i));
//		}
	}

}
