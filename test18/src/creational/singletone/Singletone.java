package creational.singletone;

public class Singletone {
	private static Singletone instance; //static ����ʵ�(singletone)�� �����޸��̸�, Ŭ������ �ڱ��ڽ��� �ν��Ͻ� �ϳ��� �������Ѵ�
	private int msg;
	private Singletone(int msg) {
		this.msg = msg;
	}
	public static Singletone getInstance(int msg) {
		if (instance == null) instance = new Singletone(msg);
		return instance;
	}
//	static �޼ҵ�� ��ü�������� Singletone.getInstance(5) �̷������� ����
}
