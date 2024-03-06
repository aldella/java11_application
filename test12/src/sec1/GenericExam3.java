package sec1;

interface Material {
	void doPrinting();
}

class Powder implements Material {
	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("파우더 재료로 출력합니다");
	}
	public String toString() {
		return "Powder";
	}
}

class Plastic implements Material {
	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("플라스틱 재료로 출력합니다");
	}
	public String toString() {
		return "Plastic";
	}
}

class GenericPrint<T extends Material> {
	private T material;
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	public GenericPrint() {}
	public GenericPrint(T material) {
		super();
		this.material = material;
	}
}


public class GenericExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plastic p1 = new Plastic();
		Powder p2 = new Powder();
		p1.doPrinting();
		p2.doPrinting();
		GenericPrint<Plastic> g1 = new GenericPrint<>(p1);
		System.out.println(g1.getMaterial());
		GenericPrint<Powder> g2 = new GenericPrint<>(p2);
		System.out.println(g2.getMaterial());
//		GenericPrint<Student> g3 = new GenericPrint<>();
	}

}
