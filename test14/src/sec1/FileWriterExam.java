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
		String i = "d∂Û§ø§”§±§∑§§∑Ø§”";
		fw.write(i);
		fw.newLine(); //¡ŸπŸ≤ﬁ
		fw.write("∞‹∞‹∞‹∞‹∞‹∞‹∞‹∞‹");
		fw.newLine(); //¡ŸπŸ≤ﬁ
		fw.write("ææ∆‡");
		fw.flush();
		fw.close();
	}

}
