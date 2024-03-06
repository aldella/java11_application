package sec2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> memList = new ArrayList<>();
		List<Member> memList2 = new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
//			Member mem = new Member(i, "kim"+i, "abcd"+i+i, "김"+i, 0);
			memList.add(new Member(i, "kim"+i, "abcd"+i+i, "김"+i, 0));
		}
		memList.remove(3);
		Member tmp = new Member(11,"ddd","ddd","ddd",1);
		memList.add(tmp);
		for(Member m : memList) {
			System.out.println(m.toString());
		}
		for(int i=0; i<memList.size(); i++) {
			Member m = memList.get(i);
			System.out.println(m.toString());
		}
		System.out.println(memList.contains(tmp));
		System.out.println(memList2.isEmpty());
		
		List<String> names = new ArrayList<>();
		names.add("adlkfs");
		names.add("213321");
		names.add("dsf909");
		if(names.contains("908021")) System.out.println("908021데이터 존재");
		else {
			names.add("908021");
			System.out.println("908021데이터추가");
		}
		System.out.println(names.contains("908021"));
		names.clear();
		System.out.println(names.isEmpty());
		
	}

}
