package exam2;

class Menu {
	final static int STARAMERICANO = 4000;
	final static int STARLATTE = 4500;
	final static int STARMACCIATO = 5000;
	final static int BEANAMERICANO = 4000;
	final static int BEANLATTE = 4500;
	final static int BEANMACCIATO = 5000;
	
}
class Human {
	String name;
	int money;
	
	public Human(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void buyStarCoffee(StarCafe sCafe, int money)
	{
		if(sCafe != null) {
		this.money -= money;
		sCafe.brewing(money);
		}
	}
	public void buyBeanCoffee(BeanCafe bCafe, int money)
	{
		if(bCafe != null) {
		this.money -= money;
		bCafe.brewing(money);
		}
	}
}
class StarCafe {
	int money=0;
	public void brewing(int money) {
		this.money += money;
		if(money == Menu.STARAMERICANO) System.out.println("별다방, 아메리카노");
		else if(money == Menu.STARLATTE) System.out.println("별다방, 라떼");
		else System.out.println("별다방, 마끼아또");
	}
}
class BeanCafe {
	int money=0;
	public void brewing(int money) {
		this.money += money;
		if(money == Menu.BEANAMERICANO) System.out.println("콩다방, 아메리카노");
		else if(money == Menu.BEANLATTE) System.out.println("콩다방, 라떼");
		else System.out.println("콩다방, 마끼아또");
	}
}

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarCafe s1 = new StarCafe();
		BeanCafe s2 = new BeanCafe();
		Human h1 = new Human("김", 100000);
		Human h2 = new Human("이", 100000);
		h1.buyStarCoffee(s1, 4000);
		h2.buyBeanCoffee(s2, 4500);
	}

}
