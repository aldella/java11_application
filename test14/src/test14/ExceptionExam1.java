package test14;

public class ExceptionExam1 {
//	예외(Exception)처리 : 프로그래밍 로직상 에러가 발생하면, 그 이후의 처리문장은 처리되지 못하고, 실행이 중지되는데
//	이러한 경우를 예외(Exception)라고 하며, 그렇다면 다음문장까지 실행될 수 있도록 하는 것을 예외처리라고 한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		try {
			System.out.println(name.toString());
		} catch(Exception e) {
			//예외가 발생할 경우 처리할 문장
			System.out.println("알 수 없는 예외가 발생하였습니다");
		}
	}
}
