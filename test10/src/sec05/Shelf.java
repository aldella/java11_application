package sec05;

import java.util.ArrayList;
//일반(구현) 클래스
public class Shelf {
	protected ArrayList<String> shelf;		//List
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	public ArrayList<String> getShelf() {
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}
}
