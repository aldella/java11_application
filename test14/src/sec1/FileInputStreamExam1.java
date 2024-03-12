package sec1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExam1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("a.txt");
		FileInputStream fis = new FileInputStream(f1);
//		EOF(End Of File) -> -1의 값을 의미함
		int i;
		while((i = fis.read()) != -1) {
			System.out.print((char)i); //FileInputStream -> 바이트스트림이기때문에, 1바이트 단위로 읽어오고 출력. 따라서 아스키코드(영문숫자)만 읽을 수 있고, 유니코드(특수문자)는 읽지 못함
		}
		
	}

}
