package test14;

public class ExceptionExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		try {
			System.out.println(name.toString());
			System.out.println("����ó������Ʒ�");
		} catch(NullPointerException e) {
			//���ܰ� �߻��� ��� ó���� ����
			e.printStackTrace();
			System.out.println("�������Ϳ���ó������Ʒ�");
		} catch(Exception e) {
			System.out.println("��ü�� �� �� ���� ���� �߻�");
		}
	}

}
