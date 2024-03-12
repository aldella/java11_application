package sec1;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day = today.get(Calendar.DATE);
		System.out.println("���� �� : "+year+" �� : " +month+ " �� : " + day);
		
		int doy = today.get(Calendar.DAY_OF_YEAR);
		int dom = today.get(Calendar.DAY_OF_MONTH);
		int dow = today.get(Calendar.DAY_OF_WEEK);
		System.out.println("���� �⵵�� 1�� 1�Ϻ��� ���ñ��� �ɸ� ��¥ : " + doy + "��°");
		System.out.println("���� �� �� �� ��° ��¥�ΰ� : " + dom + "��°");
		System.out.println("������ �̹����� �� ��° ���ΰ� : " + dow + "��°");
		String[] dayofweek = {"��","��","ȭ","��","��","��","��"};
		System.out.println(dayofweek[dow-1]);
		
		String ampm = (today.get(Calendar.AM_PM)==0 ? "AM" : "PM");
		int hour12 = today.get(Calendar.HOUR); //12�ð���
		int hour24 = today.get(Calendar.HOUR_OF_DAY); //24�ð���
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		int milisecond = today.get(Calendar.MILLISECOND);
		System.out.println(ampm + " " +hour12+"�� "+minute+"�� "+second+"."+milisecond+"��");
		
		int timeZone = today.get(Calendar.ZONE_OFFSET);
		int lastDate = today.getActualMaximum(Calendar.DATE);
		int firstDate = today.getActualMinimum(Calendar.DATE);
		System.out.println("Ÿ���� : " +timeZone/1000/60/60);
		System.out.println("�̹��޸������� : "+lastDate);
		System.out.println("�̹���ù�� : "+firstDate);
		

		
	}
}
