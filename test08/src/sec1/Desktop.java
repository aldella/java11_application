package sec1;

public class Desktop implements Computer {

	@Override
	public void display() {
		System.out.println("데스크탑모니터해상도:19201080");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("데탑별도의마련된키보드타이핑");
	}

	@Override
	public void power(boolean sw) {
		// TODO Auto-generated method stub
		if(sw) System.out.println("데스크탑의 전원을 켭니다");
		else System.out.println("데탑전원종료");
	}
	
	public void power(String name, boolean sw)
	{
		//얜 오버리딩이지 오버라이딩이 아님
		if(sw) System.out.println(name+"의 데스크탑의 전원을 켭니다");
		else System.out.println(name+ "의 데탑전원종료");
	}
	
}
