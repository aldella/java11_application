package sec2;

import java.io.IOException;

public class SystemInExam {
//Ű����� �� ���� �Է¹޾� ���
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("���� �� ���ڸ� �Է��ϰ�, [enter]�� ��������.");
		int i;
		try {
			i = System.in.read(); //�ƽ�Ű�ڵ� �� ���ڸ� �Է¹���
			System.out.println();
			System.out.println("�Էµ� ���� : "+(char)i);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
