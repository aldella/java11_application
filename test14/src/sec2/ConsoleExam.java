package sec2;

import java.io.Console;
import java.io.IOException;

public class ConsoleExam {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Console con = System.console();
		
		String name = con.readLine();
		int point = Integer.parseInt(con.readLine());
		double weight = Double.parseDouble(con.readLine());
		char[] pwc = con.readPassword();
		String pw = new String(pwc);
		
		Person p = new Person(name,point,weight);
		System.out.println(p.toString());
		System.out.println(pw);
	}
}
