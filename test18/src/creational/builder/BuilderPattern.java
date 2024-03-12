package creational.builder;

class Student {
	private int no;
	private String name;
	private int point;
	private String phoneNumber;
	public Student(int no, String name, int point, String phoneNumber) {
		super();
		this.no = no;
		this.name = name;
		this.point = point;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", point=" + point + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}

class StudentBuilder{
	private int no=10000;
	private String name="�������";
	private int point=11111;
	private String phoneNumber="��ȣ����";
	public StudentBuilder no(int no) {
		this.no = no;
		return this;
	}
	public StudentBuilder name(String name) {
		this.name = name;
		return this;
	}
	public StudentBuilder point(int point) {
		this.point = point;
		return this;
	}
	public StudentBuilder phoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	
	public Student build() {
		return new Student(no,name,point,phoneNumber);
	}
	@Override
	public String toString() {
		return "StudentBuilder [no=" + no + ", name=" + name + ", point=" + point + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
}

public class BuilderPattern {
//builder patter : ��� �ʵ�� ���� �������� �ϳ��ϳ� �׾ƿ÷� ��ü�� �����ϴ� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new StudentBuilder()
				.no(1)
				.name("���¿�")
				.point(1)
				.phoneNumber("010101010")
				.build();
		
		Student student2 = new Student(2,"12123",2,"123213");
		Student student3 = new StudentBuilder()
				.no(3)
				.point(10)
				.build();
		
		System.out.println(student.toString()); //BuilderPattern ���
		System.out.println(student2.toString()); //�⺻������
		System.out.println(student3.toString()); //BuilderPattern ���
		
		//�̷��� BuilderPattern�� ����� Student ��ü ������ ���� : �ش� ����� �ϳ��� �޼ҵ�ü�̴� ����� ���� �߰��ϴ� ��ü�������
	}

}
