package test14;

public class ExceptionExam4 {
	public static void main(String args[]) {
		String data1 = "1004";
		String data2 = "kim1004";
		try {
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
		} catch(NumberFormatException e) {
			System.out.println("오류발생시구문");
		}
	}
}
