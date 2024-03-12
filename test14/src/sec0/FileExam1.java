package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam1 {
	public static void main(String args[]) throws IOException {
		String file1 = "d:\\taeyeong\\java2\\a.txt";				//로컬경로는 역슬래시"\"로 표현
		String file2 = "http://192.168.1.104/data/menual/java.txt";	//원격경로(웹)는 슬래시"/"로 표현
		File f1 = new File(file1);
		
		String fileName = f1.getName(); //경로를 제외하고 이름을 가져옴
		System.out.println(fileName);
		
		int pos = fileName.lastIndexOf("."); //그냥 indexOf하면 첫 번째 .을 찾게되는데 요새는 .자가 많이 들어간 파일이 많아서 lastIndexOf로 찾아야한다
		System.out.println("확장자와 파일명의 구분을 나타내는 점의 위치 : "+pos);
		System.out.println("확장자를 제외한 파일의 이름 : "+fileName.substring(0,pos));
		System.out.println("확장자 : "+fileName.substring(pos+1)); //혹은, fileName.subString(pos+1,fileName.length()) 이래도괜찮음
		
		System.out.println("경로를 포함한 파일의 위치(절대경로) : "+f1.getAbsolutePath());
		System.out.println("경로를 포함한 파일의 위치(상대경로) : "+f1.getPath()); //getPath()는 "자기가 기재한 경로"를 의미하기때문에, 맨 처음에 절대경로로 적었으면 절대경로로 나오고, 상대경로로 적었으면 상대경로로 나온다.
		System.out.println("파일이 속해 있는 상위(부모) 디렉토리 : "+f1.getParent());
		System.out.println("경로 구분자 : "+ File.separator); //File.seperatorChar과 동일
		//시스템 변수 출력
		System.out.println("현재 사용자 디렉토리(user.dir) : "+System.getProperty("user.dir")); //시스템변수에 관한 것에 접근하고싶으면 무조건 System.getProperty("항목 이름")
		//"user.dir" : 실행중인 현재 "프로젝트"까지의 경로. (패키지는 안 나옴)
		System.out.println("자바 디렉토리(sun.boot.class.path)" + System.getProperty("sun.boot.class.path"));
		System.out.println("운영체제(OS) 환경변수 값 싹다출력 : "+System.getenv()); //env()안에 아무것도 안 쓰면 그냥 전체출력
		System.out.println("운영체제(OS) 환경변수 값 부분출력 : "+System.getenv("JAVA_HOME"));
		
		
	}
}
