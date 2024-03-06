package sec1;

class Outer3 { //외부클래스
	
	//익명의 내부 클래스를 선언시에는 Runnable로 구현해야한다.
	Runnable getRunnable(int i) { //Runnable은 인터페이스이므로, 인스턴스 생성시 기본 메소드인 run()메소드를 구현해야한다.
		int num=100;
		return new Runnable() {
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	//익명의 실행 인스턴스(객체)를 Runnable로 생성
	Runnable runner = new Runnable() { //실제 내부클래스는 얘인거임. out.runner.run()하면 얘가나옴
		public void run(){
			System.out.println("runnable 익명 내부클래스");
		}
	};
}

public class AnonymousInnerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer3 out = new Outer3();
		out.getRunnable(5);
		out.runner.run();
		
		Runnable runAble = out.getRunnable(500);
		runAble.run();
	}

}
