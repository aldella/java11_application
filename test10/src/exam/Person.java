package exam;

public class Person {
	private String name;
	private int age;
	private boolean merried;
	private int child;
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
	public boolean isMerried() {
		return merried;
	}
	public void setMerried(boolean merried) {
		this.merried = merried;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", merried=" + merried + ", child=" + child + "]";
	}
	
	public void print() {
		System.out.println(this.getAge());
		System.out.println(this.getName());
		if (this.isMerried())
		{
			System.out.println(this.getChild());
		} else System.out.println("미혼");
	}
}
