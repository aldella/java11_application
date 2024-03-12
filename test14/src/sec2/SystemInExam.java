package sec2;

import java.io.IOException;

public class SystemInExam {
//키보드로 한 글자 입력받아 출력
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("영문 한 글자를 입력하고, [enter]을 누르세요.");
		int i;
		try {
			i = System.in.read(); //아스키코드 한 글자만 입력받음
			System.out.println();
			System.out.println("입력된 문자 : "+(char)i);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
