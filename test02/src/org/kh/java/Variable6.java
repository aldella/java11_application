package org.kh.java;

public class Variable6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1 = 3.14f;
		double f2 = 3.14;
		int kor=90, eng = 80, mat = 90;
		float avg = (kor+eng+mat)/3;
		System.out.printf("\nf1=%.3f",f1);
		System.out.printf("\nf2=%.2f",f2);
		System.out.printf("\n평균 : %.2f",avg); // 이렇게하면 결과 86.00나옴 실제값은 86.66666....
		//사유 : kor eng mat 모두 정수타입이라서 정수/정수했기때문.
		//해결법 : 셋 중 하나라도 or 뒷쪽에 나누는 숫자 3을 실수형으로 바꿔주면 됨
		avg = (float) (kor + eng + mat) / 3;
		avg = (kor + eng + mat) / 3.0f; //둘 중 어느걸로 써도 무방
		System.out.printf("\n평균 : %.2f",avg);
	}

}
