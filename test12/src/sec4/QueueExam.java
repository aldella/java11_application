package sec4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<>();
		q.offer("1");
		q.offer("2");
		q.offer("3");
		q.offer("4");
		q.offer("5");
		q.offer("6");
		q.offer("7");
		System.out.println(q);
		System.out.println("peek");
		System.out.println(q.peek()); // 맨 처음 데이터가 반환 (제거X)
		System.out.println(q.peek());
		System.out.println(q.peek());
		System.out.println("poll");
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q);
	}

}
