package sec2;
//함수(메소드) 정의와 사용방법

class Met1 {
	void method1() {			//매개변수X, 반환X
		int x = 100, y=200;
		System.out.println(x+y);
	}
}
class Met2 {					//매개변수O, 반환X
	void method2(int x, int y) {
		System.out.println(x+y);
	}
}
class Met3 {
	int method3() {				//매개변수X, 반환O
		int x = 100, y=200;
		return x+y;
	}
}
class Met4 {
	int method4(int x, int y) {	//매개변수O, 반환O
		return x+y;
	}
}

public class FunctionExam {

	public static void main(String[] args) {
		//메서드 : 특정 클래스에 멤버로 규정되어 있어서 객체 생성을 하고, 해당 객체, 메소드명 (값, , , ...)로 호출하여 사용.
		//함수와 메서드의 차이 : 함수는 그 앞에 클래스(혹은 객체)명이 없다. 소속되어있는 클래스가 없기때문에 객체를 선언해주지 않아도 된다. 그러나 함수는 해당 클래스를 벗어나면 사용할 수가 없다...
		
		// TODO Auto-generated method stub
		Met1 met1 = new Met1();
		met1.method1();

		Met2 met2 = new Met2();
		met2.method2(10,20);
		
		Met3 met3 = new Met3();
		System.out.println(met3.method3());
		
		Met4 met4 = new Met4();
		System.out.println(met4.method4(10,20));
		
		func1();
	}
	
	public static void func1() {
		
	}
}
