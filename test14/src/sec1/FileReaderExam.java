package sec1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("FileReader");
		File file = new File("a.txt");
		if(file.exists()) {
			FileReader fr = new FileReader(file);
			while(fr.read() > 0) {
				System.out.print((char)fr.read());
			}
			fr.close();
		}
		System.out.println("\n\nBufferedReader");
		if(file.exists()) {
			BufferedReader fr = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = fr.readLine()) != null) {
				System.out.println(line);
			}
			fr.close();
		}
	}

}
