package sec2;

import java.util.List;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Notice> nVector = new Vector<>();
		
		nVector.add(new Notice("제목1","내용1","1"));
		nVector.add(new Notice("제목2","내용2","2"));
		nVector.add(new Notice("제목3","내용3","3"));
		nVector.add(new Notice("제목4","내용4","4"));
		nVector.add(new Notice("제목5","내용5","5"));
		nVector.add(new Notice("제목6","내용6","6"));
		
		nVector.remove(2);
		//글 목록
		System.out.println("제목\t내용\t작성자");
		for(Notice n : nVector) {
			System.out.println(n.getTitle() + "\t" + n.getContent() + "\t" + n.getAuthor());
		}
		Notice no = new Notice("제목10", "내용10", "김김김");
		nVector.set(2, no);
		System.out.println("제목\t내용\t작성자");
		for(Notice n : nVector) {
			System.out.println(n.getTitle() + "\t" + n.getContent() + "\t" + n.getAuthor());
		}
		
		for(int i=0; i<nVector.size(); i++) {
			Notice n = nVector.get(i);
			System.out.println(n.getTitle() + "\t" + n.getContent() + "\t" + n.getAuthor());
		}
	}

}
