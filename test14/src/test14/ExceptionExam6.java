package test14;

public class ExceptionExam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
				Class driver = Class.forName("oracle.jdbc.driver");
			} catch (ClassNotFoundException e) { //�ش� Ŭ������ ã�� �� ���� ���. ��, ����̹� ��Ű���� �̸��� Ʋ�Ȱų� ���̺귯���� �߰����� ���� ���
				System.out.println("�ش� ����Ŭ ����̹��� ã�� ���߽��ϴ�.");
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("���κҸ�");
			} finally {
				System.out.println("����");
			}

	}

}
