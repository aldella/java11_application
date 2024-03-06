package sec1;

public class StudentExam1 {
	public static void main(String args[]) throws CloneNotSupportedException {
		Student su1 = new Student();
		Student su2 = su1;
		Student su3 = (Student) su1.clone();
		System.out.println(su1);
		System.out.println(su1.toString());
		System.out.println(su1.hashCode());
		System.out.println(su1 == su2);
		System.out.println(su1 == su3);
		System.out.println(su2.equals(su1));
		System.out.println(su3.equals(su1));
		System.out.println(su1 + ""  + su3);
		
	}
}
