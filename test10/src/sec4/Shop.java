package sec4;

public class Shop implements Delivery{

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("구매_shop");
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("판매_shop");
	}

	@Override
	public void delivery() {
		// TODO Auto-generated method stub
		System.out.println("배달_shop");
	}

}
