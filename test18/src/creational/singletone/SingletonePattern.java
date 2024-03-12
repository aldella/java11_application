package creational.singletone;

public class SingletonePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singletone ins1 = Singletone.getInstance(1);
		Singletone ins2 = Singletone.getInstance(1);
		Singletone ins3 = Singletone.getInstance(1);
		System.out.println(ins1);
		System.out.println(ins2);
		System.out.println(ins3);
		System.out.println(ins1 == ins2);
		
		Single ins1_2 = Single.getInstance();
		Single ins2_2 = Single.getInstance();
		System.out.println(ins1_2==ins2_2);
		
	}

}
