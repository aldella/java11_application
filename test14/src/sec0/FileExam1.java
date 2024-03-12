package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam1 {
	public static void main(String args[]) throws IOException {
		String file1 = "d:\\taeyeong\\java2\\a.txt";				//���ð�δ� ��������"\"�� ǥ��
		String file2 = "http://192.168.1.104/data/menual/java.txt";	//���ݰ��(��)�� ������"/"�� ǥ��
		File f1 = new File(file1);
		
		String fileName = f1.getName(); //��θ� �����ϰ� �̸��� ������
		System.out.println(fileName);
		
		int pos = fileName.lastIndexOf("."); //�׳� indexOf�ϸ� ù ��° .�� ã�ԵǴµ� ����� .�ڰ� ���� �� ������ ���Ƽ� lastIndexOf�� ã�ƾ��Ѵ�
		System.out.println("Ȯ���ڿ� ���ϸ��� ������ ��Ÿ���� ���� ��ġ : "+pos);
		System.out.println("Ȯ���ڸ� ������ ������ �̸� : "+fileName.substring(0,pos));
		System.out.println("Ȯ���� : "+fileName.substring(pos+1)); //Ȥ��, fileName.subString(pos+1,fileName.length()) �̷���������
		
		System.out.println("��θ� ������ ������ ��ġ(������) : "+f1.getAbsolutePath());
		System.out.println("��θ� ������ ������ ��ġ(�����) : "+f1.getPath()); //getPath()�� "�ڱⰡ ������ ���"�� �ǹ��ϱ⶧����, �� ó���� �����η� �������� �����η� ������, ����η� �������� ����η� ���´�.
		System.out.println("������ ���� �ִ� ����(�θ�) ���丮 : "+f1.getParent());
		System.out.println("��� ������ : "+ File.separator); //File.seperatorChar�� ����
		//�ý��� ���� ���
		System.out.println("���� ����� ���丮(user.dir) : "+System.getProperty("user.dir")); //�ý��ۺ����� ���� �Ϳ� �����ϰ������ ������ System.getProperty("�׸� �̸�")
		//"user.dir" : �������� ���� "������Ʈ"������ ���. (��Ű���� �� ����)
		System.out.println("�ڹ� ���丮(sun.boot.class.path)" + System.getProperty("sun.boot.class.path"));
		System.out.println("�ü��(OS) ȯ�溯�� �� �ϴ���� : "+System.getenv()); //env()�ȿ� �ƹ��͵� �� ���� �׳� ��ü���
		System.out.println("�ü��(OS) ȯ�溯�� �� �κ���� : "+System.getenv("JAVA_HOME"));
		
		
	}
}
