package sec1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("e.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		BufferedWriter fw = new BufferedWriter(new FileWriter(file,true));
		String i = "d�󤿤Ӥ���������";
		fw.write(i);
		fw.newLine(); //�ٹٲ�
		fw.write("�ܰܰܰܰܰܰܰ�");
		fw.newLine(); //�ٹٲ�
		fw.write("����");
		fw.flush();
		fw.close();
	}

}
