package sec1;

class Point<T,V> {
	T x;
	V y;
	public Point(T x, V y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point() {}
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
}

public class GenericExam4 {
	public static <T,V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number) p1.getX()).doubleValue();
		double right = ((Number) p2.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		return width*height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제네릭 메소드 : 해당 클래스에 메소드로 반환타입에 관계없이 활용할 수 있는 메소드
		Point<Integer, Double> p1 = new Point<>(0,0.0);
		Point<Integer, Double> p2 = new Point<>(20, 20.0);
		
//		double area = GenericExam4.<Integer,Double>makeRectangle(p1, p2); : 앞의 GenericExam4.<Integer,Double> 부분 생략가능
		double area = makeRectangle(p1, p2);
		System.out.println(area);
	}

}
