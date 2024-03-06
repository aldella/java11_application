package org.kh.app2;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		for (int i=0; i<10; i++)
		{
			n=n+1;
		}
		System.out.println("n="+n);
		int[] jum = {80, 95, 75, 60, 100,65,70,90,85,95};
		String[] names = {"김","이","박","최","정","오","배","강","장","계"};
		int max=0;
		int min=100;
		int tot=0;
		for(int i = 0; i<10; i++)
		{
			System.out.print("\n이름 : "+names[i]+"   \t");
			System.out.print("점수 : "+jum[i]+"   \t");
			tot+=jum[i];
			if (jum[i] >= 90)
			{
				System.out.print("A\t");
			} else if (jum[i] >= 80) {
				System.out.print("B\t");
			} else if (jum[i] >= 70) {
				System.out.print("C\t");
			} else if (jum[i] >= 60) {
				System.out.print("D\t");
			} else {
				System.out.print("F\t");
			}
			if (jum[i] >=70)
			{
				System.out.println("합격");
			} else
			{
				System.out.println("불합격");
			}
			
			if (max < jum[i]) max = jum[i];
			if (min > jum[i]) min = jum[i];
				
		}
		System.out.println("\n총점 "+tot);
		System.out.println("\n평점 "+(tot/10.0f));
		System.out.println("\n최대점수 "+max);
		System.out.println("\n최소점수 "+min);
	}

}
