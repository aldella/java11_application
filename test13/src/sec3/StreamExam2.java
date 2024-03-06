package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<>();
		lst.add("ㅎ111");
		lst.add("ㅈ222");
		lst.add("ㄷ333");
		lst.add("ㅋ444");
		lst.add("ㅇ555");
		Stream<String> stream = lst.stream();
		
		System.out.println("정렬 전");
		stream.forEach(s -> System.out.println(s));
		
		System.out.println("정렬 후");
		lst.stream().sorted().forEach(s -> System.out.println(s));
		
		System.out.println("요소의 수");
		System.out.println(lst.stream().count());
	}

}
