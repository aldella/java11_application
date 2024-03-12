package creational.abstractfactory;

public abstract class Item { //Link, Page, Tray�� Super Ŭ����
	protected String caption;

	public Item(String caption) {
		super();
		this.caption = caption;
	}
	public Item() {}
	
	public abstract String makeHTML();
	
}
