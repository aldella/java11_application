package sec1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] email = {"enenenxodud", "kbs@naver","kkt@gmail.com","kim@kr"};
		Pattern p1 = Pattern.compile("[a-z0-9]+@[a-z0-9]+\\.[a-z]+$");
		for(int i=0; i<email.length; i++) {
			Matcher m = p1.matcher(email[i]);
			if(m.matches() ) {
				System.out.println("�̸��� ������ �½��ϴ�");
				System.out.println(email[i]);
			}
		}
		
		String[] phone = {"02-1234-1234", "010-2836-1004", "032-7979-2424", "010-8284-3690", "031-1247-9985", "010-234-1234"};
		Pattern p2 = Pattern.compile("010-\\d{3,4}-\\d{4}$");
		for(int i=0; i<phone.length; i++) {
			Matcher m = p2.matcher(phone[i]);
			if(m.matches() ) {	
				System.out.println("�޴��� ������ �½��ϴ�");
				System.out.println(phone[i]);
			}
		}
		
		String[] jm = {"941207-1234567", "010203-6789012", "381425-1234567", "851019-234567", "780528-1456123"};
		Pattern p3 = Pattern.compile("\\d{6}\\-[1-4]\\d{6}");
		for(int i=0; i<jm.length; i++) {
			Matcher m = p3.matcher(jm[i]);
			if(m.matches() ) {	
				System.out.println("�ֹι�ȣ ������ �½��ϴ�");
				System.out.println(jm[i]);
			}
		}
		
		String[] post = {"123-123","212-34","816-24","5434-54","683-39"};
		// �����ȣ ���� : 100����(1xx-yy)~700����(7xx-yy)
//		Pattern p4 = Pattern.compile("[1-7][0-9]{2}\\-[0-9]{2}"); �� �� ����
		Pattern p4 = Pattern.compile("[1-7]\\d{2}\\-\\d{2}");
		for(int i=0; i<post.length; i++) {
			Matcher m = p4.matcher(post[i]);
			if(m.matches() ) {	
				System.out.println("�����ȣ ������ �½��ϴ�");
				System.out.println(post[i]);
			}
		}
		
		String[] pw = {""};
		// ? : ���ڼ�(1����). ?? : 2���� �̻� ����. ??? : 3���� �̻� ����.
		// * : ��� �� �ǹ�
		Pattern p5 = Pattern.compile("[1-7]\\d{2}\\-\\d{2}");
		for(int i=0; i<pw.length; i++) {
			Matcher m = p5.matcher(pw[i]);
			if(m.matches() ) {	
				System.out.println("�����ȣ ������ �½��ϴ�");
				System.out.println(pw[i]);
			}
		}
	}

}
