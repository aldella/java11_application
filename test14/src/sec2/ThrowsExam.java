package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		String absolutePath = "d:\\taeyeong\\java2\\a.txt";	//������
		String relativePath = "./a.txt";					//�����, ������丮 : .
		String relativePath2 = "../a.txt";					//�����, �������丮 : ..
		String relativePath3 = "../../a.txt";				//���� ���丮�� �� �� �̵��� ��
		fis = new FileInputStream("d:\\taeyeong\\java2\\a.txt");
		if(fis!=null) {
			fis.close();
		}
	}

}
