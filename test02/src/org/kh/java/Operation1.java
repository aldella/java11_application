package org.kh.java;

public class Operation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		명령(연산) = Operation(Opcode + Operand) : 0주소방식 ~ 3주소방식
//		입력 항에 따라 : 단항(Unary) 이항(Binary) 삼항(ThreeFlow)로 나뉨
		boolean b1 = true;
		boolean b2 = !b1; //단항
		
		int i1=20,i2=40;
		int i3 = i1 + i2; //이항
		
		int max = (i1 > i2) ? i1 : i2; //삼항
		//단항, 이항 연산자는 많은데, 삼항 연산자는 오직 하나밖에없다(위에쓴거)
		
		System.out.println("b1 : "+b1);
		System.out.println("b2 : "+b2);
		System.out.println("i3 : "+i3);
		System.out.println("max : "+max);
		
	}

}
