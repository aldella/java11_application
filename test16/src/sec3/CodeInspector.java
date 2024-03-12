package sec3;

//PMD : 코드 인스펙션 -> 소스 코드 검증하여 성능개선, 코드 작성 규칙 준수, 에러 발생 가능성 최소화
//Code Inspection Level
//name			Symbol			Level		Comment
//Blocker		빨간색			High		필수, 에러 발생 가능성이 매우 높거나 메모리 누수가 발생되는 코드
//Critical		시안(하늘)		Medium High		권고 상, 에러 발생 가능성이 높거나 일반적으로 수정되어야하는 코드
//Urgent		초록				Medium		(Major)권고중, 에러 발생 가능성이 있거나 수정을 권고하는 중요 위치
//Important		마젠타		Mediuim Low		(Mino)소스코드의 가독성, 유지보수성 향상을 위해 수정을 권고
//Warning		파랑				Low			(Info)정보성으로 제공되는 위반사항으로 개발자가 참고하여

public class CodeInspector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader r1 = new Reader();
		Reader r2 = new Reader(2,"https://www.naver.com","네이버사이트",1);
		r1.def="시작 페이지";
//		System.out.println(r2);
//		System.out.println(r1);
//		System.out.println(r2.def);
	}

}
