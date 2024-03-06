package sec2;

public class Subway {

	private int no=0;
	private String station="정보없음";
	private int money=0;
	private int cnt=0;
	
	//지하철노선번호를매개변수로받는생성자함수
	public Subway(int no)
	{
		this.no=no;
	}
	//지하철 승객이 탑승하면, 생기는 필드의 값 변환
	public void take(int money)
	{
		this.money+=money;
		this.cnt++;
	}
	//지하철 정보 출력
	public void show()
	{
		System.out.println(no);
		System.out.println(station);
		System.out.println(money);
		System.out.println(cnt);
	}
}
