package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("a.txt"); //(상대경로)
		if (f1==null) System.out.println("파일이 없습니다");
		
		File f2 = new File("../sec1/a.txt"); //(상대경로)현재 디렉토리(sec0)보다 -> 상위디렉토리의 -> sec1의 -> a.txt
		
		File f3 = new File("d:"+File.separator+"taeyeong"+File.separator+"java2"+File.separator+"a.txt");
		//d:\\taeyeong\\java2\\a.txt 와 동일. (절대경로)

		String path = "d:\\taeyeong\\java2\\";
		File f4 = new File(path, "a.txt"); //(절대경로), File은 생성자 2개를 받기도 함.
		
		
	}

}
