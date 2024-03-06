package org.kh.object1;

public class Student
{
	String name;
	int kor;
	int eng;
	int mat;
	
	public Student() {}
	public Student(String name, int kor, int eng, int mat)
	{
		this.name = name; this.kor = kor; this.eng = eng; this.mat = mat;
	}
	
	void resulting()
	{
		System.out.println("avg="+this.tot());
		System.out.println("tot="+this.avg());
	}
	public int tot()
	{
		return (this.kor+this.eng+this.mat);
	}
	public float avg()
	{
		return ((this.kor+this.eng+this.mat)/3.0f);
	}
}


