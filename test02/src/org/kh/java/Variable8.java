package org.kh.java;

public class Variable8 {
public static void main(String[] arge)
{
	//가변 할당(동적 할당) = 자료형과 무관하게 해당하는 리터럴(값)에 의해 자료형이 자유롭게 변형되는 할당 방법
	//동적 할당이라 부르는 이유 : 자료형이란 메모리를 차지하는 만큼이니까 메모리를 할당받게되는데,
	//이 할당되는 메모리가 유동적으로 움직인다해서 동적할당
	var num1 = 29.456; //이 상에서 num1은 float
	var num2 = 34;
	var num3 = 'k';
	var num4 = "최태영";
	var num5 = true;
	
	num1 = 67; //현재 줄에서 num1은 int가 됨 = type이 바뀜 = 동적할당
	System.out.println("num1 : "+num1);
	System.out.println("num2 : "+num2);
	System.out.println("num3 : "+num3);
	System.out.println("num4 : "+num4);
	System.out.println("num5 : "+num5);
}
}
