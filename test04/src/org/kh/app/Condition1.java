package org.kh.app;

public class Condition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int point = 80;
		String pass = "불합격";
//		if (point >=70) pass = "합격";
		String pass2 = (point >= 70) ? "합격" : "불합격";
		System.out.printf("\n당신의 점수는 %d이며, 판정은 %s입니다.", point, pass2);

	}

}
