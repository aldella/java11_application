package sec3;

public class Account {
	private int accountNum;
	private String bank;
	private String name;
	private int money;
	
	public Account() {}
	public Account(int accountNum, String bank, String name, int money) {
		super();
		this.accountNum = accountNum;
		this.bank = bank;
		this.name = name;
		this.money = money;
	}
	
	public void deposit(int accountNum, int money) {
		this.money += money;
		System.out.println(accountNum+"번 계좌에 "+money+"원이 입금되었습니다.");
		System.out.println("현재 잔액은 "+this.money+"원 입니다.");
	}
	
	public void withdraw(int accountNum, int money) {
		this.money -= money;
		System.out.println(accountNum+"번 계좌에 "+money+"원이 입금되었습니다.");
		System.out.println("현재 잔액은 "+this.money+"원 입니다.");
	}
	
	public void check() {
		System.out.println("은행명 : "+this.bank);
		System.out.println("예금주 : "+this.name);
		System.out.println("계좌번호 : "+this.accountNum);
		System.out.println("잔액 : "+this.money);
	}
	
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
