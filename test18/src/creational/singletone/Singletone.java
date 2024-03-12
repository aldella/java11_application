package creational.singletone;

public class Singletone {
	private static Singletone instance; //static 멤버필드(singletone)는 공유메모리이며, 클래스가 자기자신의 인스턴스 하나를 가져야한다
	private int msg;
	private Singletone(int msg) {
		this.msg = msg;
	}
	public static Singletone getInstance(int msg) {
		if (instance == null) instance = new Singletone(msg);
		return instance;
	}
//	static 메소드는 객체생성없이 Singletone.getInstance(5) 이런식으로 생성
}
