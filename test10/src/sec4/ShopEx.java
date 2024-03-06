package sec4;

public class ShopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop s1 = new Shop();
		Delivery s2 = new Shop();
		s1.buy();
		s1.sell();
		s1.delivery();
		s2.buy();
		s2.sell();
		s2.delivery();
		s1 = new ShopBranch();
		s1.buy();
		s1.sell();
		s1.delivery();
	}

}
