package creational.abstractfactory;

public class Link extends Item {
	protected String url;

	//<a href = "http//www.naver.com">���̹�</a>
	//href �Ӽ��� ��("http//www.naver.com")�� url
	//a�±� ������ "���̹�"�� caption
	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
