package practice;

@FunctionalInterface
interface Calc {
	public int add(int s1, int s2);
}

public class practice {
	public static void main(String args[]) {
		Calc c1 = (int num1, int num2) -> {
			return num1+num2;
		};
		System.out.println(c1);
	}
}
