package sec1;

class Outer2 { //외부 클래스
	private int num = 10;
	private static int sNum=20;
	
	static class Inner { //정적 내부클래스
		int inNum = 1000;
		static int sInNum=2000;
		
		void inMethod() {
			System.out.println("내부 클래스의 인스턴스 변수" +inNum);
			System.out.println(sInNum);
//			System.out.println(num);     에러
			System.out.println(sNum);
		}
	}
	
	static void outMethod() { //외부클래스의 정적 메소드
//		System.out.println("내부 클래스의 인스턴스 변수" +inNum);   에러
		System.out.println(Inner.sInNum); //정적멤버필드 호출은 객체생성없이 클래스이름으로 가능하므로 그냥 내부 클래스이름으로 선언해주면된다(인스턴스 생성 필요 X)
//		System.out.println(num);   에러
		System.out.println(sNum);
	}
}

public class StaticInnerClassExam {
	public static void main(String args[]) {
		Outer2 out = new Outer2();
		Outer2.Inner inner = new Outer2.Inner(); //사실 static이라 굳이 객체까지 선언할 필요는 없는것임
//		out.outMethod();	//오류는 아닌데, static메소드이므로 객체생성해서 호출하지 말라고 주의문구 뜸
		Outer2.outMethod();
		inner.inMethod();
//		out.Inner.inMethod();	//오류. out:인스턴스	Inner:정적클래스.	따라서 out(인스턴스)를 생성하지 않고 클래스명으로 호출해서 사용해야한다
//		Outer2.Inner.inMethod();	//오류. Inner이 static이라해도 inMethod가 정적 메소드가 아니라 인스턴스메소드이기때문.
		//외부 클래스에서는 외부 메소드는 모두 실행가능, 정적내부 메소드 및 멤버 변수에 접근 및 실행 불가능.
		//정적 내부 클래스로 생성된 인스턴스는 내부 메소드 및 멤버 변수에 접근 및 실행이 가능, 외부는 불가능
		
	}
}
