package structural.bridge;

public class BridgePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape triangle1 = new Triangle(new RedColor());
		Shape pentagon1 = new Pentagon(new GreenColor());
		triangle1.applyColor();
		pentagon1.applyColor();
	}

}
