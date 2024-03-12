package sec1;

import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat : ��¥ ǥ�������� ������ �� Ȱ���ϴ� Ŭ����

public class DateFormatExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		//ǥ������ �ڵ� : y-��, M-�� (�ҹ��ھȵ� �빮�ڽ����, minute�� ��������), d-��, E-����, a-����/����, W-���� �� �� ���° ��, w-���� ���� �� ���° ��
		SimpleDateFormat fmt1 = new SimpleDateFormat("y�� M�� d�� h�� mm�� ss��");
		SimpleDateFormat fmt2 = new SimpleDateFormat("���ó�¥ : yyyy�� MM�� dd��(E) ����W��°�� ����w��°�� a h�� mm�� ss��");
		
		//��¥ �����Ϳ��� Ư�� ǥ�������� �ο��� ���ڿ��� ��ȯ
		String t1 = fmt1.format(today);
		System.out.println(t1);
		String t2 = fmt2.format(today);
		System.out.println(t2);
		
	}

}
