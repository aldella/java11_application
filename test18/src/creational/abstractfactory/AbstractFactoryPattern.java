package creational.abstractfactory;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1) {
			System.out.println("전달된 환경변수가 없습니다");
			System.out.println("class name not found");
			System.out.println("Mainclass 실행오류");
		}
		final Factory factory = Factory.getFactory(args[0]);
		Link naverLink = factory.createLink("네이버","https://www.naver.com");
		Link googleLink = factory.createLink("구글", "https://google.com");
		final Tray searchTray = factory.createTray("검색엔진");
		searchTray.add(googleLink);
		searchTray.add(naverLink);
		
		final Page page = factory.createPage("검색엔진 리스트", "최태영");
		page.add(searchTray);
		page.output(); //ListPage의 makeHTML()메소드 내용이 출력
	}

}
