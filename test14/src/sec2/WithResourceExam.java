package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("���ҽ��� �ڵ����� close�Ǿ����ϴ�");
	}
}

public class WithResourceExam {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		fis = new FileInputStream("a.txt");
		try(A obj = new A()) {
			throw new Exception();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
