package sec2;

import java.util.Scanner;

class Person {
	private String name;
	private int point;
	private double weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Person(String name, int point, double weight) {
		super();
		this.name = name;
		this.point = point;
		this.weight = weight;
	}
	public Person() {}
	@Override
	public String toString() {
		return "Person [name=" + name + ", point=" + point + ", weight=" + weight + "]";
	}
	
}


public class ScannerExam {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��Է�");
		String i = scan.next();
		int point = scan.nextInt();
		double weight = scan.nextDouble();
		Person p = new Person(i,point,weight);
		System.out.println(p.toString());
	}

}
