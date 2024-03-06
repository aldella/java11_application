package org.kh.ception;

public class News {
	private int bno;
	private String title;
	private String uname;
	private String content;
	private String author;
	private int visited;
	
	public News() {
		this(1);
	}
	
	public News(int bno) {
		this(bno, "제목없음");
	}
	
	public News(int bno, String title) {
		this(bno, title, "미상");
	}
	
	public News(int bno, String title, String uname) {
		this(bno, title, uname, "내용없음");
	}
	
	public News(int bno, String title, String uname, String content) {
		this(bno, title, uname, content, "미상");
	}
	
	public News(int bno, String title, String uname, String content, String author) {
		this(bno, title, uname, content, author, 0);
	}

	
	public News(int bno, String title, String uname, String content, String author, int visited) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.author = author;
		this.visited = visited;
	}

}
