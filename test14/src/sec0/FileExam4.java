package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("a.txt");
		File file2 = new File("b.txt");
		
		if (file1.createNewFile()) System.out.println("File Created Success");
		else System.out.println("File already exists");
		
		if (file2.createNewFile()) System.out.println("File Created Success");
		else System.out.println("File already exists");
	}

}
