package sec3;

//PMD : �ڵ� �ν���� -> �ҽ� �ڵ� �����Ͽ� ���ɰ���, �ڵ� �ۼ� ��Ģ �ؼ�, ���� �߻� ���ɼ� �ּ�ȭ
//Code Inspection Level
//name			Symbol			Level		Comment
//Blocker		������			High		�ʼ�, ���� �߻� ���ɼ��� �ſ� ���ų� �޸� ������ �߻��Ǵ� �ڵ�
//Critical		�þ�(�ϴ�)		Medium High		�ǰ� ��, ���� �߻� ���ɼ��� ���ų� �Ϲ������� �����Ǿ���ϴ� �ڵ�
//Urgent		�ʷ�				Medium		(Major)�ǰ���, ���� �߻� ���ɼ��� �ְų� ������ �ǰ��ϴ� �߿� ��ġ
//Important		����Ÿ		Mediuim Low		(Mino)�ҽ��ڵ��� ������, ���������� ����� ���� ������ �ǰ�
//Warning		�Ķ�				Low			(Info)���������� �����Ǵ� ���ݻ������� �����ڰ� �����Ͽ�

public class CodeInspector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader r1 = new Reader();
		Reader r2 = new Reader(2,"https://www.naver.com","���̹�����Ʈ",1);
		r1.def="���� ������";
//		System.out.println(r2);
//		System.out.println(r1);
//		System.out.println(r2.def);
	}

}
