package sec4;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack();
		stack.push("사과");
		stack.push("파인애플");
		stack.push("체리");
		System.out.println(stack);
		System.out.println("peek");
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println("pop");
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
