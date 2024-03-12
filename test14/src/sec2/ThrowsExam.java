package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		String absolutePath = "d:\\taeyeong\\java2\\a.txt";	//절대경로
		String relativePath = "./a.txt";					//상대경로, 현재디렉토리 : .
		String relativePath2 = "../a.txt";					//상대경로, 상위디렉토리 : ..
		String relativePath3 = "../../a.txt";				//상위 디렉토리로 두 번 이동한 것
		fis = new FileInputStream("d:\\taeyeong\\java2\\a.txt");
		if(fis!=null) {
			fis.close();
		}
	}

}
