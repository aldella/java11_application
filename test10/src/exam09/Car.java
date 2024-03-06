package exam09;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	public void wash() {
		System.out.println("세차를 합니다");
	}
	public final void run() {
		this.start();
		this.drive();
		this.stop();
		this.turnoff();
		this.wash();
	}
}
