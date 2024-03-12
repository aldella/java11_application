package behavioral.iterator;

import java.util.Iterator;

public class SheepIterator implements Iterator<Sheep>{
	private Sheep[] sheeps;
	int position = 0;
	@Override
	public boolean hasNext() {
		if (position >= sheeps.length || sheeps[position] == null) {
			return false;
		} else { return true; }
	}
	@Override
	public Sheep next() {
		// TODO Auto-generated method stub
		Sheep tmpSheep = sheeps[position];
		position++;
		return tmpSheep;
	}
	public SheepIterator(Sheep[] sheeps, int position) {
		super();
		this.sheeps = sheeps;
		this.position = position;
	}
	
}
