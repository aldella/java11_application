package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("항상출력");
		}
		System.out.println("예외처리 다음 문장"); //예외처리를 안 할 시, 이 문장이 출력이안됨. 그러나 trycatch를 하면 출력이 됨
	}
}
