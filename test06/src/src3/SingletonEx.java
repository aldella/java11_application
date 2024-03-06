package src3;

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton ins1 = Singleton.getInstance();
		Singleton ins2 = Singleton.getInstance();
		System.out.println();
		if(ins1==ins2)
		{
			System.out.println(ins1);
			System.out.println(ins2);
			System.out.println(ins1==ins2);
		}
		SingletoneStudent s1 = SingletoneStudent.getInstance();
		SingletoneStudent s2 = SingletoneStudent.getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}

}
