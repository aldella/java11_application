package sec1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExam1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("a.txt");
		FileInputStream fis = new FileInputStream(f1);
//		EOF(End Of File) -> -1�� ���� �ǹ���
		int i;
		while((i = fis.read()) != -1) {
			System.out.print((char)i); //FileInputStream -> ����Ʈ��Ʈ���̱⶧����, 1����Ʈ ������ �о���� ���. ���� �ƽ�Ű�ڵ�(��������)�� ���� �� �ְ�, �����ڵ�(Ư������)�� ���� ����
		}
		
	}

}
