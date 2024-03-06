package org.kh.java;

public class Variable5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = 'H';
		char ch2 = 65;
		char ch3 = 82;
		char ch4 = '\u2665'; // \\u : 유니코드 입력하는 이스케이프 문자
//		char ch5 = -65; //코드넘버는 순번이므로 음수값을 가질 수 없다
		char ch5 = 121;
		char ch6 = '\u26BD';
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2); //아스키코드번호 65 = A 로 출력
		System.out.println("ch3 : "+ch3); //아스키코드번호 82 = R 로 출력
		System.out.println("ch4 : "+ch4);
		System.out.println("ch5 : "+ch5);
		System.out.println("ch6 : "+ch6);
		
		System.out.println("아스키 코드 넘버");
		System.out.println("ch1 : "+(int)ch1);
		System.out.println("ch4 : "+(int)ch4);
		System.out.println("ch4 : "+(int)ch5);
		System.out.println("ch4 : "+(int)ch6);
	}

}
