package org.kh.app2;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, tot=0;
		while (i<=10)
		{
			tot += i;
			i++;
		}
		System.out.println(tot);
		
		i=1;
		//해당 숫자를 입력하면, 구구단 중 해당 숫자의 단을 출력하게해라
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 [2~9]");
		int n = scan.nextInt();
		if (n>=2 && n<=9) {
//			while(i<10)
//			{
//				System.out.print("\n"+n+" * "+i+" = "+n*i);
//				i++;
//			}
			for(int k=1; k<10; k++)
			{
				System.out.print("\n"+n+" * "+k+" = "+n*k);
			}
		} else {
			System.out.println("2~9사이의 숫자를 입력하십시오");
		}
	}

}
