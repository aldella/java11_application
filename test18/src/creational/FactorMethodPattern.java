package creational;
//Factory Method ���� : ��ü�� ����� �κ��� ����(SubClass)�� �����ϴ� ����
//IDCard�� Sub Class�� IDCardFactory�� Ȱ���Ͽ�IDCard ��ü�� ���� 

public class FactorMethodPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new IDCardFactory();
		Product a = factory.create("��μ�");
		a.use();
	}

}
