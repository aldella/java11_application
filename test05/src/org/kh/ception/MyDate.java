package org.kh.ception;

public class MyDate {
	private int day, month, year;
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public MyDate()
	{
		this(0);
	}
	
	public MyDate(int day)
	{
		this(day, 0);
	}
	
	public MyDate(int day, int month)
	{
		this(day, month, 0);
	}
	
	public MyDate(int day, int month, int year)
	{
		this.day=day; this.month=month; this.year=year;
	}
	
	public boolean isValid()
	{
		boolean isValid=true;
		int[] day_by_month = new int[] {31, 28, 31, 30, 31,30,31,30,31,30,31,30};
		if (this.month<1 || this.month>12) isValid=false;
		else if (this.day<1 || this.day>day_by_month[this.month-1]) isValid=false;
		return isValid;
	}
}
