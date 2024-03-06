package sec4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		set1.add("최태영");
		set1.add("김수한무");
		set1.add("두루미");
		set1.add("삼천갑자");
		set1.add("최태영");
		System.out.println(set1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.next();
		if (set1.contains(name)) System.out.println("이미존재합니다");
		else {
			set1.add(name);
			System.out.println(name+"추가");
		}
		System.out.println(set1);
		
		System.out.println(set2.isEmpty());
		
		set1.remove("두루미");
		System.out.println(set1);
		
		
		//////////////////////////////////////////////////
		
		Set<Integer> set3 = new TreeSet<Integer>(Arrays.asList(9,3,4,6,8,7,6));
		System.out.println(set3);
		
		for(Integer s:set3) {
			System.out.print(s+"\t");
		}
		System.out.println();
		
		Iterator it = set3.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
	}

}
