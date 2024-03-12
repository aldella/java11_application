package behavioral.command;

public class AlarmCommand implements Command{

	private Alarm a1;
	
	public AlarmCommand(Alarm a1) {
		super();
		this.a1 = a1;
	}
	public AlarmCommand() {}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		a1.start();
	}

}
