package org.kh.app2;

public class StarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		별(*)이 가로 6개 세로4개씩 나오는 별찍기
		for(int i = 0; i<4; i++)
		{
			for(int j = 0; j<6; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println();
		/////////////////////////////////
		
		/*
		(피라미드형태로 별 6줄(한개씩늘어나는거))
		 */
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		////////////////////////////////
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//////////////////////////////////
		for(int i=0; i<5;i++)
		{
			System.out.println();
			for(int j=0; j<5-i; j++)
			{
				System.out.print("*");
			}
			System.out.print(" ");
			for(int j=0; j<i; j++)
			{
				System.out.print("  ");
			}

			for(int j=0; j<5-i; j++)
			{
				System.out.print("*");
			}
		}
		System.out.println();
		for(int i=4; i>0;i--)
		{
			for(int j=0; j<5-i+1; j++)
			{
				System.out.print("*");
			}
			System.out.print(" ");
			for(int j=0; j<i-1; j++)
			{
				System.out.print("  ");
			}

			for(int j=0; j<5-i+1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		///////////////////////////////////////
		
		int i = 0;
		for(i=1; i<=9; i+=2)
		{
			for(int j=0; j<4-i/2; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			for(int j=0; j<4-i/2; j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		for(i=7; i>=1; i-=2)
		{
			for(int j=0; j<4-i/2; j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			for(int j=0; j<4-i/2; j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println();
		
		////////////////////////////////////////
		
		

	}

}
