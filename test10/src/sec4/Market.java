package sec4;

public class Market implements Buy, Sell{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("판매");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("구매");
	}

}
