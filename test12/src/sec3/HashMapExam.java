package sec3;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map1 = new HashMap<>();
		HashMap<String, String> map2 = new HashMap<>();
		HashMap<String, String> map3 = new HashMap<>(map1); //맵의 복제
		//맵의 초기 용량은 기본적으로 16개
		HashMap<String, String> map4 = new HashMap<>(10); //초기 용량 지정. 10개. 단, 이 상태로 용량을 늘릴 경우 10개 -> 20개가 되어버림
		HashMap<String, String> map5 = new HashMap<>(10,0.7f); //load factor : 사용 확률 지정 (최대 70%까지만 사용가능)
		HashMap<String, String> map6 = new HashMap<>() {{ //초기값 지정
			put("name", "최태영");
		}}; 
		HashMap<Integer, String> fruits = new HashMap<>();
		
		fruits.put(1, "𝓒𝓱𝓮𝓻𝓻𝔂 𝓑𝓪𝓻𝓪"); //요소(Entry) 추가
		fruits.put(2, "케론스타프루츠");
		fruits.put(3, "선악과");
		fruits.put(4, "페르세포네석류");
		fruits.put(5, "황금사과");
		
		System.out.println(fruits);
		fruits.remove(2); //key가 2인 요소 지우기
		System.out.println(fruits);
		
		
		for(Integer i : fruits.keySet()) { //순회의 3번방식 적용
			System.out.println(i+" "+fruits.get(i));
		}
		
		if(fruits.containsValue("선악과")) {
			System.out.println("선악과존재");
		}
		
	}

}
