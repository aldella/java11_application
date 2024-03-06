package test07;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s = new Student[5]; //s[0].kor   s[0].eng   s[0].wri  → 이런식으로 생성됨
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<5; i++)
		{
			s[i]= new Student();
			s[i].setNo(i+1);
			
			System.out.println((i+1)+"번째 국어 : ");
			s[i].setWri(scan.nextInt());

			
			System.out.println((i+1)+"번째 수학 : ");
			s[i].setMath(scan.nextInt());

			
			System.out.println((i+1)+"번째 영어 : ");
			s[i].setEng(scan.nextInt());
		}
		System.out.printf("\n학생번호\t"+"국어\t"+"수학\t"+"영어\t"+"총점\t"+"평균\t"+"학점\t\n");
		for(int i=0; i<5; i++)
		{
			s[i].print();
		}
		
	}

}
