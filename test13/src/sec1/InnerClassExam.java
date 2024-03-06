package sec1;

class Outer { //외부클래스
	private int num = 10;
	private static int sNum=20;
	public Inner inner; //* //인스턴스 내부 클래스 -> 외부클래스에서 내부클래스에 대한 인스턴스를 생성해주었음. 타 클래스에서 내부클래스에 접근해주려면 인스턴스 필요
	public Outer() {
		inner = new Inner();
	}
	class Inner { //내부클래스
		int iNum = 1000;
		void inMethod() {
			System.out.println("내부 클래스에서 외부클래스의 멤버 : num" + num);
			System.out.println(sNum);
		}
	}
	public void outMethod() { //외부클래스에서 내부클래스의 메소드 호출할때는 내부클래스객체 하나 생성해주고 사용해야함
		inner.inMethod();
	}
}

public class InnerClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		out.outMethod(); //타 클래스에서 객체 생성 후, 외부클래스의 멤버메소드 호출. 얘는 그냥 하면 됨
		out.inner.inMethod(); //타 클래스에서 객체 생성 후, 내부클래스의 멤버메소드 호출. 이 부분(*)이 private로 생성되어있으면 접근을 못 하니, public으로 생성을 해둬야한다
	}

}
