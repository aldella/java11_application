package behavioral.command;

public class CommandPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Command com1 = new AlarmCommand(new Alarm()); // Alarm과 Lamp의 기능을 합쳐 전달할 수 있음
		Button btn1 = new Button(com1);
		btn1.pressed();
		
		com1 = new LampCommand(new Lamp());
		btn1 = new Button(com1);
		btn1.pressed();
	}

}
