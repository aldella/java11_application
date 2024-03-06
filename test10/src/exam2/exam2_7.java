package exam2;

public class exam2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungCardCompany com = SamsungCardCompany.getInstance();
		SamsungCardCompany com2 = SamsungCardCompany.getInstance();
		UriCardCompany org = UriCardCompany.getInstance();
		UriCardCompany org2 = UriCardCompany.getInstance();
		System.out.println(com);
		System.out.println(com2);
		System.out.println(org);
		System.out.println(org2);

		Card c1 = com.createCard();
		Card c2 = com.createCard();
		Card c3 = com.createCard();
		Card c4 = com.createCard();
		Card c5 = com.createCard();
		System.out.println(c1.getSerialNum());
		System.out.println(c2.getSerialNum());
		System.out.println(c3.getSerialNum());
		System.out.println(c4.getSerialNum());
		System.out.println(c5.getSerialNum());
	}

}
