package exam;

public class MyDate {
	private int day, month, year;
	
	public boolean isValid()
	{
		boolean rst = true;
		int[] day_ref = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(this.getDay() > day_ref[this.getMonth()-1])
		{
			rst = false;
		}
		return rst;
	}

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

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
	
}
