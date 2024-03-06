package org.kh.object2;

public class Compute01 {
	void fn1()
	{
		System.out.println("반환X 매개변수X");
	}
	void fn2(int a)
	{
		System.out.println("반환X 매개변수O : " + a);
	}
	int fn3(int a)
	{
		return a;
	}
	String fn4(int a)
	{
		if (a>=50)
		{
			return "5555";
		} else {
			return "0000";
		}
	}
}
