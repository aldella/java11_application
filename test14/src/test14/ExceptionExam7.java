package test14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionExam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("indata.txt");
			try {
				fos = new FileOutputStream("outdata.txt");
			} catch(FileNotFoundException e2) {
				System.out.println("��������� ã�� �� �����ϴ�.");
			} catch (Exception e2) {
				System.out.println("��°��� �� ��ü�Ҹ��� ���� �߻�");
			} finally {
				System.out.println("��� ����");
			}
		} catch (FileNotFoundException e) {
			System.out.println("�Է������� ã�� �� �����ϴ�.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("�Է°��� �� ��ü�Ҹ��� ���� �߻�");
		} finally {
			System.out.println("�Է�����");
		}
	}

}
