package sec2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
	public static void main(String args[]) {
		List<Student> sList = new LinkedList<>();
		Student s1 = new Student();
		s1.setNo(1);
		s1.setName("갹");
		s1.setPoint(30);
		sList.add(s1);
		
		Student s2 = new Student(2,"굑",40);
		sList.add(s2);
		
		sList.add(new Student(3,"고곡",50));
		
		for(Student s:sList) {
			System.out.println(s.toString());
		}
		sList.set(2, s2);
		for(Student s:sList) {
			System.out.println(s.toString());
		}
	}
}
