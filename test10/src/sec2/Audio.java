package sec2;

public class Audio implements RemoteControl {
	int volume;
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("전원OFF");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("전원ON");
	}


	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > MAX)
			this.volume = MAX;
		else if (volume < MIN)
			this.volume = MIN;
		else
			this.volume = volume;
		System.out.println("현재볼륨 : "+this.volume);
	}
}
