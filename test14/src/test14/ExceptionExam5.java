package test14;

class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}

public class ExceptionExam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani1 = new Dog();
		Animal ani2 = new Cat();
		changeAnimal(ani2);
	}
	public static void changeAnimal(Animal animal) {
		try {
			Dog dog = (Dog) animal;
		} catch(ClassCastException e) {
			System.out.println("형제나 다른 패키지에 있는 클래스는 형 변환 불가");
			e.printStackTrace();
		}
	}

}
