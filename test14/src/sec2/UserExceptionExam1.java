package sec2;

class MadeByMeException extends Exception {
	public MadeByMeException() {}
	public MadeByMeException(String msg) {
		System.out.println("msg : "+msg);
		System.out.println("����� ���� ���� �߻�");
	}
}

public class UserExceptionExam1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		} catch (MadeByMeException e) {
			e.printStackTrace();
		}
	}
	public static void method1() throws MadeByMeException {
		throw new MadeByMeException("����ڿ���");
	}
}
