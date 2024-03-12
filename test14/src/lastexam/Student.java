package lastexam;

public class Student {
	private int no;
	private String name;
	private Subject essence;
	private String majority;
	public Student() {}
	public Student(int no, String name, Subject essence, String majority) {
		super();
		this.no = no;
		this.name = name;
		this.essence = essence;
		this.majority = majority;
	}
	public int getNum() {
		return no;
	}
	public void setNum(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getEssence() {
		return essence;
	}
	public void setEssence(Subject essence) {
		this.essence = essence;
	}
	public String getMajority() {
		return majority;
	}
	public void setMajority(String majority) {
		this.majority = majority;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", essence=" + essence + ", majority=" + majority + "]";
	}
	
	
}
