package exam;

import java.util.Scanner;

public class exam1 {
	public static void main(String args[]) {
		Person james = new Person();
		james.setAge(40);
		james.setName("James");
		james.setMerried(true);
		james.setChild(3);
		james.print();
		
		Scanner scan = new Scanner(System.in);
		long ordernum = scan.nextLong();
		Order no1 = new Order(ordernum, "abc123", "2018년 3월 12일", "홍길순", "PD0345-12", "서울시 영등포구 여의도동 20번지");
		System.out.println(no1.toString());
		
		
		
	}
}
