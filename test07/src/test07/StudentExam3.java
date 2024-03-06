package test07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> s = new ArrayList<Student>();
		Scanner scan= new Scanner(System.in);
		for(int i=0; i<5; i++)
		{
			Student st = new Student();
			st.setNo(i+1);
			System.out.println((i+1)+"번째 국어 : ");
			st.setWri(scan.nextInt());
			System.out.println((i+1)+"번째 수학 : ");
			st.setMath(scan.nextInt());
			System.out.println((i+1)+"번째 영어 : ");
			st.setEng(scan.nextInt());
			s.add(st);
		}
		System.out.printf("\n학생번호\t"+"국어\t"+"수학\t"+"영어\t"+"총점\t"+"평균\t"+"학점\t\n");
		for(Student i : s)
		{
			i.print();
		}
	}

}
