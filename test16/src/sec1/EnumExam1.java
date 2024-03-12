package sec1;

enum Week1 {
	//열거형으로 상속이나 인스턴스를 생성할 수 없음 → public static, final 이라는 소리임. 데이터 값의 의미를 명확하게 해야 하거나 컴파일시에 데이터 타입 및 유효성 체크를 하려고 할 경우 활용
	//기본이 상수라는 이야기
	SUN, MON, TUE, WED, THU, FRI, SAT
}

enum Week2 {
	//enum.valueOf(String str) : 문자열 str과 일치하는 열거값을 반환
	//enum.values() : 열거(값)형 전체를 배열로 반환
	//enum.ordinal() : 열거(값)형 순서를 반환
	SUN("일"), MON("월"), TUE("화"), WED("수"), THU("목"), FRI("금"), SAT("토");
	final private String day;
	
	Week2(String day) {
		this.day = day;
	}
	String getDay() {
		return day;
	}
}

public class EnumExam1 { 
	public static void main(String args[]) {
		Week1 w1 = Week1.SUN;
		System.out.println(w1);			// 결과 : SUN
		
		String s = "MON";
		Week2 w2 = Week2.valueOf(s);
		System.out.println(w2);			// 결과 : MON
		
		
		Week1[] arrWeek1 = Week1.values();
		for(Week1 w : arrWeek1) {
			System.out.println(w);		// 결과 : SUN~SAT 차례로 출력
		}
		
		Week2[] arrWeek2 = Week2.values();
		for(Week2 w : arrWeek2) {
			System.out.println(w.ordinal()+"번째 요일 -> "+w.getDay());
		}
	}
}
