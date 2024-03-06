package sec1;

import sec2.Animal;
import sec2.Mammal;
import sec2.Birds;

public class AnimalEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1;
		a1 = new Animal();
		a1.setName("토끼");
		a1.setSpine(true);
		System.out.println(a1.toString());
		
		a1 = new Mammal();
		a1.setName("사자");
		System.out.println(a1.toString());
		
		a1 = new Birds();
		
	}

}
