package structural.bridge;

public class Pentagon extends Shape{
	public Pentagon(Color color) {
		super(color);
	}
	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.println("����ĥ����������");
		color.applyColor();
	}
}
