package org.kh.java;

public class Variable7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "최태영";
		int ageInt = 26;
		float height_float = 171.1f;
		boolean pass = true;
		double weight_double = 55.5;
		
		System.out.println("name : "+name.getClass().getName());
//		System.out.println("age : "+ageInt.getClass().getName());
//		System.out.println("height : "+height_float.getClass().getName());
//		System.out.println("weight : "+weight_double.getClass().getName());
//		int, float, double은 기본형이라 class가 없음
		
		Integer ageInteger = 26;
		Float height_Float = 171.1f;
		Double weight_Double = 55.5;
		System.out.println("age1 : "+ageInteger.getClass().getName());
		System.out.println("height : "+height_Float.getClass().getName());
		System.out.println("weight : "+weight_Double.getClass().getName());
		
//		String(reference) -> primitive 간의 형변환, 계산 검증
		String age2 = "26";
		int age3 = Integer.parseInt(age2)+8-8;
		System.out.println("age3 : "+age3);
		String height2 = "171.1";
		float height3 = Float.parseFloat(height2);
		System.out.println("height3 : "+height3);
		
		//primitive type -> Wrapper type(class) : boxing
		//Wrapper type(class) -> primitive type : unboxing
	}

}
