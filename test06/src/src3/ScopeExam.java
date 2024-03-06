package src3;

public class ScopeExam {
	int a = 10; //전역변수 a
	static int b = 100; //클래스변수+전역변수 b
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		System.out.println("a="+a); //지역변수 a
	}
	public static void run()
	{
		System.out.println("b="+b); //클래스변수 b
//		System.out.println("a="+a);
	}
	public static void run(int a)
	{
		System.out.println("매개변수 a="+a); //매개변수 a
	}

}
