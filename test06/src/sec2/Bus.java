package sec2;

public class Bus {
	private int no=0; // 버스번호
	private int cnt=0; // 승객수
	private int money=0;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public Bus(int no)
	{
		this.no = no;
	}
	public void take(int money)
	{
		this.money += money;
		this.cnt++;
	}
	public void show()
	{
		System.out.println(this.no);
		System.out.println(this.cnt);
		System.out.println(this.money);
	}
	
}
