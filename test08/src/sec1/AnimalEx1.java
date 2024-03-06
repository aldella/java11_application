package sec1;

public class AnimalEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		Animal a2 = new Mammal();
		Animal a3 = new Birds();
		Mammal m2 = new Mammal();
		Animal a4;
		a4 = new Animal();
		a4.setName("호랑이");
		a4.setSpine(true);
		System.out.println(a4.toString());
		a4 = new Mammal();
//		a4.setLeg(0);
		System.out.println(a4.toString());
		a4=new Birds();
//		a4.setWings(0);
		System.out.println(a4.toString());
	}

}
