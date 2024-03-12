package creational;
//Factory Method 패턴 : 객체를 만드는 부분을 서브(SubClass)에 위임하는 패턴
//IDCard의 Sub Class인 IDCardFactory를 활용하여IDCard 객체를 생성 

public class FactorMethodPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new IDCardFactory();
		Product a = factory.create("김민수");
		a.use();
	}

}
