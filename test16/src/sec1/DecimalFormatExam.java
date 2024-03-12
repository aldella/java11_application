package sec1;

import java.text.DecimalFormat;

public class DecimalFormatExam {
//DecimalFormat : 숫자의 표시형식을 지정하여 활용하는 클래스
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//표시형식 코드 : 0, #
		//엑셀과 똑같음
		//, -> 천 단위 구분기호,   E -> 지수 형태로 표시   % -> 백분율 표시
		//-1234의 경우
		//#E0 : 1.234E+03
		//#% : -123400%
		double a = -1234567.89;
		DecimalFormat df = new DecimalFormat("####################");
//		DecimalFormat df = new DecimalFormat("0;\\ #,##0;-\\ #,##0"); <- 옛날엔 이게 잘 됐는데 (0일때, 양수일때, 음수일때) 이제는 안 됨. 세미콜론을 사용할 수 없다는 이야기
		String res = df.format(a);
		System.out.println(res);
	}

}
