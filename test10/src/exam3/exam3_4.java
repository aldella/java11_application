package exam3;

import java.util.ArrayList;

public class exam3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog[] dog = new Dog[5];
		for(int i=0; i<5; i++)
		{
			dog[i] = new Dog(i+"",i+"");
		}
		for(Dog d : dog)
		{
			System.out.println(d.showDogInfo());
		}
		
		ArrayList<Dog> d = new ArrayList<Dog>();
		for(int i=0; i<5; i++)
		{
			Dog arraydog = new Dog(i+"",i+"");
			d.add(arraydog);
		}
		for(Dog dd : d)
		{
			System.out.println(dd.showDogInfo());
		}
		
		String[] memArr= {"1","2","3","4","5"};
		System.out.println(memArr.length);
	}

}
