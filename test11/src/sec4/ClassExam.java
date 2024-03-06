package sec4;

public class ClassExam {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
			Person p1 = new Person("최태영",26);
			System.out.println("클래스명 : " + p1.getClass().getName());
			
			Class<Person> p2 = Person.class;
			System.out.println("클래스명 : "+p2.getName());
			
			Class p3 = Class.forName("sec4.Person");
			System.out.println(p3.getName());
			
			Person p4 = (Person) p3.newInstance();
			p4.setName("최태영");
			p4.setAge(26);
			System.out.println("인스턴스 주소 : "+p4);
	}

}
