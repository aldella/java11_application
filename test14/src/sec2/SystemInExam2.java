package sec2;

import java.io.IOException;

public class SystemInExam2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("���� ���� ���ڸ� �Է��ϰ�, [enter]�� ��������.");
		int i;
		String data = "";
		try {
			while((i = System.in.read()) != '\n') {
				data += (char)i;
			}
			System.out.println();
			System.out.println("�Էµ� ���� : "+(char)i);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(data);
	}

}
