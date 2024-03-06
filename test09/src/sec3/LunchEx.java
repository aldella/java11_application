package sec3;

public class LunchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lunch lunch;
		lunch = new Korean();
		lunch.eating("비빔밥");
		lunch = new Chinese();
		lunch.eating("탕수육");
		lunch = new Japanese();
		lunch.eating("스시");
	}

}
