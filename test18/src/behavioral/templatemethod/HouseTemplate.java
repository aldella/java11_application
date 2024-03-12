package behavioral.templatemethod;

public abstract class HouseTemplate {

	public void buildHouse() { 
		buildWindows();
		buildWalls();
		buildPillars();
		buildFoundation();
	}
	private void buildWindows() {
		System.out.println("����â�������");
	}

	public abstract void buildWalls();
	public abstract void buildPillars();
	private void buildFoundation() {
		System.out.println("��ü/��� ���� ��ῡ �´� �����縦 �����ϼ̽��ϴ�.");
	}
}
