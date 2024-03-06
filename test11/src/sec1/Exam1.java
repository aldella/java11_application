package sec1;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1";
		String b = "1";
		System.out.println(a == b);
		
		Integer c = new Integer(1004);
		Integer d = 1004;
		int d2 = 1004;
		System.out.println(c==d);
		System.out.println(c.equals(d));
		System.out.println(c==d2);
		
		
		String cc = new String("1004");
		String dd = new String("1004");
		System.out.println(cc==dd);
		System.out.println(cc.equals(dd));
		
	}

}
