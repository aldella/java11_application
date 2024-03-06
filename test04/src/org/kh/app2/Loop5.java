package org.kh.app2;

public class Loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		while(a>10)
		{
			a++;
			System.out.println("a="+a);
		}
		do
		{
			System.out.println("a="+a);
		}while(a>10);
		
		
		////////////////////////////////////
		int b=0;
		for(;;)
		{
			b++;
			System.out.println(b);
			if(b>=10) break;
		}
		int tot=0;
		
		//////////////////////////////////////
		for(int i=0;i<=100;i++)
		{
			if(i%2==1) continue;
			tot+=i;
		}
		System.out.println(tot);
	}

}
