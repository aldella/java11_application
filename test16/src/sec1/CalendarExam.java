package sec1;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day = today.get(Calendar.DATE);
		System.out.println("현재 년 : "+year+" 월 : " +month+ " 일 : " + day);
		
		int doy = today.get(Calendar.DAY_OF_YEAR);
		int dom = today.get(Calendar.DAY_OF_MONTH);
		int dow = today.get(Calendar.DAY_OF_WEEK);
		System.out.println("현재 년도의 1월 1일부터 오늘까지 걸린 날짜 : " + doy + "일째");
		System.out.println("현재 월 중 몇 번째 날짜인가 : " + dom + "일째");
		System.out.println("오늘은 이번주의 몇 번째 날인가 : " + dow + "일째");
		String[] dayofweek = {"일","월","화","수","목","금","토"};
		System.out.println(dayofweek[dow-1]);
		
		String ampm = (today.get(Calendar.AM_PM)==0 ? "AM" : "PM");
		int hour12 = today.get(Calendar.HOUR); //12시간제
		int hour24 = today.get(Calendar.HOUR_OF_DAY); //24시간제
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		int milisecond = today.get(Calendar.MILLISECOND);
		System.out.println(ampm + " " +hour12+"시 "+minute+"분 "+second+"."+milisecond+"초");
		
		int timeZone = today.get(Calendar.ZONE_OFFSET);
		int lastDate = today.getActualMaximum(Calendar.DATE);
		int firstDate = today.getActualMinimum(Calendar.DATE);
		System.out.println("타임존 : " +timeZone/1000/60/60);
		System.out.println("이번달마지막날 : "+lastDate);
		System.out.println("이번달첫날 : "+firstDate);
		

		
	}
}
