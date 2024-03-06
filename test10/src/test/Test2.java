package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] memberArr = {"홍길동","김성훈","윤웅식","윤성우","남궁인"};
		System.out.print("검색할 회원 이름을 입력하세요 : ");
		String searchName = sc.next();
		System.out.println(searchName);
		boolean result = false;
		System.out.println(memberArr[1]);
		for(int i=0;i<memberArr.length;i++) {
			if(memberArr[i].toString()==searchName.toString()) {
				result = true;
				break;
			}
		}
		
		if(result) {
			System.out.println("회원이 존재합니다.");
		}else {
			System.out.println("회원이 존재하지 않습니다.");
		}
	}

}
