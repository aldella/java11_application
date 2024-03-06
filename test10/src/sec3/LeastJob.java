package sec3;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("현재 상담이 모두 완료되어 다음 상담하실 분 들어오세요");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("LeastJob sendCallToAgent");
	}
	
}
