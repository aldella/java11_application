package exam;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		if (operator == '+')
		{
			System.out.println(num1+num2);
		} else if (operator == '-')
		{
			System.out.println(num1-num2);
		} else if (operator == '*')
		{
			System.out.println(num1*num2);
		} else if (operator == '/')
		{
			System.out.println(num1/num2);
		}
		
		for (int i = 1; i<=9; i++) {
			if (i % 2 != 0) continue;
			for (int j=2; j<=9; j+=2) {
				System.out.printf("%d * %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 2; i<=9; i++) {
			for (int j = 1; j<=9; j++)
			{
				if (i<j) break;
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println();
		}
		
		for(int i=7; i>=1; i-=2)
		{
			for(int j = i; j>0; j--)
			{
				System.out.printf(" ");
			}
			System.out.printf("* ");
			for(int j=5; j>=i; j-=2)
			{
				System.out.printf("* * ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		for(int i=7; i>=1; i-=2)
		{
			for(int j = i; j>0; j--)
			{
				System.out.printf(" ");
			}
			System.out.printf("* ");
			for(int j=5; j>=i; j-=2)
			{
				System.out.printf("* * ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i+=2)
		{
			System.out.printf("  ");
			for(int j = i; j>0; j--)
			{
				System.out.printf(" ");
				
			}
			System.out.printf("* ");
			for(int j=3; j>=i; j-=2)
			{
				System.out.printf("* * ");
			}
			System.out.println();
		}
	}

}
