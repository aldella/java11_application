package sec1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("b.txt");
		if (f1.createNewFile()) System.out.println("���� ���� ����");
		else System.out.println("�̹� ������ �����մϴ�.");
		
		String data = "fjkadsjfkldsjflasjlfsl f dsa fads ";
		FileOutputStream fos = new FileOutputStream(f1);
		fos.write(data.getBytes());
		fos.close();
		
		FileInputStream fis = new FileInputStream(f1);
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
	}

}
