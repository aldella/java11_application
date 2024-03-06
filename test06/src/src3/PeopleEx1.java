package src3;

public class PeopleEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p1 = new People();
//		p1.selNum = 200;
		People.selNum=200;
		p1.name = "최태영";
		p1.age = 26;
		p1.addr = "의정부";
		
		People p2 = new People();
//		p2.selNum = 300;
		People.selNum=300;
		p2.name = "222";
		p2.age = 22;
		p2.addr = "2222";
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.print1();
		p2.print1();
		p1.print2();
		p2.print2();
		People.print2();
	}

}
