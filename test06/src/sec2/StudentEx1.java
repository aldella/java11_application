package sec2;

public class StudentEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("최태영",1,100000);
		Student stu2 = new Student("한승우",2,200000);
		Student stu3 = new Student("신지원",3,300000);
		
		Bus bus1 = new Bus(101);
		stu1.takeBus(bus1);
		stu1.print();
		bus1.show();
		
		//한승우 학생이 버스(101)를 두 번 이용, 지하철 2호선을 세 번 이용한 경우
		//한승우 학생의 정보와 버스 101호 정보와 지하철 2호선의 정보를 출력
		Subway sub1 = new Subway(2);
		stu2.takeBus(bus1);
		stu2.takeBus(bus1);
		stu2.takeSubway(sub1);
		stu2.takeSubway(sub1);
		stu2.takeSubway(sub1);
		stu2.print();
		bus1.show();
		sub1.show();
	}

}
