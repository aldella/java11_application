package exam10;

import java.io.IOException;

public class exam10 {
	public static void main(String args[]) throws IOException {
		System.out.println("정렬방식 B H Q중에 선택하세요");
		int ch = System.in.read();
		Sort sort = null;
		switch(ch) {
		case 'B':
		case 'b':
			sort = new BubbleSort();
			break;
		case 'H':
		case 'h':
			sort = new HeapSort();
			break;
		case 'Q':
		case 'q':
			sort = new QuickSort();
			break;
		default :
			System.out.println("지원되지 않는 기능입니다.");
		}
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}
}
