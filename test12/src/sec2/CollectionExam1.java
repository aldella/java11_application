package sec2;

import java.util.ArrayList;
import java.util.List;

public class CollectionExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("최태영");
		list.add("홍길동");
		list.add("이무진");
		list.add("일등이");
		for(String s : list) {
			System.out.println(s);
		}
	}

}
