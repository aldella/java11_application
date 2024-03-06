package org.kh.ception;

public class Book {
//	Book 클래스 작성, bno bname price author pub, 직접접근X(정보은닉), getter/setter 작성, print()작성, 매개변수 갯수 따라 출력
	private int bno;
	private String bname;
	private int price;
	private String author;
	private String pub;
	
	public void print()
	{
		System.out.println("매개변수X");
	}
	public void print(int bno, String bname)
	{
		System.out.println(this.bno + " || " + this.bname);
	}
	public void print(int bno, String bname, String pub)
	{
		System.out.println(this.bno + " || " + this.bname + " || " + this.pub);
	}
	
	
	
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	
	
	
}
