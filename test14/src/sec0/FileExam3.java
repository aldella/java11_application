package sec0;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExam3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("student"); //student��� ������ ������.
		f.mkdir(); //test15�� ���� ���丮�̹Ƿ� test15�ȿ� student ���丮 ����. ��!!! ���� ��δ� ���� test15�� (student�� �ƴ�)
		f.setLastModified(new Date().getTime()); //����������¥�� �ٲٱ�
		f.setReadOnly(); //�б��������θ����
		
		File f2 = new File("manage/teacher/kt");
		f2.mkdirs(); //�� ���� ������ ���� �� ������ �� ��
	}

}
