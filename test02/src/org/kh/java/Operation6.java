package org.kh.java;

public class Operation6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//논리연산자 : &&(and)    ||(or)    !(not)
		int a=26, b=28,c=27;
		System.out.println((a>b && a>c));
		System.out.println((a>b && b>c));
		System.out.println((a<b && b>c));
		System.out.println((a<b && b<c));
		
		System.out.println((a>b || a>c));
		System.out.println((a>b || b>c));
		System.out.println((a<b || b>c));
		System.out.println((a<b || b<c));
		
		System.out.println(!(a>b));
		System.out.println(!(a>c));
		System.out.println(!(a<b));
		System.out.println(!(a<c));

	}

}
