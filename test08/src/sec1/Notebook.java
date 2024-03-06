package sec1;

public class Notebook implements Computer{

	@Override
	public void display() {
		System.out.println("노트북모니터해상도:작음");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("합체형키보드");
	}

	@Override
	public void power(boolean sw) {
		// TODO Auto-generated method stub
		if(sw) System.out.println("노트북의 전원을 켭니다");
		else System.out.println("노트북전원종료");
	}
	
	public void power(String name, boolean sw)
	{
		//얜 오버리딩이지 오버라이딩이 아님
		if(sw) System.out.println(name+"의 노트북의 전원을 켭니다");
		else System.out.println(name+ "의 노트북전원종료");
	}

}
