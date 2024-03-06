package sec1;

public class GenericExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic1<Student> s = new Generic1<>();
		Student a = new Student("장원영",21);
		s.setField1(a);
		System.out.println(s);
		System.out.println(s.getField());
		System.out.println(a);
		
		Generic1<Teacher> t = new Generic1<>();
		Teacher b = new Teacher("김기태", 43);
		t.setField1(b);
		Generic1<Integer> i = new Generic1<>();
		i.setField1(1004);
	}
}
