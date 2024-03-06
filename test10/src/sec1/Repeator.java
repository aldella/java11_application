package sec1;

public abstract class Repeator implements Calculator{
	public int add(int num1, int num2)
	{
		return num1+num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public abstract int multiply(int nm1, int num2);

	@Override
	public abstract int subtract(int num1, int num2);
	
	public abstract int power(int num1, int num2);
	
}
