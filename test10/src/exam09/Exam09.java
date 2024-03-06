package exam09;

import java.util.ArrayList;

class Genesis extends Car {
	String brand = "Genesis";
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 시동을 켭니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 달립니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 멈춥니다.");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 시동을 끕니다.");
	}
	
}

class Avante extends Car {
	String brand = "Avante";
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 시동을 켭니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 달립니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 멈춥니다.");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 시동을 끕니다.");
	}
	
}

class Grandeur extends Car {
	String brand = "Grandeur";
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 시동을 켭니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 달립니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 멈춥니다.");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 시동을 끕니다.");
	}
	
}

class Sonata extends Car {
	String brand = "Sonata";
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 시동을 켭니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 달립니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 멈춥니다.");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println(this.brand+" 시동을 끕니다.");
	}
	
}


public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		for(Car car : carList)
		{
			car.run();
			System.out.println("==============");
		}
	}
}
