package sec2;

public interface RemoteControl {
	int MAX = 10;
	int MIN = 0;
	void turnOff();
	public void turnOn();
	public void setVolume(int volume);
//	인터페이스에서 메소드는 기본이 추상메소드이므로 선언만 해야하며, 기본 접근 제한자는 public이다.(안 적을 때 default가 아니라 public이 된다는 것)
//	그러나, 구현 내용을 기술하고싶으면, 기본 접근 제한자를 default로 명기하면 가능하다.
	default void setMute(boolean mute)
	{
		if(mute) System.out.println("무음 처리");
		else System.out.println("무음 해제");
	}
	static void changeBattery() {
		System.out.println("배터리를 충전중입니다.");
	}
}
