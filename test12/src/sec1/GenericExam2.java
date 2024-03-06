package sec1;

class StudentMap<K, V> {
	private K key;
	private V value;
	public StudentMap(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public StudentMap() {}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}

public class GenericExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMap<Integer, String> s1 = new StudentMap<>(1,"최태영");
		StudentMap<Integer, Character> s2 = new StudentMap<>(2,'a');
		StudentMap<Integer, Double> s3 = new StudentMap<>(3,4.4);
		StudentMap<Integer, Long> s4 = new StudentMap<>(4,28193798217391l);
		
		Student s = new Student("최태영", 26);
		StudentMap<Student, Integer> s5 = new StudentMap<>(s,100);
	}

}
