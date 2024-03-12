package creational.abstractfactory;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1) {
			System.out.println("���޵� ȯ�溯���� �����ϴ�");
			System.out.println("class name not found");
			System.out.println("Mainclass �������");
		}
		final Factory factory = Factory.getFactory(args[0]);
		Link naverLink = factory.createLink("���̹�","https://www.naver.com");
		Link googleLink = factory.createLink("����", "https://google.com");
		final Tray searchTray = factory.createTray("�˻�����");
		searchTray.add(googleLink);
		searchTray.add(naverLink);
		
		final Page page = factory.createPage("�˻����� ����Ʈ", "���¿�");
		page.add(searchTray);
		page.output(); //ListPage�� makeHTML()�޼ҵ� ������ ���
	}

}
