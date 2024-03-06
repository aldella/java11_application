package org.kh.object1;

public class PersonEx1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person choe = new Person();
//		choe.name = "최태영";
//		choe.gender = "남";
//		choe.job = "무직백수";
//		choe.year = 26;
//		choe.running();
//		System.out.println(choe.name+choe.gender+choe.year);
		
//		Student choe = new Student();
//		choe.eng = 98;
//		choe.kor = 87;
//		choe.mat = 95;
//		choe.name = "최태영";
//		choe.resulting();
		
//		회원 클래스를 작성하되, 아이디(id), 비번(pw), 이메일(email), 생년(birth), 전번(tel)등을 요소로 하고, 회원정보를 출력하는메소드를만들어라
		Member a = new Member("adf","adsfa","ad@adfs.dfas",1111,"111111111");
		System.out.println(a.toString());
		System.out.println("pw:"+a.getPw());
	}

}
