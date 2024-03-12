package behavioral.iterator;

import java.util.HashMap;
import java.util.Iterator;

public class GoatThread {
	public static final int MAX_GOATS = 100;
	private int goatNum = 0;	//
	public static final HashMap<Integer, Goat> GOATS = new HashMap<>();
	public GoatThread() {
		super();
		int i;
		for(i=0; i<30; i++) {
			GOATS.put(i, new Goat());
		}
		goatNum = i;
	}
	public void addGoat() {
		if(GOATS.size() < MAX_GOATS) {
			GOATS.put(++goatNum,new Goat());
		}
	}
	public void removeGoat() {
		if(GOATS.size() > 0) {
			GOATS.remove(goatNum--);
		}
	}
	
	public Iterator<Integer> createIterator() {
		return GOATS.keySet().iterator();
	}
	public Iterator<Goat> goatIterator() {
		return GOATS.values().iterator();
	}
}
