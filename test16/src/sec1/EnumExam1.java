package sec1;

enum Week1 {
	//���������� ����̳� �ν��Ͻ��� ������ �� ���� �� public static, final �̶�� �Ҹ���. ������ ���� �ǹ̸� ��Ȯ�ϰ� �ؾ� �ϰų� �����Ͻÿ� ������ Ÿ�� �� ��ȿ�� üũ�� �Ϸ��� �� ��� Ȱ��
	//�⺻�� ������ �̾߱�
	SUN, MON, TUE, WED, THU, FRI, SAT
}

enum Week2 {
	//enum.valueOf(String str) : ���ڿ� str�� ��ġ�ϴ� ���Ű��� ��ȯ
	//enum.values() : ����(��)�� ��ü�� �迭�� ��ȯ
	//enum.ordinal() : ����(��)�� ������ ��ȯ
	SUN("��"), MON("��"), TUE("ȭ"), WED("��"), THU("��"), FRI("��"), SAT("��");
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
		System.out.println(w1);			// ��� : SUN
		
		String s = "MON";
		Week2 w2 = Week2.valueOf(s);
		System.out.println(w2);			// ��� : MON
		
		
		Week1[] arrWeek1 = Week1.values();
		for(Week1 w : arrWeek1) {
			System.out.println(w);		// ��� : SUN~SAT ���ʷ� ���
		}
		
		Week2[] arrWeek2 = Week2.values();
		for(Week2 w : arrWeek2) {
			System.out.println(w.ordinal()+"��° ���� -> "+w.getDay());
		}
	}
}
