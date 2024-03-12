package behavioral.command;

public class Button implements Command{
	private Command theCommand;

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	public Button(Command theCommand) {
		super();
		this.theCommand = theCommand;
	}

	public Command getTheCommand() {
		return theCommand;
	}

	public void setTheCommand(Command theCommand) {
		this.theCommand = theCommand;
	}
	
	public void pressed() {
		theCommand.execute();
	}
}
