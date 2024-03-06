package org.kh.java;

public class Operation7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		대입 연산자2 : 연산 후에 대입하는 연산자 &= != >>= <<= >>>= (<<<=는 없음) ^= 
		int x = 0b01101;
		int y = 0b01011;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toBinaryString(x&y));
		System.out.println(Integer.toBinaryString(x|y));
		System.out.println(Integer.toBinaryString(x^y)); //XOR : 배타적논리합, 서로 다를 때에만 1을 표시. 그 외의 경우 0
		System.out.println(Integer.toBinaryString(~x)); //NOT
		System.out.println();
		System.out.println(Integer.toBinaryString(x >> 2)); //right shift : 1101 에서 오른쪽으로 두 번 밀어서 11 만 남게됨
		System.out.println(Integer.toBinaryString(x >> 20)); // 본래 크기보다 커져서 0됨
		System.out.println(Integer.toBinaryString(x >> 32)); // 초기화
		System.out.println();
		System.out.println(Integer.toBinaryString(x << 2)); //left shift : 왼쪽으로 당긴만큼 빈 공간이 생김
		System.out.println(Integer.toBinaryString(x << 29)); // 자료형 최대크기 넘어가는 부분은 잘림
		System.out.println(Integer.toBinaryString(x << 32)); // 초기화
		System.out.println();
		
		int i = 25; // 1 1 0 0 1
		int j = 30; // 1 1 1 1 0
		i &= j; // 1 1 0 0 0 = 24 AND조건
		System.out.println(i);
		i=25;
		i |= j; // 1 1 1 1 1 = 31 OR조건
		System.out.println(i);
		i = 25;
		i ^= j; // 0 0 1 1 1 = 7 XOR조건
		System.out.println(i);
		
		j >>= 2; // 1 1 1 1 0 -> 0 0 1 1 1 : 오른쪽으로 2번 shift : 7
		System.out.println(j);
		j=30;
		j <<= 2; // 1 1 1 0 0 -> 1 1 1 0 0 0 0 : 왼쪽으로 2번 shift : 120
		System.out.println(j);
		j=30;
		j >>>= 2;
		System.out.println(j); // 동일하나, 차이점은 >>=는 부호비트와 동일하게 채우지만, >>>=는 무조건 0으로 채운다

		
	}

}
