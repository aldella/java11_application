package sec1;

import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat : 날짜 표시형식을 지정할 때 활용하는 클래스

public class DateFormatExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		//표시형식 코드 : y-년, M-월 (소문자안됨 대문자써야함, minute랑 구분위함), d-일, E-요일, a-오전/오후, W-현재 월 중 몇번째 주, w-현재 연도 중 몇번째 주
		SimpleDateFormat fmt1 = new SimpleDateFormat("y년 M월 d일 h시 mm분 ss초");
		SimpleDateFormat fmt2 = new SimpleDateFormat("오늘날짜 : yyyy년 MM월 dd일(E) 월중W번째주 연중w번째주 a h시 mm분 ss초");
		
		//날짜 데이터에서 특정 표시형식이 부여된 문자열로 변환
		String t1 = fmt1.format(today);
		System.out.println(t1);
		String t2 = fmt2.format(today);
		System.out.println(t2);
		
	}

}
