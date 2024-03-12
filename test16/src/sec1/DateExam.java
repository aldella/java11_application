package sec1;

import java.time.LocalDate;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		
		@SuppressWarnings("deprecation")
		Date date2 = new Date(1999,11,29,12,01,01);
		
		@SuppressWarnings("deprecation")
		
		//�����̸�(Global/local) : KST,	RFC822 : +0900
		//�����ڵ� : KR					����ڵ� : KO -> KO_KR
		Date date3 = new Date("Mon, 02 Apr 2020 09:42:08 +0900");
		
		System.out.println(date2);
		System.out.println(date3);
		
		System.out.println("*** LocalDate ***");
		LocalDate now1 = LocalDate.now(); //��¥������
		System.out.println(now1);
		String now2 = now1.toString(); //��¥������->���ڵ�����
		System.out.println(now2);
		LocalDate now3 = LocalDate.parse(now2);
		System.out.println(now3);
	}
}
