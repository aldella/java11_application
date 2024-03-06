package sec2;

public class Mammal extends Animal{
	int leg;

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	@Override
	public String toString() {
		return "Mammal [ name=" + super.getName() + ", spine=" + super.getSpine() + "leg=" + leg + "]";
	}
	
}