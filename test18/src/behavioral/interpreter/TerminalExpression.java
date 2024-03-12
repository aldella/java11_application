package behavioral.interpreter;

public class TerminalExpression implements Expression {

	private String data;
	
	
	
	public TerminalExpression(String data) {
		this.data = data;
	}
	public TerminalExpression() {}

	@Override
	public boolean interpreter(String content) {
		if(content.contains(data)) {
			return true;
		}
		return false;
	}

}
