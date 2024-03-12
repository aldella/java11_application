package behavioral.templatemethod;

public class GlassHouse extends HouseTemplate{

	@Override
	public void buildWalls() {
		// TODO Auto-generated method stub
		System.out.println("유리벽을 세웁니다");
	}

	@Override
	public void buildPillars() {
		// TODO Auto-generated method stub
		System.out.println("몰라암튼유리쪽");
	}

}
