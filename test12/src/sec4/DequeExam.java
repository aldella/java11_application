package sec4;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> d = new LinkedList<>();
		d.addFirst("자바"); // [자바]
		d.addFirst("파이썬"); // [파이썬, 자바]
		d.addLast("자바스크립트"); // [파이썬, 자바, 자바스크립트]
		d.addFirst("리액트"); // [리액트, 파이썬, 자바, 자바스크립트]
		d.addLast("스타일시트"); // [리액트, 파이썬, 자바, 자바스크립트, 스타일시트]
		System.out.println(d);
		System.out.println(d.peek()); //큐처럼 동작
		System.out.println(d.peekLast()); //스택처럼 동작
		System.out.println(d.peekFirst()); //큐처럼 동작
		System.out.println(d.poll()); //큐처럼 동작. 맨 처음 요소 반환 후 제거
		System.out.println(d.pollLast()); //스택처럼 동작. 맨 마지막 요소 반환 후 제거. 제어점이 맨 마지막
		System.out.println(d.pollFirst()); //큐처럼 동작. 맨 처음 요소 반환 후 제거. 제어점이 맨 처음
		System.out.println(d);
		System.out.println(d.pop()); //큐처럼 동작. 현재 제어점에 해당하는 요소를 반환 후 제거. 현재상태에선 제어점이 맨 처음에 있으니 "자바"반환 후 자바 제어. 즉, 가장 마지막에 실행한 명령이 pollLast였느냐 pollFirst였느냐에 따라 달라짐.
		System.out.println(d);
	}
}
