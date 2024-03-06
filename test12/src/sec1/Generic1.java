package sec1;

public class Generic1<T> { //제네릭(Generic)이란? 데이터와 관계없이 아무거나 모두 받아서 처리하는 클래스
	private T field1;
	public Generic1() {}
	public Generic1(T field1) {
		super();
		this.field1 = field1;
	}
	public T getField() {
		return field1;
	}
	public void setField1(T field1) {
		this.field1 = field1;
	}
}
