package sec2;

public interface Screen extends RemoteControl {
	public void turnOff();
	public void turnOn();
	public void setVolume(int volume);
	public int light();
	public int dark();
	public int zoomin();
	public int zoomout();
}
