package sec2;

import java.io.IOException;

public class SystemInExam2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("영어 여러 글자를 입력하고, [enter]을 누르세요.");
		int i;
		String data = "";
		try {
			while((i = System.in.read()) != '\n') {
				data += (char)i;
			}
			System.out.println();
			System.out.println("입력된 문자 : "+(char)i);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(data);
	}

}
