package sec2;

public class RemoteExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl r1 = new RemoteControl() {
			int volume;
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("전원OFF");
			}
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("전원ON");
			}
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				if (volume > MAX)
					this.volume = MAX;
				else if (volume < MAX)
					this.volume = MIN;
				else
					this.volume = volume;
				System.out.println("현재볼륨 : "+this.volume);
			}
		};
		RemoteControl.changeBattery();
		
	}

}
