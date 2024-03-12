package exam;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		list.add((int)1.234);
		for(int num : list) {
			char ch;
			
			if(num < 0) {
				ch = '-';
			} else if(num>0) {
				ch = '+';
			} else {
				System.out.println("@@@@@@@@@");
				continue;
			}
			
			for(int i=0; i<Math.abs(num); i++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
