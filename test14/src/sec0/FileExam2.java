package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("a.txt"); //(�����)
		if (f1==null) System.out.println("������ �����ϴ�");
		
		File f2 = new File("../sec1/a.txt"); //(�����)���� ���丮(sec0)���� -> �������丮�� -> sec1�� -> a.txt
		
		File f3 = new File("d:"+File.separator+"taeyeong"+File.separator+"java2"+File.separator+"a.txt");
		//d:\\taeyeong\\java2\\a.txt �� ����. (������)

		String path = "d:\\taeyeong\\java2\\";
		File f4 = new File(path, "a.txt"); //(������), File�� ������ 2���� �ޱ⵵ ��.
		
		
	}

}
