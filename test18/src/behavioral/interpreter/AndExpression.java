package behavioral.interpreter;

public class AndExpression implements Expression{
	private Expression expr1=null;
	private Expression expr2 = null;
	@Override
	public boolean interpreter(String content) {
		
		return expr1.interpreter(content) && expr2.interpreter(content);
	}
	public AndExpression(Expression expr1, Expression expr2) {
		super();
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
}
