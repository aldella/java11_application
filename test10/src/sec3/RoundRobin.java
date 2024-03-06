package sec3;
//시분할 처리 시스템(Time Sharing System) : 하나의시스템을 여러 명이 사용하기 위해 서로 시간대를 나누어서 처리
//하나의 시스템을 여러 사람이 사용하기 위한 시스템 사용 계획표
//5명이 1시간씩 교대로 시스템 사용
//RoundRobin : 돌아가면서 특정 시간만큼 처리되다가 대기큐에서 대기 후 해당 순서가 오면 처리되는방식

public class RoundRobin implements Scheduler {
	private int agentId=0;
	static int agentId_num=0;
	
	
	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("10분씩 나누어 상담, 대기큐에서 대기");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("다음 순서의 상담원이 누군지 게시합니다.");
	}

}
