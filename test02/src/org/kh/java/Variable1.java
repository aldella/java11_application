package org.kh.java;

public class Variable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;	//논리형 (true, false) : 1byte (1bit아님!!!)
		byte b = 127;		//-128~127
//		byte b = 255; : overflow(255는 해당 저장공간보다 큰 숫자이므로 overflow)
//		byte b = -129 : underflow
		short c = 32767;	//2byte = 16bit = 65536 -> -32768 ~ 32767
//		short c = 65535; : overflow
		char d = 'k';		//2byte - 한 글자만 저장할 수 있음
		int e = 234567;		//4byte
		float f = 3.14f;	//실수임을 알려주기 위해 f를 꼭 붙여줘야 함
		long g = 1312312312;	//남용시 메모리낭비
		double h = 3.14;	//얘는 f를 붙이지 않아도 됨
		double h2 = 3.14d;	//만약 죽어도 double형에서 바꾸기 싫다면 뒤에 d를 붙이면 됨
		System.out.println("byte : "+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println("short : "+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println("char : "+Character.MIN_VALUE+"~"+Character.MAX_VALUE);
		System.out.println("int : "+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println("float : "+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		System.out.println("long : "+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		System.out.println("double : "+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
	}

}
