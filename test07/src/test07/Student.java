package test07;

public class Student {
//	필드 : 번호, 국어, 영어, 수학
//	메소드 : getter/setter 및 총점, 평균, 학점, 모든 학생 정보 출력
	int no;
	int wri;
	int math;
	int eng;
	
	
	public double avg() {
		return this.sum()/3.0f;
	}
	public int sum() {
		return (this.eng+this.wri+this.math);
	}
	public String grade()
	{
		if (this.avg() >= 90) return "A";
		else if (this.avg() >= 80) return "B";
		else if (this.avg() >= 70) return "C";
		else if (this.avg() >= 60) return "D";
		else return "F";
	}
	public void print()
	{
//		System.out.printf(this.no+"\t"+this.wri+"\t"+this.math+"\t"+this.eng+"\t"+this.sum()+"\t"+this.avg()+"\t"+this.grade()+"\n");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%.3f\t%s\t\n",this.no,this.wri,this.math,this.eng,this.sum(),this.avg(),this.grade());
	}
	
	public Student() {}
	public Student(int no, int wri, int math, int eng) {
		super();
		this.no = no;
		this.wri = wri;
		this.math = math;
		this.eng = eng;
	}
	
	//	getter setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getWri() {
		return wri;
	}
	public void setWri(int wri) {
		this.wri = wri;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
}
