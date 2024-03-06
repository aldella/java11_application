package src3;

public class People {
	public static int selNum=100;
	public String name;
	public int age;
	public String addr;
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", addr=" + addr + "]" +selNum;
	}
	public void print1()
	{
		System.out.println(this.selNum + " | " + this.name);
	}
	public static void print2()
	{
		System.out.println(100 + " | " + "최태영");
	}
	
}
