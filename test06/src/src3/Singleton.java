package src3;

public class Singleton {
	private static Singleton instance;	//자기자신을 호출 + 정적개체 선언 + private
	private Singleton() {}				//private를 걸어버림 외부에서 못 만들게
	public static synchronized Singleton getInstance() {
		if(instance == null) instance = new Singleton();
		return instance;
	}
	//이 Singleton이라는 클래스는 new 생성자로는 새로 생성할 수 없고, getInstance()로만 생성가능. instance가 null인지 확인 후 생성가능
}
