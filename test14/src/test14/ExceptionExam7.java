package test14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionExam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("indata.txt");
			try {
				fos = new FileOutputStream("outdata.txt");
			} catch(FileNotFoundException e2) {
				System.out.println("출력파일을 찾을 수 없습니다.");
			} catch (Exception e2) {
				System.out.println("출력과정 중 정체불명의 에러 발생");
			} finally {
				System.out.println("출력 종료");
			}
		} catch (FileNotFoundException e) {
			System.out.println("입력파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("입력과정 중 정체불명의 에러 발생");
		} finally {
			System.out.println("입력종료");
		}
	}

}
