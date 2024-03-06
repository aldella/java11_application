package exam2;

class UriCardCompany {
	private static UriCardCompany instance = new UriCardCompany();
	private UriCardCompany() {}
	public static UriCardCompany getInstance()
	{
		if (instance== null) instance = new UriCardCompany();
		return instance;
	}
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}

class SamsungCardCompany {
	private static SamsungCardCompany instance = new SamsungCardCompany();
	private SamsungCardCompany() {}
	public static SamsungCardCompany getInstance()
	{
		if (instance== null) instance = new SamsungCardCompany();
		return instance;
	}
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}

class Card {
	private static int CardNo =0;
	private int serialNum=0;
	private String name;
	public Card() {
		this.serialNum = Card.CardNo;
		CardNo++;
	}
	public static int getCardNo() {
		return CardNo;
	}
	public static void setCardNo(int cardNo) {
		
		CardNo = cardNo;
	}
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Exam2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		System.out.println(c1.getSerialNum());
		Card c2 = new Card();
		System.out.println(c2.getSerialNum());
		Card c3 = new Card();
		System.out.println(c3.getSerialNum());
	}

}
