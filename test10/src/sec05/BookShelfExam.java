package sec05;

public class BookShelfExam {

	public static void main(String[] args) {
		Queue que = new BookShelf();
		que.enQueue("뵵1");
		que.enQueue("븁2");
		que.enQueue("볍3");
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
	}

}
