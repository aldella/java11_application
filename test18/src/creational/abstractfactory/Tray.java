package creational.abstractfactory;

import java.util.ArrayList;

public class Tray extends Item {
	protected ArrayList tray = new ArrayList<>();
	
	public Tray(String caption) {
		super(caption);
	}
	public void add(Item item) {
		
	}
	@Override
	public String makeHTML() {
		return null;
	}
	
}
