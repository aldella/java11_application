package structural.adapter;

//POJO(Plain Of Java Object) : 옛날부터 내려져오던 기본적인 자바 클래스 방식 (자바 디자인패턴이 아니라 기본 순수패턴)
public class Volt {
	private int amount;

	public Volt(int amount) {
		super();
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
