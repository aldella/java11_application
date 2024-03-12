package behavioral.command;

public class LampCommand implements Command {

	private Lamp l1;
	
	public LampCommand(Lamp l1) {
		super();
		this.l1 = l1;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		l1.turnOn();
		l1.turnOff();
	}

}
