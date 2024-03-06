package sec1;

public class CalcExam2 {
	public static void main(String arge[])
	{
//		Calculator a1 = new Calculator();
//		Calculator a1 = new Repeator();
//		Calculator a1 = new Arithmatic();
		Repeator a1 = new Repeator() {
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
		};
		int num1 = 50;
		int num2 = 4;
		System.out.println(a1.ERROR);
		System.out.println(a1.add(num1, num2));
		System.out.println(a1.divide(num1, num2));
		System.out.println(a1.multiply(num1, num2));
		System.out.println(a1.subtract(num1, num2));
		System.out.println(a1.power(num1, num2));
	}
}
