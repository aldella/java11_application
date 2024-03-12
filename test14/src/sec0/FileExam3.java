package sec0;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExam3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("student"); //student라는 파일은 없었음.
		f.mkdir(); //test15가 현재 디렉토리이므로 test15안에 student 디렉토리 생성. 단!!! 현재 경로는 아직 test15임 (student가 아님)
		f.setLastModified(new Date().getTime()); //폴더수정날짜를 바꾸기
		f.setReadOnly(); //읽기전용으로만들기
		
		File f2 = new File("manage/teacher/kt");
		f2.mkdirs(); //한 번에 폴더를 여러 개 만들어야 할 때
	}

}
