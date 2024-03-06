package org.kh.java;

public class Variable4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "\"최태영\""; //글자가 여러 개 = 복수개의 데이터를 저장 = 기본형이 아님
		String name2 = "최태영";
		short age = 4;
		float height = 173.6f;
		double weight = 71.9;
		char init = 'k';
		
		System.out.println("이름 : "+name1);
		System.out.println("이름 : \""+name2+"\"");
		System.out.printf("%n이름 : %s",name1);
		System.out.printf("%n이름 : \"%s\"", name2);
		
		System.out.printf("%n나이 : %d", age);
		System.out.printf("%n키 : %f", height);
		System.out.printf("%n체중 : %.3f", weight); //소숫점 셋째자리까지 출력
		System.out.println("\n이니셜 : "+init);
		/*
		 이스케이프 문자
		  \n : 줄바꿈 (%n과 똑같은기능)
		  \t : 탭
		  \\ : 그냥 \를 출력함
		  \" : "를 출력
		  \' : '를 출력
		  
		  이거 중요한문제임 예를들어
		  loc = "C:\kim\news\temp"; 뭐 이런경우
		  \news : 이 부분을 \n으로 인식해버려서 출력오류남
		  
		  해결방법은
		  loc = "C:\\kim\\news\\temp" 이런식으로 입력하면 됨
		  
		 */
	}

}
