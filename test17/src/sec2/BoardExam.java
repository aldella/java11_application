package sec2;

public class BoardExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board mem = new Board();
		mem.setBno(1);
		mem.setContent("내용");
		mem.setTitle("제목");
		mem.setViewCnt(3);
		System.out.println(mem.toString());
	}

}
