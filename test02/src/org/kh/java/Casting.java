package org.kh.java;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		형 변환1(Auto Casting, Force Casting) = type conversion
		byte b = 20;	//1 byte
		short s = b;	//2 byte
		int i = s;		//4 byte
		long l = i;		//8 byte
		//Auto Casting : 작은 크기의 저장소에 있는 데이터값이 큰 크기의 저장소로 옮겨지는 것
		
//		int i2 = l : 더 작은 형식으로의 형변환은 Auto Casting으로는 불가능. 강제형변환(ForceCasting) 해줘야함
		int i2 = (int) l;
		short s2 = (short) i;
		byte b2 = (byte) s;
//		ForceCasting : 큰 크기의 저장소에 있는 데이터값을 별도의 타입 연산자를 활용하여 작은 저장소로 옮기는 것
//		강제캐스팅은 데이터의 정확도를 보장할 수 없다
	}

}
