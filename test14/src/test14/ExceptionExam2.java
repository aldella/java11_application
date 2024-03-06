package test14;

public class ExceptionExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		try {
			System.out.println(name.toString());
			System.out.println("정상처리문장아래");
		} catch(NullPointerException e) {
			//예외가 발생할 경우 처리할 문장
			e.printStackTrace();
			System.out.println("널포인터예외처리문장아래");
		} catch(Exception e) {
			System.out.println("정체를 알 수 없는 오류 발생");
		}
	}

}
