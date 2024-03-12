package structural.bridge;

public class Pentagon extends Shape{
	public Pentagon(Color color) {
		super(color);
	}
	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.println("색이칠해진오각형");
		color.applyColor();
	}
}
