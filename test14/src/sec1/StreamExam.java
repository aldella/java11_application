package sec1;


// 파일/키보드/데이터 입력 : FileinputStream, BufferedInputStream, FileReader, BufferedReader
// 파일/키보드/데이터 출력 : FileOutputStream, BufferedOutputStream, FileWriter, BufferedWriter
// stream으로 끝나는 클래스는 데이터입출력을 바이트단위로 : FileinputStream, BufferedInputStream, FileOutputStream, BufferedOutputStream
// stream으로 끝나지 않는 클래스는 데이터입출력을 문자단위로 받는다 : FileReader, BufferedReader, FileWriter, BufferedWriter


public class StreamExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileInputStream = "FileInputStream은 바이트단위로 입력하기 위한 스트림";
		String BufferedInputStream = "BufferedInputStream은 바이트 단위로 입력을 받고, 메모리 버퍼로 로딩 후";
		String fileReader = "FileReader은 문자 단위로 입력하기 위한 스트림";
		String bufferedReader = "BufferedReader는 문자 단위로 입력하기 위한 스트림 : 메모리 버퍼로 로딩 후";
		String fileOutputStream = "FileOutputStream은 바이트단위로 출력하기 위한 스트림";
		String BufferedOutputStream = "BufferedOutputStream은 바이트단위로 출력하기위한 스트림 : 메모리 버퍼로 로딩 후";
		String fileWriter = "FileWriter은 문자 단위로 출력하기 위한 스트림";
		String bufferedWriter = "BufferedWriter은 문자단위로 출력하기 위한 스트림 : 메모리 버퍼로 로딩 후";
		
		
	}

}
