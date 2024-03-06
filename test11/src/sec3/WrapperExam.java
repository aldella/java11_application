package sec3;

public class WrapperExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;		//기본타입 선언
		Integer b=a;	//참조형타입 선언(기본형 데이터를 참조형에 집어넣음 : Wrapping, Boxing)
		int c=b;		//기본형에 참조형 데이터 대입 : UnWrap, UnBoxing
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println(Integer.valueOf("10"));
	}

}
