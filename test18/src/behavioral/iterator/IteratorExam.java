package behavioral.iterator;

import java.util.Iterator;

public class IteratorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoatThread goats = new GoatThread();
		goats.addGoat();
		goats.addGoat();
		goats.removeGoat();
		goats.addGoat();
		goats.addGoat();
		
		Iterator<Integer> goatIter = goats.createIterator();
		while(goatIter.hasNext()) {
			int key = goatIter.next();
			Goat goat = goats.GOATS.get(key);
			System.out.println(key);
			goat.soud();
		}
	}

}
