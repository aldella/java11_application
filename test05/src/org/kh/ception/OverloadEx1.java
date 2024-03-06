package org.kh.ception;

public class OverloadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pro1 = new Product();
		pro1.print();
		pro1.print("긱기");
		pro1.print("긱기", 500);
		pro1.print(200);
		
		System.out.println();
		
		///////////////////////////////////////////////////
//		
//		평균을(avg()) 구항 출력하는 resulting()메소드
//		Member 클래서 작성, id pw email birth tel, 모든 요소 출력 toString()
//		Book 클래스 작성, bno bname price author pub, 직접접근X(정보은닉), getter/setter 작성, print()작성, 매개변수 갯수 따라 출력
		
		Member mem = new Member();
		Book b = new Book();
		System.out.println(mem.toString());
		b.setAuthor("저자");
		b.setBname("이름");
		b.setBno(1);
		b.setPrice(2);
		b.setPub("Pub");
		b.print();
		b.print(1,"2","3");
		
		System.out.println();
		
		///////////////////////////////////////////////////
		
		Board b1 = new Board();
		b1.setBno(1);
		b1.setTitle("1");
		b1.setUname("11");
		
		Board b2 = new Board(2);
		b2.setTitle("2");
		b2.setUname("22");
		
		Board b3 = new Board(3, "3");
		b3.setUname("33");
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		
		Notice n1 = new Notice(9, "99", "99", "99", "99", 9);
		System.out.println(n1.toString());
		
	}

}
