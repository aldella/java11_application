package sec4;
//다중상속 안됨
public class Store extends Pay {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("상점");
	}

	@Override
	public void Inventory() {
		// TODO Auto-generated method stub
		super.Inventory();
	}
	
}
