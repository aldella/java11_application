package creational.abstractfactory;

public abstract class Item { //Link, Page, Tray의 Super 클래스
	protected String caption;

	public Item(String caption) {
		super();
		this.caption = caption;
	}
	public Item() {}
	
	public abstract String makeHTML();
	
}
