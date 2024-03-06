package sec1;

public class Arithmatic extends Repeator {

	@Override
	public int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}
	
	public int power(int num1, int num2)
	{
		int p = num1;
		for(int i=1; i<num2; i++)
		{
			num1=num1*p;
		}
		return num1;
	}
	
	public void print()
	{
		System.out.println("계산기, 중계기, 연산기를 구현합니다.");
	}
	
}
