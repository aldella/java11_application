package test14;

public class ExceptionExam1 {
//	����(Exception)ó�� : ���α׷��� ������ ������ �߻��ϸ�, �� ������ ó�������� ó������ ���ϰ�, ������ �����Ǵµ�
//	�̷��� ��츦 ����(Exception)��� �ϸ�, �׷��ٸ� ����������� ����� �� �ֵ��� �ϴ� ���� ����ó����� �Ѵ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		try {
			System.out.println(name.toString());
		} catch(Exception e) {
			//���ܰ� �߻��� ��� ó���� ����
			System.out.println("�� �� ���� ���ܰ� �߻��Ͽ����ϴ�");
		}
	}
}
