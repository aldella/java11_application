package creational.abstractfactory;

public class ListLink extends Link {
	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		return "<a href =\""+url+"\""+caption+"</a>";
	}
	

}
