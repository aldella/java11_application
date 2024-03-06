package src3;

public class SingletoneStudent {
	private static SingletoneStudent instance;
	private SingletoneStudent() {}
	public static synchronized SingletoneStudent getInstance()
	{
		if(instance==null) instance = new SingletoneStudent();
		return instance;
	}
}
