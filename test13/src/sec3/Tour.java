package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Visitor {
	private String name;
	private int age;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Visitor(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	public Visitor() {}
	@Override
	public String toString() {
		return "TourVisitor [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
	
}

public class Tour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Visitor> vList = new ArrayList<>();
		Visitor v1 = new Visitor("첫번째",11,1);
		Visitor v2 = new Visitor("두번째",22,2);
		Visitor v3 = new Visitor("세번쨰",33,3);
		Visitor v4 = new Visitor("네번째",44,4);
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		
		Stream<Visitor> vStream = vList.stream();
		vList.stream().forEach(s -> System.out.println(s.toString()));
		vList.stream().map(s -> s.getName()).forEach(s -> System.out.println(s));
		vList.stream().filter(s -> s.getAge()>=25).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
	}

}
