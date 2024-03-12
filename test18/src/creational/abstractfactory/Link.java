package creational.abstractfactory;

public class Link extends Item {
	protected String url;

	//<a href = "http//www.naver.com">네이버</a>
	//href 속성의 값("http//www.naver.com")이 url
	//a태그 사이의 "네이버"는 caption
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
