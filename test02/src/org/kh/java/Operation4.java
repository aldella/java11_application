package org.kh.java;

public class Operation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감연산 : ++. -- : 전위연산, 후위연산이 있음
		int a = 10;
		int b = 10;
		float c = 2.6f;
		System.out.println("전위증가연산 : "+(++a)); // a 선증가 후출력
		System.out.println("후위증가연산 : "+(b++)); // b 선출력 후증가
		
		System.out.println(a + " " + b);
	}

}
