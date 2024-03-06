package sec3;

import java.util.Hashtable;
import java.util.Set;

public class HashtableExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> hash = new Hashtable<>();
		hash.put("서울", 1);
		hash.put("경기도", 2);
		hash.put("부산", 3);
		hash.put("광주", 4);
		hash.put("강원도", 5);
		//hashtable의 요소의 수를 출력
		System.out.println(hash.size());
		
		//hashtable에 키가 "광주"인 요소를 출력
		System.out.println(hash.get("광주"));
		
		//hash table의 키만 Set으로 저장한 후 출력
		Set<String> keySet = hash.keySet();
		System.out.println(keySet);
		
		//hash table에서 키가 "강원도"인 요소 제거
		hash.remove("강원도");
		System.out.println(hash);
		
		//hash table의 순회
		for(String s : hash.keySet() ) {
			System.out.println(s + " " + hash.get(s));
		}
		
	}

}
