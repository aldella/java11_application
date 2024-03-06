package sec2;

public class RemoteExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television te1 = new Television();
		RemoteControl.changeBattery();
		te1.turnOn();
		te1.setVolume(20);
		te1.setMute(true);
		te1.setMute(false);
		te1.light();
		te1.dark();
		te1.zoomin();
		te1.zoomout();
		te1.turnOff();
	}

}
