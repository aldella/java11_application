package sec1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedOutputStream output = null;
		String content = "sdklajf dskljflksjadfkjaslfdkjdsafklajfjdsalkfjklsadfklsjdl sdaf asdasd fsa";
		try {
			output = new BufferedOutputStream(new FileOutputStream("c.txt"));
			output.write(content.getBytes());
			
		} catch(IOException e) {
			System.out.println("출력할 데이터 파일 오류");
		} finally {
			if(output != null) {
				try {
					output.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
