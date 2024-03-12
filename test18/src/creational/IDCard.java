package creational;

public class IDCard extends Product{

	private String Owner;
	public IDCard(String owner) {
		this.Owner = owner;
		System.out.println(owner+"의 카드를 만듭니다.");
	}
	public IDCard() {}
	
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println(this.Owner+"의 카드 사용");
	}

}
