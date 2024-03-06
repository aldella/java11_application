package sec4;

import java.util.HashMap;

class Car {
	String name;
	public Car() {}
	public Car(String name) {
		
	}
}

class CarFactory {
	private static CarFactory instance;
	private CarFactory() {}
	
	HashMap<String, Car> carMap = new HashMap<>();
	
	public static CarFactory getInstance() {
		if(instance == null) instance = new CarFactory();
		return instance;
	}
	
	public Car createCar(String name) { //입력받은 자동차 이름이 없으면, 새로운 Car를 생성하여 반환
		if(carMap.containsKey(name)) { //입력받은 자동차 이름이 이미 있으면, 이미 있는 그 carMap의 name의 값(=Car클래스)을 반환
			return carMap.get(name);
		} else {
			Car car = new Car();
			carMap.put(name, car);
			return car;
		}
	}
}

public class exam6 {

	public static void main(String args[]) {
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar("연수 차");
		Car sonata2 = factory.createCar("연수 차");
		System.out.println(sonata1 == sonata2);
		
		Car avante1 = factory.createCar("승연 차");
		Car avante2 = factory.createCar("승연 차");
		System.out.println(avante1 == avante2);
		
		System.out.println(avante1 == sonata1);
	}
}
