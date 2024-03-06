package sec1;

class Animal {
	private String type;
	private String name;
	private int leg;
	private int wing;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	
	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", leg=" + leg + ", wing=" + wing + "]";
	}
	public void print()
	{
		System.out.println(this.toString());
	}
	
}

public class AnimalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani1 = new Animal();
		ani1.setLeg(4);
		ani1.setName("호랑이");
		ani1.setType("포유류");
		ani1.setWing(0);
		ani1.print();
		
		Animal ani2 = new Animal();
		ani1.setLeg(2);
		ani1.setName("독수리");
		ani1.setType("조류");
		ani1.setWing(2);
		ani1.print();
		
		Animal ani3 = new Animal();
		ani1.setLeg(0);
		ani1.setName("아나콘다");
		ani1.setType("파충류");
		ani1.setWing(2);
		ani1.print();
	}

}
